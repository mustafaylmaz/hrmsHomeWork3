package homework.hrms.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisements")

public class JobAdvertisement {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "job_advertisement_name")
    private String jobAdvertisementName;


    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "description")
    private String description;


    @Column(name = "salary_min")
    private int salaryMin;


    @Column(name = "salary_max")
    private int salaryMax;

    @Column(name = "open_position_count")
    private int openPositionCount;

    @Column(name = "deadline")
    private Date deadLine;

    @Column(name = "is_open")
    private boolean isOpen;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobTitle jobTitle;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "published_at")
    private Date publishedAt;

}
