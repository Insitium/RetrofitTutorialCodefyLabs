package com.example.retrofittutorialcodefylabs.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class JsonViewModel: ViewModel() {

    /** The mutable State that stores the status of the most recent request */
    var jsonViewState: String by mutableStateOf("")
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately.
     */
    init {
        getJsonData()
    }

    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [MarsPhoto] [List] [MutableList].
     */
    fun getJsonData() {
        jsonViewState = "UI Response of the API request for get request"
    }
}

