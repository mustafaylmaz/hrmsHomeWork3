package homework.hrms.business.concretes;


import homework.hrms.business.abstracts.CandidateCheckService;
import homework.hrms.business.abstracts.CandidateService;
import homework.hrms.core.utilities.registerRule.registerRule;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessDataResult;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.dataAccess.CandidateDao;
import homework.hrms.entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateManager implements CandidateService {
    CandidateDao candidateDao;
    CandidateCheckService candidateCheckService;


    @Autowired
    public CandidateManager(CandidateDao candidateDao,CandidateCheckService candidateCheckService) {
        this.candidateDao = candidateDao;
       this.candidateCheckService = candidateCheckService;

    }

    @Override
    public Result add(Candidate candidate) {
       boolean isValid = registerRule.run(candidateCheckService.checkCandidate(candidate),
        candidateCheckService.checkMernis(candidate), candidateCheckService.checkEmailValidation(candidate));
        return new SuccessResult("Eklendi");
    }


    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Veri listelendi");
    }
}
