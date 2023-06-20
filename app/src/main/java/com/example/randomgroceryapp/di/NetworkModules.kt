package com.example.randomgroceryapp.di

import com.example.randomgroceryapp.api.ApiFake
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkModules {
    @Provides
    fun providesApiFake() = ApiFake()
}