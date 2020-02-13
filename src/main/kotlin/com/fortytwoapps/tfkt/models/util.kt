package com.fortytwoapps.tfkt.models

import kotlin.js.Json

private fun Json.toMap(): Map<String, Any?> {
    val map: MutableMap<String, Any?> = linkedMapOf()
    for (key in js("Object").keys(this)) {
        map[key] = this[key]
    }
    return map
}
