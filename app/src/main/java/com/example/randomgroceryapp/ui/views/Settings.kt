package com.example.randomgroceryapp.ui.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PageSettings() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Settings", fontWeight = FontWeight.Bold) }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                SettingsHeader(title = "Account")
                SettingsItem(icon = Icons.Default.Person, title = "Profile Details", subtitle = "Name, Email, Phone")
                SettingsItem(icon = Icons.Default.LocationOn, title = "Delivery Address", subtitle = "Home, Office")
                SettingsItem(icon = Icons.Default.AccountBox, title = "Payment Methods", subtitle = "Visa, Mastercard")
                
                Divider()
                
                SettingsHeader(title = "Notifications")
                SettingsItem(icon = Icons.Default.Notifications, title = "Push Notifications", subtitle = "Enabled")
                SettingsItem(icon = Icons.Default.Email, title = "Email Newsletters", subtitle = "Disabled")

                Divider()

                SettingsHeader(title = "App")
                SettingsItem(icon = Icons.Default.Info, title = "About", subtitle = "Version 1.0.0")
                SettingsItem(icon = Icons.Default.Refresh, title = "Help & Support")
                
                Spacer(modifier = Modifier.height(32.dp))
                
                TextButton(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.textButtonColors(contentColor = MaterialTheme.colorScheme.error)
                ) {
                    Text("Log Out", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun SettingsHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
    )
}

@Composable
fun SettingsItem(icon: ImageVector, title: String, subtitle: String? = null) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge)
            if (subtitle != null) {
                Text(text = subtitle, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}