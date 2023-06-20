package com.example.randomgroceryapp.ui.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.randomgroceryapp.utils.navigation.BottomBarNavigation
import com.example.randomgroceryapp.utils.navigation.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = BottomBarNavigation.Home.route
        ) {
            composable(BottomBarNavigation.Home.route) {
                PageHome()
            }

            composable(BottomBarNavigation.Shop.route) {
                PageShop(hiltViewModel())
            }

            composable(BottomBarNavigation.Checkout.route) {
                PageCheckout()
            }

            composable(BottomBarNavigation.Settings.route) {
                PageSettings()
            }
        }
    }
}