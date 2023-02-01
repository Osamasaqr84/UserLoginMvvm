package com.noname.login.di

import com.noname.login.domain.Repository
import com.noname.login.domain.usecases.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
class DataSourceModule {

    @Provides
    fun providesDataUseCase(
        dataRepository: Repository
    ): LoginUseCase {
        return LoginUseCase(dataRepository)
    }

}