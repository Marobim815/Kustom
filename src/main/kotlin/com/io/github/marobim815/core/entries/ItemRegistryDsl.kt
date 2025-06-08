package com.io.github.marobim815.core.entries

import com.io.github.marobim815.core.items.ItemDslImpl

@KustomDsl
class ItemRegistryDsl(
    private val list: MutableList<ItemDslImpl>,
    private val config: KustomConfig
) {
    fun item(name: String, block: ItemDslImpl.() -> Unit) {
        val item = ItemDslImpl(name, config).apply(block)
        list += item
    }
}
