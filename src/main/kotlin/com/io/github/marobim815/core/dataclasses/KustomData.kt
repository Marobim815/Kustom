package com.io.github.marobim815.core.dataclasses

import com.io.github.marobim815.core.entries.KustomDsl
import net.minecraft.item.Item
import net.minecraft.util.Identifier

@KustomDsl
sealed class KustomData {
    data class ItemData(
        val id: Identifier,
        val item: Item,
        val modelJson: String,
        val langKey: String,
        val displayName: String,
    ) : KustomData()

    // 나중에 더 추가 예정 BlockData, EntityData 등
}
