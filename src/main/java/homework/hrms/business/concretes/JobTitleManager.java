package homework.hrms.business.concretes;

import homework.hrms.business.abstracts.JobTitleService;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.dataAccess.JobTitleDao;
import homework.hrms.entities.JobAdvertisement;
import homework.hrms.entities.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    @Autowired
    JobTitleDao jobTitleDao;


    @Override
    public Result add(JobTitle jobTitle) {

        jobTitleDao.save(jobTitle);
        return new SuccessResult("is pozisyonu eklendi");
    }



}
