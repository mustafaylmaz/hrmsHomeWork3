package homework.hrms.business.concretes;

import homework.hrms.business.abstracts.JobAdvertisementService;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.Result;
import homework.hrms.core.utilities.results.SuccessDataResult;
import homework.hrms.core.utilities.results.SuccessResult;
import homework.hrms.dataAccess.JobAdvertisementDao;

import homework.hrms.entities.JobAdvertisement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    JobAdvertisementDao jobAdvertisementDao;
    ModelMapper modelMapper;

    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, ModelMapper modelMapper) {
        this.jobAdvertisementDao = jobAdvertisementDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Listelendi");

    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> findById(int id) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findById(id));
    }

    /*@Override
   public List<JobAdvertisementDto> jobAdvertisementToDto(List<JobAdvertisement> jobAdvertisements) {
        return jobAdvertisements.stream().map
                (jobAdvertisement -> modelMapper.map(jobAdvertisement,JobAdvertisementDto.class))
                .collect(Collectors.toList());
    }*/

    @Override
    public DataResult<List<JobAdvertisement>> getByActiveTrue() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByActiveTrueOrderByReleaseDate() {
        return null;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByActiveTrueAndEmployerId(int employerId) {
        return null;
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return null;
    }

}
