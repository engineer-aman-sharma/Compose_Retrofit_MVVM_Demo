package com.aman.retrofit.apicall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aman.retrofit.apicall.ui.UserScreen
import com.aman.retrofit.apicall.ui.theme.ThemeByAman
import com.aman.retrofit.apicall.viewModel.UserViewModel

class MainActivity : ComponentActivity() {
    private val viewModel = UserViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemeByAman {
                UserScreen(viewModel)
            }
        }
    }
}