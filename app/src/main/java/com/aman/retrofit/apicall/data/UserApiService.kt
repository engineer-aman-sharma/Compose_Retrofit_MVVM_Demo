package com.aman.retrofit.apicall.data

import retrofit2.http.GET

interface UserApiService {
    @GET("users")
    suspend fun getUsers(): List<UserModel>
}