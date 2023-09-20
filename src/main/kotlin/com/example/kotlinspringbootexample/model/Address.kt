package com.example.kotlinspringbootexample.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "address")
data class Address (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User = User(),

    var title: String = "",

    var country: String = "",

    var city: String = "",

    var town: String? = null,

    var detail: String = "",
)