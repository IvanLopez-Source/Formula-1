package org.example.services;

import org.example.dtos.DriverRequest;
import org.example.dtos.DriverResponse;
import org.example.entities.Car;
import org.example.entities.Driver;


import org.example.entities.Team;
import org.example.exceptions.DriverNotFoundException;
import org.example.mappers.DriverMapper;
import org.example.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driversRepository) {

        this.driverRepository = driversRepository;

    }

    // Método para crear un nuevo Driver
    public DriverResponse createDriver(DriverRequest driverRequest) {
        Driver Driver = DriverMapper.fromRequest(driverRequest, new Car(), new Team());
        Driver savedDriver = driverRepository.save(Driver);
        return DriverMapper.toResponse(savedDriver);
    }

    // Método para obtener un Driver por su ID
    public DriverResponse findDriverById(Long id) {
        Optional<Driver> optionalDriver = driverRepository.findById(id);
        if (optionalDriver.isEmpty()) {
            throw new DriverNotFoundException("Driver not found");
        }
        return DriverMapper.toResponse( optionalDriver.get());
    }

    // Método para obtener todos los Drivers


    public List<DriverResponse> getAllDrivers() {

        List<Driver> driverList = driverRepository.findAll();
        return driverList.stream()
                .map(driver -> DriverMapper.toResponse( driver)).toList();
    }

    public List<DriverResponse> searchByName(String name) {

        List<Driver> driverList = driverRepository.findLikeName(name);

        return driverList.stream()
                .map(driver -> DriverMapper.toResponse(driver)).toList();
    }


    // Método para eliminar un Driver por su ID
    public void deleteById(Long id) {
        Optional<Driver> optionalDriver = driverRepository.findById(id);
        if (optionalDriver.isEmpty()) {
            throw new DriverNotFoundException("Driver not found");
        }

        driverRepository.deleteById(id);
    }

    // Método para actualizar un Driver por su ID
    public DriverResponse updateDriver(Long id, DriverRequest driversRequest) {
        Optional<Driver> driverToUpdate = driverRepository.findById(id);
        if (driverToUpdate.isEmpty()) {
            throw new DriverNotFoundException("Driver Not Found");
        }

        Driver driver = driverToUpdate.get();
        driver.setName(driversRequest.name());
        driver.setLastname(driversRequest.lastname());
        driver.setAge(driversRequest.age());


        Driver updatedDriver = driverRepository.save(driver);
        return DriverMapper.toResponse(updatedDriver);
    }

    // Método para contar el número total de Drivers
    public long countDrivers() {
        return driverRepository.count();
    }
}
