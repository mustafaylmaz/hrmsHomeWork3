package homework.hrms.business.concretes;

import homework.hrms.business.abstracts.EmployerCheckService;
import homework.hrms.core.utilities.results.ErrorResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.entities.Employer;
import org.springframework.stereotype.Service;

@Service
public class EmployerCheckManager implements EmployerCheckService {
    @Override
    public Result checkEmployer(Employer employer) {
        if(employer.getEmail() == null && employer.getCompany_name() == null
                && employer.getWeb_address() == null && employer.getPassword() == null)
        {
            return new ErrorResult("Bos alanlari doldurunuz");
        }
        return new SuccessResult("Kontrol edildi");
    }

    @Override
    public Result checkEmailValidation(String email) {
        return new SuccessResult("dogrulandi");
    }
}
