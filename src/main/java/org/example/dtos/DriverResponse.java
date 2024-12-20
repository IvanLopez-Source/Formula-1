package org.example.dtos;

public record DriverResponse(
        Long id,
        String name,
        String lastname,
        Integer age,
        Long carId,
        Long teamId
) {
}
