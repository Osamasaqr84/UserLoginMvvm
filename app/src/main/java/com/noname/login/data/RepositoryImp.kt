package com.noname.login.data

import com.noname.login.domain.Repository
import com.noname.login.models.LoginResponse
import javax.inject.Inject

class RepositoryImp @Inject constructor(val remoteDataSource: LoginRemoteDataSource) : Repository {

    override suspend fun login(userName: String, pass: String): LoginResponse {
         return  remoteDataSource.login(userName,pass)
    }


}