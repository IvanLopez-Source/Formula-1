package org.example.controllers;

import org.example.dtos.DriverRequest;
import org.example.dtos.DriverResponse;
import org.example.services.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driversService;

    public DriverController(DriverService driversService) {
        this.driversService = driversService;
    }

    @PostMapping
    public ResponseEntity<DriverResponse> createDriver(@RequestBody DriverRequest driverRequest) {
        DriverResponse driverResponse = driversService.createDriver(driverRequest);
        return ResponseEntity.ok(driverResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverResponse> getDriverById(@PathVariable Long id) {
        DriverResponse driverResponse = driversService.findDriverById(id);
        return ResponseEntity.ok(driverResponse);
    }

    @GetMapping
    public List<DriverResponse> getAllDrivers() {
        return driversService.getAllDrivers();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DriverResponse> updateDriver(@PathVariable Long id, @RequestBody DriverRequest driversRequest) {
        DriverResponse driverResponse = driversService.updateDriver(id, driversRequest);
        return ResponseEntity.ok(driverResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable Long id) {
        driversService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
