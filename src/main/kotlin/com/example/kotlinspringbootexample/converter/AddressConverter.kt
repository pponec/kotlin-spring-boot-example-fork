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
        detail = this.detail
    )
}

fun CreateAddressRequest.toAddress(user: User): Address {
    return Address(
        null,
        user,
        this.title,
        this.country,
        this.city,
        this.town,
        this.detail
    );
}

fun UpdateAddressRequest.toAddress(existing: Address): Address {
    return Address(
        existing.id,
        existing.user,
        this.title,
        this.country,
        this.city,
        this.town,
        this.detail
    )
}
