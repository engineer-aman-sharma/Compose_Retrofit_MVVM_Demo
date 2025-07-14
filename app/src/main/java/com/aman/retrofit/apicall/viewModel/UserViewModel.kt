package com.aman.retrofit.apicall.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aman.retrofit.apicall.data.UserModel
import com.aman.retrofit.apicall.data.UserRepository
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {
    private val repository = UserRepository()
    private val _users = mutableStateOf<List<UserModel>>(emptyList())
    val users: State<List<UserModel>> = _users

    fun loadUsers() {
        viewModelScope.launch {
            val result = repository.fetchUsers()
            _users.value = result
        }
    }
}