package org.example.mappers;

import org.example.dtos.CarRequest;
import org.example.dtos.CarResponse;
import org.example.entities.Car;

public class CarMapper {

    public static Car fromRequest(CarRequest carRequest) {
        return new Car(
                carRequest.brand(),
                carRequest.model(),
                carRequest.color()
        );
    }

    public static CarResponse toResponse(Car car) {
        return new CarResponse(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getColor()
        );
    }
}
