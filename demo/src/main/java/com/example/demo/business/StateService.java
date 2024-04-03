package com.example.demo.business;


import com.example.demo.entity.Country;
import com.example.demo.entity.State;
import com.example.demo.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StateService {

    private StateRepository stateRepository;

    public List<State> getStateAccoringToCountryId(int id){
        System.out.println("db gidildi");
        //bunu eklememizin sebebi ilk kez calistirkan db gidildi mesajı gormek ikinci calistirinca gelmemesi lazim cunku on bellekten alacaz controller tarafinda
        return stateRepository.findByCountryId(id);
    }

    public List<State> getStateStartKeywordA(){
        return stateRepository.getStateStartKeywordA();
    }

    public List<State> getStateStartKeyword(String keyword){
        return stateRepository.getStateStartKeyword(keyword);
    }

    public List<State> getStateDesc(){
        return stateRepository.getStateDesc();
    }

    public State getStateFromParam(String name){
        return stateRepository.getStateFromParam(name);
    }
    public List<State> getStateCountry(){
        return stateRepository.getStateCountry();
    }

    public List<String>  groupByCountry(){
        return stateRepository.groupByCountry();
    }
}
