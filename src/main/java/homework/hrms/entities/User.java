package homework.hrms.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "email_address")
    private String email;

    @Column(name = "password")
    private String password;



}
