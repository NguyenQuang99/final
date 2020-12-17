package com.codegym.exammodule4.repository;

import com.codegym.exammodule4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
