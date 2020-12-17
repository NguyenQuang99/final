package com.codegym.exammodule4.service.city;

import com.codegym.exammodule4.model.City;
import com.codegym.exammodule4.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City save(City model) {
        return cityRepository.save(model);
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City getOne(Long id) {
        return cityRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}
