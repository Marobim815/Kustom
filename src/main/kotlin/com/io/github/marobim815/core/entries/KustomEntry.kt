package com.io.github.marobim815.core.entries

import com.io.github.marobim815.core.dataclasses.KustomData
import com.io.github.marobim815.core.items.ItemDslImpl
import com.io.github.marobim815.core.items.ItemRegistryHandler

@KustomDsl
data class KustomConfig(
    val modId: String,
    val jsonOutput: String
)

@Suppress("unused", "UNUSED_PARAMETER")
@KustomDsl
class KustomContext(
    private val config: KustomConfig
) {
    private val itemList = mutableListOf<ItemDslImpl>()

    fun items(block: ItemRegistryDsl.() -> Unit) {
        val registryHandler = ItemRegistryHandler()
        val elements = build()
        elements.forEach { registryHandler.register(it) }
    }

    private fun build(): List<KustomData> = itemList.flatMap { it.build() }
}

@KustomDsl @Suppress("unused")
fun kustom(modId: String, jsonOutput: String = "build/generated-kustom", block: KustomContext.() -> Unit) {
    val context = KustomContext(KustomConfig(modId, jsonOutput))
    context.apply(block)
}

