package org.example.dtos;

import jakarta.validation.constraints.*;

public record DriverRequest(
        @NotBlank(message = "Name cannot be blank")
        String name,

        @NotBlank(message = "Lastname cannot be blank")
        String lastname,

        @NotNull(message = "Age cannot be null")
        @Min(18)
        @Max(100)
        Integer age,

        @NotNull(message = "Car ID cannot be null")
        Long carId,

        @NotNull(message = "Team ID cannot be null")
        Long teamId
) {
}
