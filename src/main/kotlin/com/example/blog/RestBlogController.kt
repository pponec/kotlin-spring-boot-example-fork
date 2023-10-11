package com.example.blog

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class RestBlogController(
    var commonService: CommonService,
) {

    @GetMapping("/echo")
    fun echo(): String {
        return "blog"
    }

    @GetMapping("/blog")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

}