package com.project.HotelsInCities.repos;

import com.project.HotelsInCities.entities.Hotel;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface HotelRepository  extends PagingAndSortingRepository<Hotel, Integer > {

    List<Hotel> findByCityId(Integer cityId);
}