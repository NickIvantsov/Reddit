package com.example.android.reddit.db.model


import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("data")
    val `data`: DataX = DataX(),
    @SerializedName("kind")
    val kind: String = ""
)