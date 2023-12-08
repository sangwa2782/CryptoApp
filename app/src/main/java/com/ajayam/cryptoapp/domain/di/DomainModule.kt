package com.ajayam.cryptoapp.domain.di

import com.ajayam.cryptoapp.domain.repository.ImageRepository
import com.ajayam.cryptoapp.domain.use_case.GetSearchImageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetSearchUseCase(imageRepository: ImageRepository): GetSearchImageUseCase {
        return GetSearchImageUseCase(imageRepository)
    }

}