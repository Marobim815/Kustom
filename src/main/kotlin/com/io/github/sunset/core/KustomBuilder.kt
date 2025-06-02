package com.io.github.sunset.core

@KustomDsl
abstract class KustomBuilder<T: KustomData>(
    val id: String
) {
    abstract fun build(): T
}