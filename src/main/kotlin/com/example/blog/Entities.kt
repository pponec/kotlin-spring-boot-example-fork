package com.example.blog

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne
    @JoinColumn(name = "user_id")
    var author: User,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue
    var id: Long? = null
)

@Entity
class User(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue
    var id: Long? = null
)

//fun createArticle() : Article {
//    return Article()
//}