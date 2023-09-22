package com.example.kotlinspringbootexample.dto

import io.swagger.v3.oas.annotations.media.Schema

data class AddressDto(
    val id: Long? = null,
    @Schema(example = "home" )
    val title: String,
    @Schema(example = "United Kingdom" )
    val country: String,
    @Schema(example = "London, NW1 6XE" )
    val city: String,
    @Schema(example = "Black" )
    val town: String? = null,
    @Schema(example = "221B Baker Street" )
    val detail: String
)