package com.financialtargets.accountservice.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public record AccountCreateDTO(
        @JsonProperty("name")
        @NotBlank
        String name,

        @JsonProperty("type")
        @NotBlank
        String type,

        @JsonProperty("isMain")
        boolean isMain
)
{ }
