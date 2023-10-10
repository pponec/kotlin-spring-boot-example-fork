package com.example.blog.explorationLab

class Demo {

    var id = 0L;
    var name : String = ""

    companion object Static {
        fun create() = Demo().apply { name = "test"; id = 2L }
    }
}