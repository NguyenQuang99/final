package com.codegym.exammodule4.repository;

import com.codegym.exammodule4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
}
