package com.example.android.reddit.db.model


data class Image(
    val id: String = "",
    val resolutions: List<Resolution> = listOf(),
    val source: Source = Source(),
    val variants: Variants = Variants()
)