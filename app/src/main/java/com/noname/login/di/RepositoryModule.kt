package com.noname.login.di

import com.noname.login.data.ApiService
import com.noname.login.data.LoginCacheDataSource
import com.noname.login.data.LoginRemoteDataSource
import com.noname.login.data.RepositoryImp
import com.noname.login.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {


//    @Singleton
//    @Provides
//    fun provideLoginRepository(remoteDataSource: LoginRemoteDataSource)
//                        : Repository = RepositoryImp(remoteDataSource)

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)



    @Reusable
    @Provides
    fun providesDataSource(apiService: ApiService) : LoginRemoteDataSource = LoginRemoteDataSource(apiService)


}
