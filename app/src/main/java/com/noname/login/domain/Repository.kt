package com.noname.login.domain

import com.noname.login.models.LoginResponse

interface Repository {

    suspend fun login(userName:String, pass : String): LoginResponse

}