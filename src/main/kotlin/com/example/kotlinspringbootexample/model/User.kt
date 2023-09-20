package com.example.kotlinspringbootexample.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "`user`")
data class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var username: String

    var email: String

    var name: String

    var surname: String? = null

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    var items: List<Address> = mutableListOf()
}