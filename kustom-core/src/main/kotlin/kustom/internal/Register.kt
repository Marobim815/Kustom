package com.io.github.marobim815.kustom.internal

interface Register<T> {
    fun register(data: KustomData<T>)
}