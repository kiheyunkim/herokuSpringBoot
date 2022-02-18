package com.kihyeonkim.heroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HerokuApplication

fun main(args: Array<String>) {
	runApplication<HerokuApplication>(*args)
}
