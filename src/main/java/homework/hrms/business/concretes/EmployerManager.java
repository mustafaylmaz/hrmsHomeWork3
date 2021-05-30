package homework.hrms.business.concretes;

import homework.hrms.business.abstracts.EmployerCheckService;
import homework.hrms.business.abstracts.EmployerService;
import homework.hrms.core.utilities.registerRule.registerRule;
import homework.hrms.core.utilities.results.*;
import homework.hrms.dataAccess.EmployerDao;
import homework.hrms.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    EmployerCheckService employerCheckService;
    EmployerDao EmployerDao;

    @Autowired
    public EmployerManager(EmployerCheckService employerCheckService, EmployerDao employerDao) {
        this.employerCheckService = employerCheckService;
        this.EmployerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
        boolean isValid = registerRule.run(employerCheckService.checkEmployer(employer), employerCheckService.checkEmailValidation(employer.getEmail()));
        if (isValid) {
            EmployerDao.save(employer);
            return new SuccessResult("eklendi");
        }
        return new ErrorResult("Eklenemedi");

    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.EmployerDao.findAll());
    }
}
