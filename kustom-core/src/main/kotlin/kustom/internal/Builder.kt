package com.io.github.marobim815.kustom.internal

interface Builder<T> {
    fun build(): KustomData<T>
}