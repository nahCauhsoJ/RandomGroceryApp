package com.example.randomgroceryapp.ui.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randomgroceryapp.model.ProductResponseItem
import com.example.randomgroceryapp.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShopViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {
    var hotItems by mutableStateOf(listOf<ProductResponseItem>())

    fun getHotItems() {
        viewModelScope.launch(Dispatchers.IO) {
            productRepository.getHotItems().apply {
                hotItems = this
            }
        }
    }
}