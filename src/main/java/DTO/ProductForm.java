package DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProductForm(
        @NotBlank(message = "Product name is Required")
        String name,
        @NotBlank(message = "Provide a type for your Product")
        @Size(max=50)
        String type,
        @NotBlank(message = "Provide a description for your product")
        @Size(max=255)
        String description,
        @NotNull(message="Price is required")
        @Min(value = 0, message = "Price cannot be lower than 0")
        Double price,
        @NotNull(message="Stocks is required")
        @Min(value = 0, message = "Stocks cannot be lower than 0")
        Integer stock
) {
}
