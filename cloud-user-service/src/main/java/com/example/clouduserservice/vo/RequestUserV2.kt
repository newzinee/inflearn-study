package com.example.clouduserservice.vo

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

class RequestUserV2(
    @NotNull(message = "email cannot be null")
    @Size(min = 2, message = "email 2 이상")
    @Email
    var email: String,

    @NotNull(message = "name cannot be null")
    @Size(min = 2, message = "name 2 이상")
    var name: String,

    @NotNull(message = "password cannot be null")
    @Size(min = 5, message = "pwd 5 이상")
    var pwd: String,
) {
}