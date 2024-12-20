package org.example.services;

import org.example.dtos.CarRequest;
import org.example.dtos.CarResponse;
import org.example.entities.Car;
import org.example.mappers.CarMapper;
import org.example.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarResponse createCar(CarRequest carRequest) {
        Car car = CarMapper.fromRequest(carRequest);
        Car savedCar = carRepository.save(car);
        return CarMapper.toResponse(savedCar);
    }


/*
    public List<CarResponse> getAllCars() {
        List<Car> carsList = carRepository.findAll();
        return carsList.stream()
                .map(CarMapper::toResponse)
                .toList();
    }
*/
    public List<CarResponse> getAllCars() {

        List<Car> carList = carRepository.findAll();
        return carList.stream()
                .map(car -> CarMapper.toResponse(car)).toList();
    }


    public CarResponse findCarById(Long id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Car not found"));
        return CarMapper.toResponse(car);
    }

    public void deleteCar(Long id) {
        if (!carRepository.existsById(id)) {
            throw new IllegalArgumentException("Car not found");
        }
        carRepository.deleteById(id);
    }
}
