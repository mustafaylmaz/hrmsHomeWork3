package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;

import homework.hrms.entities.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();

    Result add(JobAdvertisement jobAdvertisement);

   // List<JobAdvertisementDto> jobAdvertisementToDto(List<JobAdvertisement> jobAdvertisements);

    DataResult<List<JobAdvertisement>> findById(int id);
    DataResult<List<JobAdvertisement>> getByActiveTrue();
    DataResult<List<JobAdvertisement>> getByActiveTrueOrderByReleaseDate();
    DataResult<List<JobAdvertisement>> getByActiveTrueAndEmployerId(int employerId);
    DataResult<JobAdvertisement> getById(int id);

}
