package com.io.github.sunset.api

import com.io.github.sunset.core.KustomDsl

@KustomDsl
class TooltipBuilder {
    private val lines = mutableListOf<String>()

    operator fun String.unaryPlus() {
        lines += this
    }
}