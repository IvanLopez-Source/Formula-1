package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "driver_id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private int age;


    @OneToMany(mappedBy = "drivers", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "drivers")
    private List<Cars> cars;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @JsonIgnoreProperties(value = "drivers")
    private Teams teams;

    public Drivers(String name, String lastname, int age, Teams teams ) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.teams =teams;

    }


}
