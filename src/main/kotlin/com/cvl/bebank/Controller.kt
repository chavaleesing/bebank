package com.cvl.bebank

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    @Value("\${sing.description}") val info: String
) {

    val logger = LoggerFactory.getLogger(this:: class.java)

    @GetMapping("/healthcheck")
    fun healthcheck(): String{
        logger.info("print INFO Logging ......")
        return "200 OK :) | $info"
    }
}