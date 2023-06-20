package com.example.randomgroceryapp.utils.navigation

import com.example.randomgroceryapp.R

sealed class BottomBarNavigation(
    val route: String,
    val title: Int, // Use stringResource
    val icon: Int // Use painterResource
) {
    object Home: BottomBarNavigation("home", R.string.navigation_home, R.drawable.baseline_home_24)
    object Shop: BottomBarNavigation("shop", R.string.navigation_shop, R.drawable.baseline_store_24)
    object Checkout: BottomBarNavigation("checkout", R.string.navigation_checkout, R.drawable.baseline_shopping_cart_checkout_24)
    object Settings: BottomBarNavigation("settings", R.string.navigation_settings, R.drawable.baseline_settings_24)

    companion object {
        val desList = listOf(Home, Shop, Checkout, Settings)
    }
}