package com.project.HotelsInCities.servicies;

import com.project.HotelsInCities.entities.City;
import com.project.HotelsInCities.entities.Hotel;
import com.project.HotelsInCities.repos.CityRepository;
import com.project.HotelsInCities.repos.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.*;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    CityRepository cityRepository;

    public Set<String> getAllHotels(Integer cityId){
        Set<String> hotelName = new HashSet<>();
        if(cityRepository.existsById(cityId)){
        Set<Hotel> hotels = new HashSet<>();
        hotelRepository.findByCityId(cityId)
                .forEach(hotels :: add);
        hotels.forEach(hotel -> hotelName.add(hotel.getName()));
        }
        else hotelName.add("No City With id = " + cityId);
        return hotelName;
    }


    public ArrayList<String> getAllNearestHotels(Integer cityId) {
        ArrayList<String> hotelName;
       hotelName=  getAllNearestHotels(cityId , 3)  ;
        return hotelName;
    }


    public ArrayList<String> getAllNearestHotels(Integer cityId , Integer numberOfHotels) {
        ArrayList<String> hotelName = new ArrayList<String>();
        if(cityRepository.existsById(cityId))
        {
            City city = cityRepository.findById(cityId).get();
            ArrayList<Hotel> hotels = new ArrayList<>();
        hotelRepository.findAll()
                .forEach(hotels :: add);
        if(hotels.size() < numberOfHotels){
            hotelName.add("There is just " + hotels.size() + " hotels");
            numberOfHotels = hotels.size();
        }

        city.setHotelDistances(hotels);
        hotels.forEach(hotel -> hotelRepository.save(hotel));
        Collections.sort(hotels);

            for(int i = 0 ; i < numberOfHotels ; i++){
                hotelName.add(hotels.get(i).getName());
            }}
        else hotelName.add("No City With id = " + cityId);
        return hotelName;
    }

}
