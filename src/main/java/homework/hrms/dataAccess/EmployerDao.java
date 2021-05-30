package homework.hrms.dataAccess;


import homework.hrms.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerDao  extends JpaRepository<Employer,Integer> { }

