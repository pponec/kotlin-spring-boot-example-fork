package com.example.kotlinspringbootexample.dto

import io.swagger.v3.oas.annotations.media.Schema

data class UserDto(
    @Schema( example = "1")
    val id: Long? = null,
    @Schema( example = "sherlock.holmes")
    val username: String,
    @Schema( example = "sherlock.holmes@test.test")
    val email: String,
    @Schema( example = "Sherlock")
    val name: String,
    @Schema( example = "Holmes")
    val surname: String? = null,
)