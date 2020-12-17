package com.codegym.exammodule4.formatter;

import com.codegym.exammodule4.model.Country;
import com.codegym.exammodule4.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CountryFormatter implements Formatter<Country> {
    private ICountryService countryService;

    @Autowired
    public CountryFormatter (ICountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public Country parse(String text, Locale locale) throws ParseException {
        return countryService.getOne(Long.parseLong(text));
    }

    @Override
    public String print(Country object, Locale locale) {
        return "[" + object.getId() + " , " + object.getName() + ']';
    }
}
