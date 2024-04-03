package com.example.demo.webApi;


import com.example.demo.business.StateService;
import com.example.demo.entity.Country;
import com.example.demo.entity.State;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/state")
@AllArgsConstructor
public class StateController {
    private StateService stateService;

    @GetMapping("/getStateCountryId/{id}")
    @Cacheable(value="cacheGetCountryId")
    public List<State> getStateAccordingToCountrId(@PathVariable int id){
        return stateService.getStateAccoringToCountryId(id);
    }

    @GetMapping("/getStateStartKeywordA")
    public List<State> getStateStartKeywordA(){
        return stateService.getStateStartKeywordA();
    }

    @GetMapping("/getStateStartKeyword/{keyword}")
    public List<State> getStateStartKeywordA(@PathVariable String keyword){
        return stateService.getStateStartKeyword(keyword);
    }
    @GetMapping("/getStateDesc")
    @Cacheable(value="cacheGetDesc")
    public List<State> getStateDesc(){
        return stateService.getStateDesc();
    }

    @GetMapping("/getStateFromParam/{name}")
    public State getStateFromParam(@PathVariable String name){
        return stateService.getStateFromParam(name);
    }
    @GetMapping("/getStateCountry")
    public List<State> getStateCountry(){
        return stateService.getStateCountry();
    }
    @GetMapping("/groupByCountry")
    public List<String>  groupByCountry(){
        return stateService.groupByCountry();
    }
}
