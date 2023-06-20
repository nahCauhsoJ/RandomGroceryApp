package com.example.randomgroceryapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.randomgroceryapp.model.ProductResponseItem

@Composable
fun ProductCardSimple(
    data: ProductResponseItem,
    modifier: Modifier = Modifier,
    onClick: (ProductResponseItem) -> Unit = {}
) {
    ElevatedCard(
        modifier = modifier.then(Modifier.clickable { onClick(data) }),
        shape = RectangleShape,
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Column(Modifier.padding(horizontal = 8.dp)) {
            Text(data.name)
            Text(data.description)
            Spacer(Modifier.height(8.dp))
            Text("\$${data.unitPrice}")
        }
    }
}

@Composable
@Preview
private fun ProductCardSimplePreview() {
    ProductCardSimple(
        data = ProductResponseItem(
            id = "69",
            description = "Testing testing why am I even here.",
            name = "Test",
            unitPrice = 12.34
        )
    )
}