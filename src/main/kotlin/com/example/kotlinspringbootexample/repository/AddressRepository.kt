package com.example.kotlinspringbootexample.repository

import com.example.kotlinspringbootexample.entity.Address
import com.example.kotlinspringbootexample.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository : JpaRepository<Address, Long> {

    fun getAddressByUser(user: User): List<Address>

}