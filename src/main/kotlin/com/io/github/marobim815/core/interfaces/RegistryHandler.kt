package com.io.github.marobim815.core.interfaces

import com.io.github.marobim815.core.dataclasses.KustomData
import com.io.github.marobim815.core.entries.KustomDsl

@KustomDsl
interface RegistryHandler {
    fun register(data: KustomData)
}