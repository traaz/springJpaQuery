package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "states")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "state")
    @JsonIgnore
    private List<Person> personList;

    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country country;



}
