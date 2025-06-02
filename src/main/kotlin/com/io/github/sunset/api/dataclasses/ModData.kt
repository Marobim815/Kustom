package com.io.github.sunset.api.dataclasses

import com.io.github.sunset.core.KustomDsl
import kotlinx.serialization.Serializable

@Serializable @KustomDsl
data class ModData(
    val modId: String,
    val items: List<ItemData>
    // val blocks: List<BlockData>
)