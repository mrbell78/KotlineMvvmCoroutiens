package com.noor.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.noor.mvvm.repository.UserRepository

class UsersViewModelFactory(private val userRepository: UserRepository) : ViewModelProvider.Factory {


}