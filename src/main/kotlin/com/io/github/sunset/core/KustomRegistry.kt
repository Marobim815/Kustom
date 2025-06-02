package com.io.github.sunset.core

@KustomDsl
abstract class KustomRegistry<T: KustomEntry> {
    protected val entries = mutableListOf<T>()

    fun add(entry: T) {
        entries.add(entry)
    }

    fun registerAll() {
        entries.forEach { it.register() }
    }
}