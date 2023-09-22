package com.example.kotlinspringbootexample.controller

import com.example.kotlinspringbootexample.converter.toDto
import com.example.kotlinspringbootexample.dto.AddressDto
import com.example.kotlinspringbootexample.request.CreateAddressRequest
import com.example.kotlinspringbootexample.request.UpdateAddressRequest
import com.example.kotlinspringbootexample.service.AddressService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController( private val addressService: AddressService) {

    @GetMapping
    fun getAllAddresses(): ResponseEntity<List<AddressDto>> =
        ResponseEntity.ok(addressService.getAllAddresses().map { it.toDto() })

    @GetMapping("/{id}")
    fun getAllAddresses(@PathVariable id: Long): ResponseEntity<AddressDto> =
        ResponseEntity.ok(addressService.getById(id).toDto())

    @GetMapping("/by-user/{id}")
    fun getByUser(@PathVariable id: Long): ResponseEntity<List<AddressDto>> =
        ResponseEntity.ok(addressService.getAddressesByUser(id).map { it.toDto() })

    @PostMapping
    fun createAddress(@RequestBody createAddressRequest: CreateAddressRequest): ResponseEntity<AddressDto> =
        ResponseEntity.status(HttpStatus.CREATED).body(addressService.createAddress(createAddressRequest).toDto())

    @PutMapping
    fun updateAddress(@RequestBody updateAddressRequest: UpdateAddressRequest): ResponseEntity<AddressDto> =
        ResponseEntity.ok(addressService.updateAddress(updateAddressRequest).toDto())

    @DeleteMapping("/{id}")
    fun updateAddress(@PathVariable id: Long): ResponseEntity<Void> {
        addressService.deleteAddress(id)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}