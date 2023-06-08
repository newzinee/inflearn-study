package com.example.clouduserservice.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestUser {

    @NotNull(message = "email cannot be null")
    @Size(min = 2, message = "email 2 이상")
    @Email
    private String email;

    @NotNull(message = "name cannot be null")
    @Size(min = 2, message = "name 2 이상")
    private String name;

    @NotNull(message = "password cannot be null")
    @Size(min = 5, message = "pwd 5 이상")
    private String pwd;
}
