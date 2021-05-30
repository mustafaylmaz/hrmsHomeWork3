package homework.hrms.api.controller;


import homework.hrms.business.abstracts.JobAdvertisementService;
import homework.hrms.core.utilities.results.DataResult;

import homework.hrms.entities.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

    JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("getAll")
    DataResult<List<JobAdvertisement>> getAll() {
        return jobAdvertisementService.getAll();
    }

    @GetMapping("getById")
    DataResult<List<JobAdvertisement>> getById(int id)
    {
        return jobAdvertisementService.findById(id);
    }

    @GetMapping("getByActiveTrue")

    DataResult<List<JobAdvertisement>> getByActiveTrue() {
        return jobAdvertisementService.getByActiveTrue();
    }

}
