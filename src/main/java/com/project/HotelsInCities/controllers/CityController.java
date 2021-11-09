package com.project.HotelsInCities.controllers;

import com.project.HotelsInCities.servicies.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping(method = GET ,value = "/cities")
    public List<String> getAllCities(){
        return cityService.getAllCities();
    }


}