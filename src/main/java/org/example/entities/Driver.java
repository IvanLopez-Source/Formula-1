package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;
    private int age;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Team team;

    // Constructor con los parámetros esperados
    public Driver(String name, String lastname, int age, Car car, Team team) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.car = car;
        this.team = team;
    }

    // Otros constructores, getters, setters, etc.
}
