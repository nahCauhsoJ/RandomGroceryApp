package com.example.randomgroceryapp.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomgroceryapp.ui.components.ProductCardSimple
import com.example.randomgroceryapp.ui.viewmodels.ShopViewModel

@Composable
fun PageShop(
    vm: ShopViewModel
) {
    LaunchedEffect(Unit) { vm.getHotItems() }

    Column(Modifier.fillMaxSize()) {
        Text("Products", Modifier.fillMaxWidth(), fontSize = 30.sp)

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid (
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxWidth().weight(1f)
        ) {
            items(vm.hotItems) {
                ProductCardSimple(data = it) {

                }
            }
        }
    }
}