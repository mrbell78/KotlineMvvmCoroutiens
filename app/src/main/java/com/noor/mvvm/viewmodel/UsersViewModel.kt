package com.noor.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.noor.mvvm.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UsersViewModel(private val userRepository: UserRepository):ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO){
            userRepository.getUsers()
        }

    }
}