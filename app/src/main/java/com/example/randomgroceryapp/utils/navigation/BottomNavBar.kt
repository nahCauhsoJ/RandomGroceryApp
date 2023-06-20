package com.example.randomgroceryapp.utils.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController

@Composable
fun BottomNavBar(
    navController: NavController
) {
    NavigationBar {
        BottomBarNavigation.desList.forEach {
            NavigationBarItem(
                selected = navController.currentDestination?.route == it.route,
                onClick = { navController.navigate(it.route) },
                icon = { Icon(painterResource(it.icon),"") },
                label = { Text(stringResource(it.title)) }
            )
        }
    }
}