package com.fortytwoapps.tfkt.models.io

import kotlinx.coroutines.await
import kotlin.js.Json

private fun Json.toMap(): Map<String, Any?> {
    val map: MutableMap<String, Any?> = linkedMapOf()
    for (key in js("Object").keys(this)) {
        map[key] = this[key]
    }
    return map
}

// Management
suspend fun copyModel(sourceUrl: String, destURL: String): Map<String, Any?> {
    return com.fortytwoapps.tfkt.data.copyModelJS(sourceUrl, destURL).await().toMap()
}
suspend fun listModels(): Map<String, Any?> {
    return com.fortytwoapps.tfkt.data.listModelsJS().await().toMap()
}
suspend fun removeModel(url: String): Map<String, Any?> {
    return com.fortytwoapps.tfkt.data.removeModelJS(url).await().toMap()
}