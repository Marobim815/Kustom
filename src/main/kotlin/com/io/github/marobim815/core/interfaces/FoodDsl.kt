package com.io.github.marobim815.core.interfaces

import com.io.github.marobim815.core.entries.KustomDsl

@KustomDsl
interface FoodDsl {
    val nutrition: Int
    val saturation: Float
    val alwaysEdible: Boolean
}