/*
 * Copyright (C) 2019/2020 Robert Cronin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortytwoapps.tfkt.util

import com.fortytwoapps.tfkt.tensors.Tensor
import kotlin.js.Console

external fun require(name: String): dynamic

// Useful inline function for creating js objects
inline fun jsObject(init: dynamic.() -> Unit): dynamic {
    val obj = js("{}")
    init(obj)
    return obj
}

//enum class DataType(val stringValue: String) {
//    FLOAT32("float32"),
//    INT32("int32"),
//    BOOL("bool"),
//    COMPLEX64("complex64"),
//    STRING("string")
//}
//fun Tensor.asType(dtype: DataType) = fun():Tensor {
//    return this.asDynamic().asType(dtype.stringValue) as Tensor
//}

//inline fun <reified T> a(vararg items: T): Array<T> = arrayOf<T>(*items)