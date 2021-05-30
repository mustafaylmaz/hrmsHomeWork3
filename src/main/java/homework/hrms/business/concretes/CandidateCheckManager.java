package homework.hrms.business.concretes;


import homework.hrms.business.abstracts.CandidateCheckService;
import homework.hrms.core.utilities.results.ErrorResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.entities.Candidate;
import org.springframework.stereotype.Service;
@Service
public class CandidateCheckManager implements CandidateCheckService {


    @Override
    public Result checkCandidate(Candidate candidate) {
        if (candidate.getBirth_date()!=null &&
                candidate.getFirst_name()!=null && candidate.getLast_name() != null
            && candidate.getIdentification_number() != null
            && candidate.getBirth_date() != null && candidate.getEmail() != null
            && candidate.getPassword() != null) {
            return new SuccessResult("User not null. Ok");
        }
        return new ErrorResult("Failed");
    }


    @Override
    public Result checkMernis(Candidate candidate) {
        return new SuccessResult("aday dogrulandi.");
    }

    @Override
    public Result checkEmailValidation(Candidate candidate) {

            boolean isValidated=true;
            if (isValidated) {
                return new SuccessResult("Mail dogrulandi.");
            }
        return new ErrorResult("Dogrulama basarisiz");
    }
}
