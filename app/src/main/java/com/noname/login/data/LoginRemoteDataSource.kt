package com.noname.login.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginRemoteDataSource @Inject constructor(private val apiService: ApiService) {

   suspend fun login(userName :String,passWord:String) = apiService.loginUser()

}