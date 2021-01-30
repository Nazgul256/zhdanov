package com.stringconcat.mainApp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("hello")
    fun getHelloWorld():String{
        return "{message:\"Hello it's second version deployed over CI\"}"
    }
}