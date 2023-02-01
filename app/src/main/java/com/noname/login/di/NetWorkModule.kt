package com.test.userlogin.di

import com.noname.login.data.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {


    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient()
            .newBuilder()
            .readTimeout(60,TimeUnit.SECONDS)
            .connectTimeout(60,TimeUnit.SECONDS).build()


    @Singleton
    @Provides
    fun providesRetrofit(okHttpClient: OkHttpClient):Retrofit =
        Retrofit.Builder().baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
           .build()



}