package com.io.github.marobim815.kustom.internal

abstract class BuildAndRegister<T> : Builder<KustomData<T>>, Register<KustomData<T>> {
    fun run() {
        val data = build()
        register(data)
    }
}