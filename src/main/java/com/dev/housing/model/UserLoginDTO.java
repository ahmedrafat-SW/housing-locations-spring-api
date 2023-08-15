package com.dev.housing.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserLoginDTO  {

    @NotNull(message = "Email required")
    @Size(min = 1, message = "Email required")
    @Email(message = "Email is not well formatted")
    private String email;

    @NotNull(message = "Password required")
    @Size(min = 5, message = "password must be more than 5 characters")
    private String password;
}
