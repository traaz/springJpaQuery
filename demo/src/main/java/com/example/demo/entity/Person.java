package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "people")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country country;


}
