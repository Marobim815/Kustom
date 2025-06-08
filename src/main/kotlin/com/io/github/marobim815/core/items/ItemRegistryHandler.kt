package com.io.github.marobim815.core.items

import com.io.github.marobim815.core.dataclasses.KustomData
import com.io.github.marobim815.core.entries.KustomDsl
import com.io.github.marobim815.core.interfaces.RegistryHandler
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

@KustomDsl
class ItemRegistryHandler : RegistryHandler {
    override fun register(data: KustomData) {
        if (data is KustomData.ItemData) {
            Registry.register(Registries.ITEM, data.id, data.item)
            println("[ItemRegistryHandler] 등록 완료")
        }
    }
}