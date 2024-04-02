package com.example.demo.webApi;

import com.example.demo.business.CountryService;
import com.example.demo.entity.Country;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@AllArgsConstructor
public class CountryController {
    private CountryService countryService;

    @GetMapping("/getMoreTwo")
    public List<Country> getCountryMoreThanTwoId(){
        return countryService.getCountryMoreThanTwoId();
    }
}
