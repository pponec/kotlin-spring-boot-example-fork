package com.example.kotlinspringbootexample.dto

data class UserDto(
    val id: Long? = null,
    val username: String,
    val email: String,
    val name: String,
    val surname: String? = null,
)