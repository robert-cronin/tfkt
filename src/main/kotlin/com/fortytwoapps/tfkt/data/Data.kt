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
@file:JsModule("@tensorflow/tfjs-data")
@file:JsNonModule
@file:JsQualifier("data")
package com.fortytwoapps.tfkt.data

import org.w3c.dom.HTMLVideoElement
import kotlin.js.Promise

// Creation
external fun array(items: String): Dataset
external fun csv(source: dynamic, csvConfig: dynamic = definedExternally): CSVDataset
external fun generator(generator: dynamic): Dataset
external fun microphone(microphoneConfig: dynamic = definedExternally): Promise<dynamic>
external fun webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: dynamic = definedExternally): Promise<dynamic>

// Operations
external fun zip(datasets: Array<Dataset>): Dataset

// Classes
open external class Dataset {
    fun batch(batchSize: Number, smallLastBatch: Boolean? = definedExternally): Dataset
    fun concatenate(dataset: Dataset): Dataset
    fun <T> filter(predicate: (value: T)->Boolean): Dataset
    fun <T> forEachAsync(f: (input: T)->Unit): Promise<Unit>
    fun <T> map(transform: (value: T)->dynamic): Dataset
    fun <T> mapAsync(transform: (value: T)->Promise<dynamic>): Dataset
    fun prefetch(bufferSize: Number): Dataset
    fun repeat(count: Number? = definedExternally): Dataset
    fun skip(count: Number): Dataset
    fun shuffle(bufferSize: Number, seed: String? = definedExternally, reshuffleEachIteration: Boolean? = definedExternally): Dataset
    fun take(count: Number): Dataset
    fun toArray(): dynamic
}

open external class CSVDataset: Dataset {
    fun columnNames(): dynamic
}
