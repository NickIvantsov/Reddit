package com.example.android.reddit.db.model


import com.google.gson.annotations.SerializedName

data class Resolution(
    val height: Int = 0,
    val url: String = "",
    val width: Int = 0
)