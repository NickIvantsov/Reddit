package com.example.android.reddit.db.model


data class Preview(
    val enabled: Boolean = false,
    val images: List<Image> = listOf()
)