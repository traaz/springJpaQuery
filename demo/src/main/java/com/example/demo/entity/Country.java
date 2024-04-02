package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<State> stateList;

    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<Person> personList;

}
