package com.codingtester.myfirstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrintText(name = "first compose")
        }
    }
}

@Composable
fun PrintText(name: String) {
    Text(
        text = name,
        color = Color.Red,
        fontSize = 24.sp
    )
}
