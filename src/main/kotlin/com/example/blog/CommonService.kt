package com.example.blog

import org.springframework.stereotype.Service

@Service
interface CommonService {

    fun saveUser(user: User) : User

    fun findAllUsers() : List<User>

}