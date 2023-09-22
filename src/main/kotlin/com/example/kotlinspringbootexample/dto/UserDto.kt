package com.example.kotlinspringbootexample.dto

import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Schema

data class UserDto(
    val id: Long? = null,
    @Schema(example = "sherlock.holmes")
    val username: String,
    @Schema(example = "sherlock.holmes@test.test")
    val email: String,
    @Schema(example = "Sherlock")
    val name: String,
    @Schema(example = "Holmes" )
    val surname: String? = null,
)