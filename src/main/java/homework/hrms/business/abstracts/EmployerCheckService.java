package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.Result;
import homework.hrms.entities.Employer;

public interface EmployerCheckService {
    Result checkEmployer(Employer employer);
    Result checkEmailValidation(String email);
}
