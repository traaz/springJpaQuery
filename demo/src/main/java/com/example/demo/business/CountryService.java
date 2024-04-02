package com.example.demo.business;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CountryService {
    private CountryRepository countryRepository;

    public List<Country> getCountryMoreThanTwoId(){
        return countryRepository.getCountryMoreThanTwoId();
    }

}
