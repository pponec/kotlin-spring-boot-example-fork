package com.example.blog.impl

import com.example.blog.CommonService
import com.example.blog.User
import com.example.blog.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class ServiceImpl(val userRepository: UserRepository) : CommonService {

    override fun saveUser(user: User) = userRepository.save(user);

    override fun findAllUsers() = userRepository.findAll();
}