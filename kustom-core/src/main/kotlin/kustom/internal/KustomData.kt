package com.io.github.marobim815.kustom.internal

import com.google.gson.JsonObject
import net.minecraft.util.Identifier

data class KustomData<T>(
    val value: T,
    val namespace: String,
    val id: String,
    val jsonType: JsonType? = null,
    val jsonData: JsonObject? = null,
    val texturePath: String? = null,
    val modelFileName: String? = null,
    val tags: List<String> = emptyList(),
    val extra: MutableMap<String, Any> = mutableMapOf()
) {
    val identifier: Identifier get() = Identifier.of(namespace, id)
}

enum class JsonType {
    ITEM,
    BLOCK,
    MODEL,
    RECIPE,
    LOOT_TABLE,
    ENCHANTMENT,
}