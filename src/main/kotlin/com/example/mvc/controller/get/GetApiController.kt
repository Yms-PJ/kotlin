package com.example.mvc.controller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController         // REST API Controller
@RequestMapping(value = ["/api"]) // http://localhost:8080/api
class GetApiController {

    @GetMapping(path = ["/hello", "/abcd"]) // GET http://localhost:8080/api/hello, GET http://localhost:8080/api/abcd
    fun hello(): String{
        return "hello kotlin"
    }

    @RequestMapping(method = [RequestMethod.GET], path = ["/request-mapping"])
    fun requestMapping(): String {
        return "request-mappipng"
    }


}