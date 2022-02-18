package com.kihyeonkim.heroku.user.controller

import com.kihyeonkim.heroku.user.UserModel
import com.kihyeonkim.heroku.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

	@Autowired
	private lateinit var userRepository: UserRepository

	@GetMapping("/getInfo")
	fun getUserInfo(@RequestParam(name = "userId") userId: Long): UserModel {
		return userRepository.findById(userId).orElseGet { UserModel("invalid", "invalid", -1L) }
	}

	@GetMapping("/addUser")
	fun addUserInfo(
		@RequestParam(name = "userName") userName: String,
		@RequestParam(name = "nickname") nickname: String
	): Long {
		val user = userRepository.save(UserModel(userName, nickname))

		return user.id
	}

	@GetMapping("/addUser")
	fun deleteUserInfo(
		@RequestParam(name = "userId") userId: Long
	): Boolean {
		try {
			userRepository.deleteById(userId)
		} catch (e: IllegalArgumentException) {
			return false
		}

		return true;
	}
}