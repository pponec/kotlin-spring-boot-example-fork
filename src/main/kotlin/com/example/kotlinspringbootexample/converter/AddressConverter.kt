package com.example.kotlinspringbootexample.converter

import com.example.kotlinspringbootexample.dto.AddressDTO
import com.example.kotlinspringbootexample.model.Address
import com.example.kotlinspringbootexample.model.User
import com.example.kotlinspringbootexample.request.CreateAddressRequest
import com.example.kotlinspringbootexample.request.CreateUserRequest
import com.example.kotlinspringbootexample.request.UpdateAddressRequest

fun Address.toDTO(): AddressDTO {
    return AddressDTO(
        id = this.id,
        title = this.title,
        country = this.country,
        city = this.city,
        town = this.town,
        detail = this.detail,
    )
}

fun CreateAddressRequest.toAddress(user: User): Address {
    val my = this
    return Address().apply {
        this.user = user
        this.title = my.title
        this.country = my.country
        this.city = my.city
        this.town = my.town
        this.detail = my.detail
    }
}

fun UpdateAddressRequest.toAddress(existing: Address): Address {
    val my = this
    return Address().apply {
        this.id = existing.id
        this.user = existing.user
        this.title = my.title
        this.country = my.country
        this.city = my.city
        this.town = my.town
        this.detail = my.detail
    }
}
