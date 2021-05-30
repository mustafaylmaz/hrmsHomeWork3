package homework.hrms.api.controller;

import homework.hrms.business.abstracts.CandidateService;
import homework.hrms.business.abstracts.EmployerService;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.entities.Candidate;
import homework.hrms.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    EmployerService EmployerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.EmployerService = employerService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return this.EmployerService.getAll();
    }

    @PostMapping
    public Result add(@RequestBody Employer employer) {
        EmployerService.add(employer);
        return new SuccessResult("Eklendi");
    }

}