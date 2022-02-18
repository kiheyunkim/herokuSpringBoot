package com.kihyeonkim.heroku.user.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

	@GetMapping("/getInfo")
	fun getUserInfo(): String {
		return "test"
	}
}