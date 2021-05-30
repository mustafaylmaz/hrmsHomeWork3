package homework.hrms.business.concretes;

import homework.hrms.business.abstracts.CityService;
import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.core.utilities.results.SuccessDataResult;
import homework.hrms.dataAccess.CityDao;
import homework.hrms.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {
    CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Listelendi");
    }
}
