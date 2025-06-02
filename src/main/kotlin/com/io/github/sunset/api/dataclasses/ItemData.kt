package com.io.github.sunset.api.dataclasses

import com.io.github.sunset.core.KustomData
import com.io.github.sunset.core.KustomDsl
import kotlinx.serialization.Serializable

@Serializable @KustomDsl
data class ItemData(
    override val name: String,
    override val texture: String?,
    val tooltip: List<String> = listOf(),
    val recipe: RecipeData?,
    val compostable: Float?,
    val fuelTicks: Int?,
    // val foodItem: FoodItemData? = null,
    // val toolItem: ToolItemData? = null,
    // val armor: ArmorData? = null
) : KustomData
