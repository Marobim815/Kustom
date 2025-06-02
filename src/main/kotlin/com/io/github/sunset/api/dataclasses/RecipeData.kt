package com.io.github.sunset.api.dataclasses

import kotlinx.serialization.Serializable

@Serializable
data class RecipeData(
    val type: String,
    val pattern: List<String>,
    val keys: Map<Char, String>
)