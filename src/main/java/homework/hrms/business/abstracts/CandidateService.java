package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.entities.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CandidateService {


    Result add(Candidate candidate);

    DataResult<List<Candidate>> getAll();

}
