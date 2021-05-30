package homework.hrms.business.abstracts;

import homework.hrms.core.utilities.results.DataResult;
import homework.hrms.entities.City;

import java.util.List;

public interface CityService {

    DataResult<List<City>> getAll();

}
