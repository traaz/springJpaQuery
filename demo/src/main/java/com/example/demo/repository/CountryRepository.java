package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query(value = "Select u from Country u where u.id > 2")
    List<Country> getCountryMoreThanTwoId();
}
