package com.io.github.sunset.api.items

import com.io.github.sunset.api.dataclasses.ItemData
import com.io.github.sunset.api.dataclasses.ItemEntry
import com.io.github.sunset.core.KustomDsl
import com.io.github.sunset.core.KustomRegistry
import net.minecraft.item.Item
import net.minecraft.util.Identifier

@KustomDsl
class ItemRegistry(private val modId: String) : KustomRegistry<ItemEntry>() {
    fun item(id: String, builder: ItemBuilder.() -> Unit) {
        val itemBuilder = ItemBuilder(id).apply(builder)
        val entry = ItemEntry(Identifier.of(modId, id), Item.Settings(), itemBuilder)
        add(entry)
    }

    fun build(): List<ItemData> = entries.map { it.itemBuilder.build() }
}