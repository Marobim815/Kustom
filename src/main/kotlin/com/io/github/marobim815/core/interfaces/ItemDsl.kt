package com.io.github.marobim815.core.interfaces

import com.io.github.marobim815.core.entries.KustomDsl
import net.fabricmc.fabric.api.item.v1.FabricItem.Settings

@KustomDsl
interface ItemDsl {
    val name: String
    val itemSettings: Settings
}