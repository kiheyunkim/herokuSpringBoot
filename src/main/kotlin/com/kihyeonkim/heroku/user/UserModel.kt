package com.kihyeonkim.heroku.user

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class UserModel(
	val userName: String,
	val nickname: String,
	@Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = 0
)
