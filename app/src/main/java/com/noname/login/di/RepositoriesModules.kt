package com.noname.login.di

import com.noname.login.data.RepositoryImp
import com.noname.login.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
interface RepositoriesModules {

    @Binds
    fun mainRepository(mainRepositoryImpl: RepositoryImp): Repository



}