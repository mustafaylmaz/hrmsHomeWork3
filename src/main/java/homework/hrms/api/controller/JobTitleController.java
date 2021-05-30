package homework.hrms.api.controller;

import homework.hrms.business.abstracts.EmployerService;
import homework.hrms.business.abstracts.JobTitleService;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.entities.Employer;
import homework.hrms.entities.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/jobTitle")
public class JobTitleController {
JobTitleService jobTitleService;

@Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }


    @GetMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle) {
        jobTitleService.add(jobTitle);
        return new SuccessResult("Eklendi");
    }

}
