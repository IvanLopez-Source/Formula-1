package org.example.dtos;

public record CarResponse(
        Long id,
        String brand,
        String model,
        String color
) {
}
