package com.example.demo.services

import com.example.demo.model.PingPongConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

@Service
@EnableConfigurationProperties(PingPongConfiguration::class)
class PongService(val configuration: PingPongConfiguration) {
    fun printName(name: String){
        println(configuration)
    }
}