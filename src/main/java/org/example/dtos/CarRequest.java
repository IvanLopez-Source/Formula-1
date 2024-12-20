package org.example.dtos;

import jakarta.validation.constraints.*;

public record CarRequest(
        @NotBlank(message = "Brand cannot be blank")
        String brand,

        @NotBlank(message = "Model cannot be blank")
        String model,

        @NotBlank(message = "Color cannot be blank")
        String color
) {
}
