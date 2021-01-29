package com.example.android.reddit.db.model


import com.google.gson.annotations.SerializedName

data class Gildings(
    @SerializedName("gid_1")
    val gid1: Int = 0,
    @SerializedName("gid_2")
    val gid2: Int = 0,
    @SerializedName("gid_3")
    val gid3: Int = 0
)