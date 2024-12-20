package org.example.mappers;


import org.example.dtos.DriverRequest;
import org.example.dtos.DriverResponse;
import org.example.entities.Car;
import org.example.entities.Driver;
import org.example.entities.Team;

public class DriverMapper {

    public static Driver fromRequest(DriverRequest driverRequest, Car car, Team team){
        return new Driver(driverRequest.name(), driverRequest.lastname(), driverRequest.age(), car, team
        );
    }
    public static DriverResponse toResponse(Driver driver){
        return new DriverResponse(
                driver.getId(),
                driver.getName(),
                driver.getLastname(),
                driver.getAge(),
                driver.getCar().getId(),
                driver.getTeam().getId()
        );
    }

}
