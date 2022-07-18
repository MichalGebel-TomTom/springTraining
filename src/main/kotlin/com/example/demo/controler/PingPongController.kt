package com.example.demo.controler

import com.example.demo.services.PongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PingPongController(val pongService: PongService) {

    @GetMapping("/ping")
    fun simpleResponse() = Pong("pong")

    @PostMapping("/create")
    fun createPong(@RequestBody body: RequestDto): RequestDto = body

    @GetMapping("/{name}")
    fun printName(@PathVariable name: String){
        pongService.printName(name)
    }

    @GetMapping("/surname")
    fun printSurname(@RequestParam surname: String){
        pongService.printName(surname)
    }

}

data class RequestDto(val name: String, val surname: String)
data class Pong(val pong: String)