package com.project.HotelsInCities.controllers;

import com.project.HotelsInCities.servicies.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Set;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @RequestMapping(method = GET ,value = "/cities/{id}/hotels")
    public Set<String> getAllHotels(@PathVariable Integer id){
        return hotelService.getAllHotels(id);
    }

    @RequestMapping(method = GET, value = "/cities/{id}/nearestHotels")
    public ArrayList<String> getAllNearestHotels(@PathVariable Integer id){
        return  hotelService.getAllNearestHotels(id);
    }

    @RequestMapping(method = GET, value = "/cities/{id}/nearestHotels/{number}")
    public ArrayList<String> getAllNearestNumberHotels(@PathVariable Integer id , @PathVariable Integer number){
        return  hotelService.getAllNearestHotels(id , number);
    }
}
