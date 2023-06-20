package com.example.randomgroceryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.randomgroceryapp.ui.theme.RandomGroceryAppTheme
import com.example.randomgroceryapp.ui.views.MainPage
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppCenter.start(
            application, getString(R.string.APP_CENTER_SECRET),
            Analytics::class.java, Crashes::class.java
        )

        println(getString(R.string.APP_CENTER_SECRET))
        println("Yo")

        setContent {
            RandomGroceryAppTheme {
                MainPage()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RandomGroceryAppTheme {
        Greeting("Android")
    }
}