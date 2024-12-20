
/*
package org.example.services;

import org.example.dtos.CarRequest;
import org.example.dtos.CarResponse;
import org.example.dtos.DriverRequest;
import org.example.dtos.DriverResponse;
import org.example.dtos.TeamRequest;
import org.example.dtos.TeamResponse;
import org.example.entities.Car;
import org.example.entities.Driver;
import org.example.exceptions.CarNotFoundException;
import org.example.exceptions.DriverNotFoundException;
import org.example.exceptions.TeamNotFoundException;
import org.example.mappers.CarMapper;
import org.example.mappers.DriverMapper;
import org.example.mappers.TeamMapper;
import org.example.repositories.CarRepository;
import org.example.repositories.DriverRepository;
import org.example.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverTeamCarService {

    private final DriverRepository driverRepository;
    private final CarRepository carRepository;
    private final TeamRepository teamRepository;

    public DriverTeamCarService(DriverRepository driverRepository, CarRepository carRepository, TeamRepository teamRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.teamRepository = teamRepository;
    }

    // Driver Operations

    public DriverResponse createDriver(DriverRequest driverRequest) {
        Car car = carRepository.findById(driverRequest.carId())
                .orElseThrow(() -> new CarNotFoundException("Car not found"));
        Team team = teamRepository.findById(driverRequest.teamId())
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));

        Driver driver = DriverMapper.fromRequest(driverRequest);
        Driver savedDriver = driverRepository.save(driver);
        return DriverMapper.toResponse((java.sql.Driver) savedDriver);
    }

    public DriverResponse findDriverById(Long id) {
        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new DriverNotFoundException("Driver not found"));
        return DriverMapper.toResponse((java.sql.Driver) driver);
    }

    public List<DriverResponse> getAllDrivers() {
        List<Driver> driverList = driverRepository.findAll();
        return driverList.stream().map(DriverMapper::toResponse).toList();
    }

    public void deleteDriverById(Long id) {
        driverRepository.deleteById(id);
    }

    public DriverResponse updateDriver(Long id, DriverRequest driverRequest) {
        Driver driverToUpdate = driverRepository.findById(id)
                .orElseThrow(() -> new DriverNotFoundException("Driver not found"));

        Car car = carRepository.findById(driverRequest.carId())
                .orElseThrow(() -> new CarNotFoundException("Car not found"));
        Team team = teamRepository.findById(driverRequest.teamId())
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));

        driverToUpdate.setName(driverRequest.name());
        driverToUpdate.setLastname(driverRequest.lastname());
        driverToUpdate.setAge(driverRequest.age());
        driverToUpdate.setCar(car);
        driverToUpdate.setTeam(team);

        Driver updatedDriver = driverRepository.save(driverToUpdate);
        return DriverMapper.toResponse((java.sql.Driver) updatedDriver);
    }

    // Car Operations

    public CarResponse createCar(CarRequest carRequest) {
        Car car = CarMapper.fromRequest(carRequest);
        Car savedCar = carRepository.save(car);
        return CarMapper.toResponse(savedCar);
    }

    public CarResponse findCarById(Long id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException("Car not found"));
        return CarMapper.toResponse(car);
    }

    public List<CarResponse> getAllCars() {
        List<Car> carList = carRepository.findAll();
        return carList.stream().map(CarMapper::toResponse).toList();
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    public CarResponse updateCar(Long id, CarRequest carRequest) {
        Car carToUpdate = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException("Car not found"));

        carToUpdate.setBrand(carRequest.brand());
        carToUpdate.setModel(carRequest.model());
        carToUpdate.setColor(carRequest.color());

        Car updatedCar = carRepository.save(carToUpdate);
        return CarMapper.toResponse(updatedCar);
    }

    // Team Operations

    public TeamResponse createTeam(TeamRequest teamRequest) {
        Team team = TeamMapper.toResponse(teamRequest);
        Team savedTeam = teamRepository.save(team);
        return TeamMapper.toResponse(savedTeam);
    }

    public TeamResponse findTeamById(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));
        return TeamMapper.toResponse(team);
    }

    public List<TeamResponse> getAllTeams() {
        List<Team> teamList = teamRepository.findAll();
        return teamList.stream().map(TeamMapper::toResponse).toList();
    }

    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }

    public TeamResponse updateTeam(Long id, TeamRequest teamRequest) {
        Team teamToUpdate = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));

        teamToUpdate.setName(teamRequest.name());
        teamToUpdate.setCountry(teamRequest.country());

        Team updatedTeam = teamRepository.save(teamToUpdate);
        return TeamMapper.toResponse(updatedTeam);
    }
}
*/