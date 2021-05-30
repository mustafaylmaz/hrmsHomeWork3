package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.entities.Employer;

import java.util.List;

public interface EmployerService {

    Result add(Employer employer);
    DataResult<List<Employer>> getAll();

}
