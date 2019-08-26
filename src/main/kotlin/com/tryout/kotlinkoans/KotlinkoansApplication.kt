package com.tryout.kotlinkoans

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinkoansApplication

fun main(args: Array<String>) {
	runApplication<KotlinkoansApplication>(*args)
}
