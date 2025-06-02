package com.io.github.sunset.api.dataclasses

import com.io.github.sunset.api.items.ItemBuilder
import com.io.github.sunset.core.KustomDsl
import com.io.github.sunset.core.KustomEntry
import net.minecraft.item.Item
import net.minecraft.util.Identifier

@KustomDsl
class ItemEntry(
    val id: Identifier,
    val itemSettings: Item.Settings,
    val itemBuilder: ItemBuilder
) : KustomEntry {
    override fun register() {
        TODO("실제 Minecraft 등록 로직")
    }
}