package com.project.HotelsInCities.servicies;

import com.project.HotelsInCities.entities.City;
import com.project.HotelsInCities.repos.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;


    public List<String> getAllCities(){
        List<City> cities = new ArrayList<City>();
        cityRepository.findAll()
                .forEach(cities :: add);

        List<String> names =new ArrayList<String>();
        cities.forEach(city -> names.add(city.getName()));
        return names;
    }


}