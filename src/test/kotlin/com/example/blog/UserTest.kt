package com.example.blog

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    @Disabled("Test fails")
    fun createUser() {
        val userClass = User::class
        val userObject = userClass.objectInstance ?: throw IllegalStateException("Test: no construtor")
        println("userObject: $userObject")
    }

    @Test
    @Disabled("Test fails")
    fun createUser2() {
        val userClass = User2::class
        val userObject = userClass.objectInstance ?: throw IllegalStateException("Test: no construtor")
        println("userObject: $userObject")
    }

    @Test
    @Disabled("Test fails")
    fun createUser2b() {
        val userClass = (User2::class as Any).javaClass
        val userObject = userClass.getDeclaredConstructor().newInstance() ?: throw IllegalStateException("Test: no construtor")
        println("userObject: $userObject")
    }

    class User2 {
        var id: Long? = null
        var name: String

        constructor(id: Long?) {
            this.id = 1L
            this.name = "test"
        }
    }

}