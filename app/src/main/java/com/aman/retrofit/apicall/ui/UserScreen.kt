package com.aman.retrofit.apicall.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aman.retrofit.apicall.data.UserModel
import com.aman.retrofit.apicall.viewModel.UserViewModel

@Composable
fun UserScreen(viewModel: UserViewModel) {
    val users = viewModel.users.value

    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Load Users") },
                icon = { Icon(Icons.Default.Refresh, contentDescription = "load users") },
                onClick = { viewModel.loadUsers() }

            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .statusBarsPadding()
                .background(MaterialTheme.colorScheme.background)
                .padding(vertical = 10.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.primary)
            ) {
                items(users) { user ->
                    UserItem(user)
                }
            }
        }
    }
}

@Composable
fun UserItem(userData: UserModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(MaterialTheme.colorScheme.background)
            .padding(8.dp)
    ) {
        Text(text = "Id : ${userData.id}", color = MaterialTheme.colorScheme.onBackground)
        Text(text = "Name : ${userData.name}", color = MaterialTheme.colorScheme.onBackground)
        Text(text = "Email : ${userData.email}", color = MaterialTheme.colorScheme.onBackground)
    }

}