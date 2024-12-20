package org.example.dtos;

import jakarta.validation.constraints.*;

public record TeamRequest(
        @NotBlank(message = "Name cannot be blank")
        String name,

        @NotBlank(message = "Country cannot be blank")
        String country
) {
}
