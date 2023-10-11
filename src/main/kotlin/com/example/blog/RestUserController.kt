package com.example.blog

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class RestUserController(
    var commonService: CommonService,
) {
    @GetMapping("/echo")
    fun echo() =
        "echo"

    @PostMapping
    fun createUser(@RequestParam login: String) =
        commonService.saveUser(User(login = login, firstname = login, lastname = login));


    @GetMapping("/list")
    fun listAllUsers(): List<User> =
        commonService.findAllUsers()

}