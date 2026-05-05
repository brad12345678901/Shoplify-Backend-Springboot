package DTO;

import jakarta.validation.constraints.NotBlank;

public record CategoryForm (
    @NotBlank(message = "Provide a Category Name")
    String name
){}
