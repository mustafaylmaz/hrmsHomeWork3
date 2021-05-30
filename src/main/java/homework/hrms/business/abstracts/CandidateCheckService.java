package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.Result;
import homework.hrms.entities.Candidate;
import org.springframework.stereotype.Service;


public interface CandidateCheckService {

    Result checkCandidate(Candidate candidate);
    Result checkMernis(Candidate candidate);
    Result checkEmailValidation(Candidate candidate);
}
