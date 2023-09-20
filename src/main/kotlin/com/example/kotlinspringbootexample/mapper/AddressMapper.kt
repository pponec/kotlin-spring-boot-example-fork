package com.example.kotlinspringbootexample.mapper

import com.example.kotlinspringbootexample.dto.AddressDto
import com.example.kotlinspringbootexample.entity.Address
import com.example.kotlinspringbootexample.request.CreateAddressRequest
import com.example.kotlinspringbootexample.request.UpdateAddressRequest
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface AddressMapper {

    fun toDto(address: Address): AddressDto

    fun toDto(addresses: List<Address>): List<AddressDto>

    fun toBean(address: AddressDto): Address

    fun toBean(createAddressRequest: CreateAddressRequest): Address

    fun toBean(UpdateAddressRequest: UpdateAddressRequest): Address

}
