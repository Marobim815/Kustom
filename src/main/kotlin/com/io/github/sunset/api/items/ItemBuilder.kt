package com.io.github.sunset.api.items

import com.io.github.sunset.api.dataclasses.ItemData
import com.io.github.sunset.api.dataclasses.RecipeData
import com.io.github.sunset.core.KustomBuilder
import com.io.github.sunset.core.KustomDsl

@KustomDsl
class ItemBuilder(id: String) : KustomBuilder<ItemData>(id) {
    private val tooltip: List<String> = listOf()
    private var texture: String? = null
    private var recipe: RecipeData? = null
    private var compostable: Float? = null
    private var fuelTicks: Int? = null

    override fun build(): ItemData = ItemData(
        id, texture, tooltip, recipe, compostable, fuelTicks
    )
}