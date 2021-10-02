package com.example.mvc.controller.get

import org.springframework.web.bind.annotation.*

@RestController         // REST API Controller
@RequestMapping(value = ["/api"]) // http://localhost:8080/api
class GetApiController {

    @GetMapping(path = ["/hello", "/abcd"]) // GET http://localhost:8080/api/hello, GET http://localhost:8080/api/abcd
    fun hello(): String {
        return "hello kotlin"
    }

    @RequestMapping(method = [RequestMethod.GET], path = ["/request-mapping"])
    fun requestMapping(): String {
        return "request-mappipng"
    }

    @GetMapping(value = ["/get-mapping/path-variable/{name}/{age}"]) // GET http://localhost:8080/api/get-mapping/path-variable/steve/30
    fun pathVariable(@PathVariable name: String, @PathVariable age: Int): String {
        println("${name}, ${age}")
        return name + " " + age
    }

    @GetMapping(value = ["/get-mapping/path-variable2/{name}/{age}"]) // GET http://localhost:8080/api/get-mapping/path-variable2/steve/30
    fun pathVariable2(@PathVariable(value = "name") _name: String, @PathVariable(name = "age") _age: Int): String {
        val name: String = "yang"
        var age: Int = 99
        println("${_name}, ${_age}")
        return _name + " " + _age
    }

}