package com.example.demo.model

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration

@ConfigurationProperties(prefix = "config")
@ConstructorBinding
data class PingPongConfiguration(
    val requestsPerSecond: Int,
    val key: String,
    val name: String
)
