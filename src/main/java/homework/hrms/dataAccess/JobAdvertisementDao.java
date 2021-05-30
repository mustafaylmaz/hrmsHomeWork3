package homework.hrms.dataAccess;

import homework.hrms.entities.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    JobAdvertisement getByJobAdvertisementName(String jobAdvertisementName);

    List<JobAdvertisement> findAllByIsActiveTrue();
    List<JobAdvertisement> findById(int id);
    //   List<JobAdvertisement> findAllByEmployerIdAndActiveTrue(int employerId);
  //  List<JobAdvertisement> findAllByActiveTrueOrderByCreatedDateDesc();

}
