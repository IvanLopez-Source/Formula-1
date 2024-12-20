
/*
package org.example.controllers;

import org.example.dtos.*;
import org.example.services.DriverTeamCarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverTeamCarController {

    private final DriverTeamCarService service;

    public DriverTeamCarController(DriverTeamCarService service) {
        this.service = service;
    }

    // Driver endpoints
    @PostMapping("/drivers")
    public ResponseEntity<DriverResponse> createDriver(@RequestBody DriverRequest request) {
        return new ResponseEntity<>(service.createDriver(request), HttpStatus.CREATED);
    }

    @GetMapping("/drivers/{id}")
    public ResponseEntity<DriverResponse> getDriver(@PathVariable Long id) {
        return new ResponseEntity<>(service.findDriverById(id), HttpStatus.OK);
    }

    @GetMapping("/drivers")
    public ResponseEntity<List<DriverResponse>> getAllDrivers() {
        return new ResponseEntity<>(service.getAllDrivers(), HttpStatus.OK);
    }

    @PutMapping("/drivers/{id}")
    public ResponseEntity<DriverResponse> updateDriver(@PathVariable Long id, @RequestBody DriverRequest request) {
        return new ResponseEntity<>(service.updateDriver(id, request), HttpStatus.OK);
    }

    @DeleteMapping("/drivers/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable Long id) {
        service.deleteDriverById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Car endpoints
    @PostMapping("/cars")
    public ResponseEntity<CarResponse> createCar(@RequestBody CarRequest request) {
        return new ResponseEntity<>(service.createCar(request), HttpStatus.CREATED);
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<CarResponse> getCar(@PathVariable Long id) {
        return new ResponseEntity<>(service.findCarById(id), HttpStatus.OK);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<CarResponse>> getAllCars() {
        return new ResponseEntity<>(service.getAllCars(), HttpStatus.OK);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<CarResponse> updateCar(@PathVariable Long id, @RequestBody CarRequest request) {
        return new ResponseEntity<>(service.updateCar(id, request), HttpStatus.OK);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        service.deleteCarById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Team endpoints
    @PostMapping("/teams")
    public ResponseEntity<TeamResponse> createTeam(@RequestBody TeamRequest request) {
        return new ResponseEntity<>(service.createTeam(request), HttpStatus.CREATED);
    }

    @GetMapping("/teams/{id}")
    public ResponseEntity<TeamResponse> getTeam(@PathVariable Long id) {
        return new ResponseEntity<>(service.findTeamById(id), HttpStatus.OK);
    }

    @GetMapping("/teams")
    public ResponseEntity<List<TeamResponse>> getAllTeams() {
        return new ResponseEntity<>(service.getAllTeams(), HttpStatus.OK);
    }

    @PutMapping("/teams/{id}")
    public ResponseEntity<TeamResponse> updateTeam(@PathVariable Long id, @RequestBody TeamRequest request) {
        return new ResponseEntity<>(service.updateTeam(id, request), HttpStatus.OK);
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable Long id) {
        service.deleteTeamById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
*/