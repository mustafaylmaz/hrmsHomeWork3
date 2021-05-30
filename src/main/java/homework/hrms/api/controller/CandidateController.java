package homework.hrms.api.controller;


import homework.hrms.business.abstracts.CandidateService;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessDataResult;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
@Controller

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    CandidateService candidateService;
    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @PostMapping
    public Result add(@RequestBody Candidate candidate) {
        candidateService.add(candidate);
        return new SuccessResult("Eklendi");
    }

}
