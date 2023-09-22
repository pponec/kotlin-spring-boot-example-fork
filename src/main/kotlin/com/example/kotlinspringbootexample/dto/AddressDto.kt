package com.example.kotlinspringbootexample.dto

import io.swagger.v3.oas.annotations.media.Schema

data class AddressDto(
    @Schema( example = "1")
    val id: Long? = null,
    @Schema( example = "Home")
    val title: String,
    @Schema( example = "United Kingdom")
    val country: String,
    @Schema( example = "London, NW1 6XE")
    val city: String,
    @Schema( example = "221B Baker Street")
    val town: String? = null,
    @Schema( example = "townhouse")
    val detail: String
)