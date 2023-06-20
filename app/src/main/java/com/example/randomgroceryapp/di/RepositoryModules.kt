package com.example.randomgroceryapp.di

import com.example.randomgroceryapp.repository.ProductRepository
import com.example.randomgroceryapp.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModules {
    @Binds
    abstract fun bindsProductRepo(impl: ProductRepositoryImpl): ProductRepository
}