package com.example.kotlinspringbootexample.mapper

import com.example.kotlinspringbootexample.dto.UserDto
import com.example.kotlinspringbootexample.entity.User
import com.example.kotlinspringbootexample.request.CreateUserRequest
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface UserMapper {

    fun toDto(user: User): UserDto

    fun toDto(users: List<User>): List<UserDto>

    fun toBean(userDto: UserDto): User

    fun toBean(createUserRequest: CreateUserRequest): User

}
