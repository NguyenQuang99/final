package com.codegym.exammodule4.service.country;

import com.codegym.exammodule4.model.Country;
import com.codegym.exammodule4.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public Country save(Country model) {
        return countryRepository.save(model);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country getOne(Long id) {
        return countryRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }

}
