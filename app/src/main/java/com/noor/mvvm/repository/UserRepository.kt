package com.noor.mvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.noor.mvvm.api.ApiInterface
import com.noor.mvvm.model.Users

class UserRepository(private val apiInterface: ApiInterface) {
    private val userLIveData = MutableLiveData<Users>();
    val users : LiveData<Users>
    get() = userLIveData

    suspend fun getUsers(){
        val result  =  apiInterface.getUsers()
        if(result.body()!=null){
            userLIveData.postValue(result.body())
        }
    }
}