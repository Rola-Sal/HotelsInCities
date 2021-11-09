package com.project.HotelsInCities.repos;

import com.project.HotelsInCities.entities.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {
    public City findByName(String cityName);
}