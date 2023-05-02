package com.noor.mvvm.api

import com.noor.mvvm.model.Users
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/users")
   suspend fun getUsers(): Response<Users>
}