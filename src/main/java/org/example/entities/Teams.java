package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "teams", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "teams")
    private List<Drivers> drivers;
    private List<Cars> cars;


    public Teams(String name) {
        this.name = name;
    }
}
