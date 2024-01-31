package com.cvl.bebank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BebankApplication

fun main(args: Array<String>) {
	runApplication<BebankApplication>(*args)
}
