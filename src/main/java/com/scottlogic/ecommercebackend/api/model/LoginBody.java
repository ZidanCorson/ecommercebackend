package com.scottlogic.ecommercebackend.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginBody {

    @NotBlank
    @NotNull
    private String username;
    @NotBlank
    @NotNull
    private String password;
}
