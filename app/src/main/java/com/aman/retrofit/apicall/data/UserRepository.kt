package com.aman.retrofit.apicall.data

class UserRepository {
    suspend fun fetchUsers() = RetrofitInstance.api.getUsers()
}