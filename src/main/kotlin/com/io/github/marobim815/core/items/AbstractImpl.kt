package com.io.github.marobim815.core.items

import com.io.github.marobim815.core.dataclasses.KustomData

abstract class AbstractImpl {
    abstract fun build(): List<KustomData>
}
