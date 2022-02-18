package com.kihyeonkim.heroku.user.repository

import com.kihyeonkim.heroku.user.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long>