package com.example.kotlinspringbootexample.controller

import com.example.kotlinspringbootexample.converter.toDto
import com.example.kotlinspringbootexample.dto.UserDto
import com.example.kotlinspringbootexample.request.CreateUserRequest
import com.example.kotlinspringbootexample.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getUsers(): ResponseEntity<List<UserDto>> =
        ResponseEntity.ok(userService.getAllUsers().map { it.toDto() })

    @GetMapping(("/{id}"))
    fun getUserByID(@PathVariable id: Long): ResponseEntity<UserDto> =
        ResponseEntity.ok(userService.getUserByID(id).toDto())

    @PostMapping
    fun getUserByID(@RequestBody createUserRequest: CreateUserRequest): ResponseEntity<UserDto> {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(userService.createUser(createUserRequest).toDto())
    }

}

