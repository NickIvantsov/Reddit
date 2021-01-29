package com.example.android.reddit.views

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.catfacts.util.net.AppResult
import com.example.android.reddit.db.model.RedditTop
import com.example.android.reddit.repository.IRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: IRepository) : ViewModel() {

    val redditTopLiveData = MutableLiveData<RedditTop>()

    fun getRedditTop() {
        viewModelScope.launch {
            when (val result = repository.getRedditTop()) {
                is AppResult.Success -> {
                    redditTopLiveData.value = result.successData
                }
                is AppResult.Error -> {
                    //todo
                }
            }
        }
    }
}