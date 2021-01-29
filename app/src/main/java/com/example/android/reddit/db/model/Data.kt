package com.example.android.reddit.db.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("after")
    val after: String = "",
    @SerializedName("before")
    val before: Any = Any(),
    @SerializedName("children")
    val children: List<Children> = listOf(),
    @SerializedName("dist")
    val dist: Int = 0,
    @SerializedName("modhash")
    val modhash: String = ""
)