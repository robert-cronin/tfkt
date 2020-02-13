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
@file:JsModule("@tensorflow/tfjs")
@file:JsNonModule

package com.fortytwoapps.tfkt.models

import com.fortytwoapps.tfkt.data.Dataset
import com.fortytwoapps.tfkt.layers.Layer
import com.fortytwoapps.tfkt.models.io.IOHandler
import com.fortytwoapps.tfkt.tensors.Tensor
import org.w3c.dom.History
import kotlin.js.Json
import kotlin.js.Promise

// Creation
external fun sequential(config: dynamic = definedExternally): Sequential
private external fun model(args: dynamic = definedExternally): LayersModel

// Inputs
private external fun input(config: dynamic = definedExternally): Sequential

// Loading
private external fun loadGraphModel(modelUrl: String, options: dynamic = definedExternally): Sequential
private external fun loadGraphModel(modelUrl: IOHandler, options: dynamic = definedExternally): Sequential
private external fun loadLayersModel(pathOrIOHandler: dynamic = definedExternally, options: dynamic = definedExternally): Sequential

// Serialization
private external fun registerClass(cls: Layer)


// Classes
open external class GraphModel {
    // Predict
    fun predict(inputs: Tensor, config: dynamic = definedExternally): Array<Tensor>
    fun predict(inputs: Array<Tensor>, config: dynamic = definedExternally): Array<Tensor>
    fun predict(inputs: Json, config: dynamic = definedExternally): Array<Tensor>
    // Execute
    fun execute(inputs: Tensor, outputs: dynamic = definedExternally): Array<Tensor>
    fun execute(inputs: Array<Tensor>, outputs: dynamic = definedExternally): Array<Tensor>
    fun execute(inputs: Json, outputs: dynamic = definedExternally): Array<Tensor>
    // Execute Async
    fun executeAsync(inputs: Tensor, outputs: dynamic = definedExternally): Array<Tensor>
    fun executeAsync(inputs: Array<Tensor>, outputs: dynamic = definedExternally): Array<Tensor>
    fun executeAsync(inputs: Json, outputs: dynamic = definedExternally): Array<Tensor>
    // Dispose
    fun dispose()
}
open external class LayersModel {
    // Summary
    fun summary(lineLength: Number? = definedExternally, positions: Array<Number>? = definedExternally, printFn:(dynamic)->Unit?)
    // Compile
    fun compile(args: dynamic = definedExternally)
    // Evaluate
    fun evaluate(x: Tensor, y: Tensor, args: dynamic = definedExternally): Tensor
    fun evaluate(x: Array<Tensor>, y: Array<Tensor>, args: dynamic = definedExternally): Array<Tensor>
    // Evaluate Dataset
    fun evaluateDataset(dataset: Dataset, args: dynamic = definedExternally): Array<Tensor>
    // Predict
    fun predict(x: Tensor, args: dynamic = definedExternally): Tensor
    fun predict(x: Array<Tensor>, args: dynamic = definedExternally): Array<Tensor>
    // Predict
    fun predictOnBatch(x: Tensor): Tensor
    fun predictOnBatch(x: Array<Tensor>): Array<Tensor>
    // Fit
    fun fit(x: Tensor, y: Tensor, args: dynamic = definedExternally): Promise<History>
    fun fit(x: Array<Tensor>, y: Array<Tensor>, args: dynamic = definedExternally): Promise<History>
    // Fit
    fun fitDataset(dataset: Tensor, args: dynamic = definedExternally): Promise<History>
    fun fitDataset(dataset: Array<Tensor>, args: dynamic = definedExternally): Promise<History>
    // Train On Batch
    fun trainOnBatch(x: Tensor, y: Tensor): Promise<History>
    fun trainOnBatch(x: Array<Tensor>, y: Array<Tensor>): Promise<History>
    // Save
    fun save(handlerOrURL: dynamic = definedExternally, config: dynamic = definedExternally)
    // Get Layer
    fun getLayer(name: String? = definedExternally, index: Number? = definedExternally): Layer
}
open external class Sequential: LayersModel {
    // Summary
    fun add(layer: Layer)
}
open external class SymbolicTensor {}

// Op Registry
external fun deregisterOp(name: String)
external fun getRegisteredOp(name: String): dynamic
external fun registerOp(name: String, opFunc: dynamic = definedExternally)
