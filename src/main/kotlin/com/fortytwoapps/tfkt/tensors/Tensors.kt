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

package com.fortytwoapps.tfkt.tensors

import kotlin.js.Promise

// Creation
external fun tensor(array: Array<dynamic>): Tensor
external fun scalar(value: Number, dtype: String): Tensor
external fun scalar(value: Boolean, dtype: String): Tensor
external fun scalar(value: String, dtype: String): Tensor
external fun scalar(value: Array<Number>, dtype: String): Tensor
external fun tensor1d(value: Array<dynamic>, dtype: String): Tensor
external fun tensor2d(value: Array<dynamic>, shape: IntArray?, dtype: String): Tensor
external fun tensor3d(value: Array<dynamic>, shape: IntArray?, dtype: String): Tensor
external fun tensor4d(value: Array<dynamic>, shape: IntArray?, dtype: String): Tensor
external fun tensor5d(value: Array<dynamic>, shape: IntArray?, dtype: String): Tensor
external fun tensor6d(value: Array<dynamic>, shape: IntArray?, dtype: String): Tensor
external fun buffer(shape: IntArray, dtype: String?, value: Array<dynamic>?): Tensor
external fun clone(x: Tensor?): Tensor
external fun complex(real: Array<dynamic>, imag: Array<dynamic>): Tensor
external fun complex(real: Tensor, imag: Tensor): Tensor
external fun eye(numRows: Number, numColumns: Number?, batchShape: Array<Number>?, dtype: String?): Tensor
external fun fill(shape: IntArray, value: Number, dtype: String?): Tensor
external fun fill(shape: IntArray, value: String, dtype: String?): Tensor
external fun imag(input: Array<dynamic>): Tensor
external fun imag(input: Tensor): Tensor
external fun linspace(start: Number, stop: Number, num: Number):Tensor
external fun oneHot(indices: Array<dynamic>, depth: Number, onValue: Number?, offValue: Number?): Tensor
external fun oneHot(indices: Tensor, depth: Number, onValue: Number?, offValue: Number?): Tensor
external fun ones(shape: IntArray, dtype: String?): Tensor
external fun onesLike(x: Array<dynamic>): Tensor
external fun onesLike(x: Tensor): Tensor
external fun print(x: Tensor, verbose: Boolean?): Tensor
external fun range(start: Number, stop: Number, step: Number?, dtype: String?):Tensor
external fun real(input: Array<dynamic>): Tensor
external fun real(input: Tensor): Tensor
external fun truncatedNormal(shape: IntArray, mean: Number?, stdDev: Number?, dtype: String?, seed: Number?): Tensor
external fun variable(initialValue: Tensor, trainable: Boolean?, name: String?, dtype: String?): Variable
external fun zeros(shape: IntArray, dtype: String?): Tensor
external fun zerosLike(x: Array<dynamic>): Tensor
external fun zerosLike(x: Tensor): Tensor

// Classes
open external class Tensor {
    fun flatten(): Tensor
    fun asScalar(): Tensor
    fun as1D(): Tensor
    fun as2D(rows: Int, columns: Int): Tensor
    fun as3D(rows: Int, columns: Int, depth: Int): Tensor
    fun as4D(rows: Int, columns: Int, depth: Int, depth2: Int): Tensor
    fun as5D(rows: Int, columns: Int, depth: Int, depth2: Int, depth3: Int): Tensor
    fun asType(dtype: String): Tensor
    fun buffer(): Promise<TensorBuffer>
    fun bufferSync(): TensorBuffer
    fun array(): Promise<Array<Number>>
    fun arraySync(): Array<Number>
    fun data(): Promise<Array<Number>>
    fun dataSync(): Array<Number>
    fun dispose()
    fun toFloat(): Tensor
    fun toInt(): Tensor
    fun toBool(): Tensor
    fun print(verbose: Boolean? = definedExternally)
    fun reshape(newShape: Array<Int>): Tensor
    fun reshapeAs(x: Tensor): Tensor
    fun expandDims(axis: Int? = definedExternally): Tensor
    fun cumsum(axis: Int? = definedExternally, exclusive: Boolean? = definedExternally, reverse: Boolean? = definedExternally): Tensor
    fun squeeze(axis: Int? = definedExternally): Tensor
    fun clone(): Tensor
    fun toString(verbose: Boolean? = definedExternally): String
}

external class Variable: Tensor {
    fun assign(newValue: Tensor)
}

external class TensorBuffer {
    fun set(value:Array<Number>, vararg locs: Array<Number>)
    fun get(vararg locs: Array<Number>): Array<Number>
    fun toTensor(): Tensor
}

// Transformations
external fun batchToSpaceND(x: Array<Number>, blockShape: IntArray, crops: Array<dynamic>): Tensor
external fun batchToSpaceND(x: Tensor, blockShape: IntArray, crops: Array<dynamic>): Tensor
external fun broadcastTo(x: Array<dynamic>, shape: IntArray): Tensor
external fun broadcastTo(x: Tensor, shape: IntArray): Tensor
external fun cast(x: Array<dynamic>, dtype: String): Tensor
external fun cast(x: Tensor, dtype: String): Tensor
external fun depthToSpace(x: Array<dynamic>, blockSize: Number, dataFormat: String?): Tensor
external fun depthToSpace(x: Tensor, blockSize: Number, dataFormat: String?): Tensor
external fun expandDims(x: Array<dynamic>, axis: Int?): Tensor
external fun expandDims(x: Tensor, axis: Int?): Tensor
external fun pad(x: Array<dynamic>, paddings: Array<dynamic>, constantValue: Number?): Tensor
external fun pad(x: Tensor, paddings: Array<dynamic>, constantValue: Number?): Tensor
external fun reshape(x: Array<dynamic>, shape: IntArray): Tensor
external fun reshape(x: Tensor, shape: IntArray): Tensor
external fun setdiff1dAsync(x: Tensor, y: Tensor): Promise<Array<Tensor>>
external fun setdiff1dAsync(x: Array<dynamic>, y: Tensor): Promise<Array<Tensor>>
external fun setdiff1dAsync(x: Tensor, y: Array<dynamic>): Promise<Array<Tensor>>
external fun setdiff1dAsync(x: Array<dynamic>, y: Array<dynamic>): Promise<Array<Tensor>>
external fun spaceToBatchND(x: Array<dynamic>, blockShape: IntArray, paddings: Array<dynamic>): Tensor
external fun spaceToBatchND(x: Tensor, blockShape: IntArray, paddings: Array<dynamic>): Tensor
external fun squeeze(x: Array<dynamic>, axis: Number?): Tensor
external fun squeeze(x: Tensor, axis: Number?): Tensor

// Slicing and Joining
external fun booleanMaskAsync(tensor: Array<dynamic>, mask: Array<dynamic>, axis: Number?): Tensor
external fun booleanMaskAsync(tensor: Tensor, mask: Array<dynamic>, axis: Number?): Tensor
external fun booleanMaskAsync(tensor: Array<dynamic>, mask: Tensor, axis: Number?): Tensor
external fun booleanMaskAsync(tensor: Tensor, mask: Tensor, axis: Number?): Tensor
external fun concat(tensors: Array<Tensor>, axis: Number?): Tensor
external fun gather(x: Array<dynamic>, indices: Array<dynamic>, axis: Number?): Tensor
external fun gather(x: Array<dynamic>, indices: Tensor, axis: Number?): Tensor
external fun gather(x: Tensor, indices: Array<dynamic>, axis: Number?): Tensor
external fun gather(x: Tensor, indices: Tensor, axis: Number?): Tensor
external fun reverse(x: Array<dynamic>, axis: Number?): Tensor
external fun reverse(x: Tensor, axis: Number?): Tensor
external fun slice(x: Array<dynamic>, begin: Array<Number>, size: IntArray?): Tensor
external fun slice(x: Tensor, begin: Array<Number>, size: IntArray?): Tensor
external fun split(x: Array<dynamic>, numOrSizeSplits: Array<Number>, axis: Number?): Array<Tensor>
external fun split(x: Tensor, numOrSizeSplits: Array<Number>, axis: Number?): Array<Tensor>
external fun stack(tensors: Array<Tensor>, axis: Number?): Tensor
external fun tile(x: Array<dynamic>, reps: Array<Number>): Tensor
external fun tile(x: Tensor, reps: Array<Number>): Tensor
external fun unstack(x: Array<dynamic>, axis: Number?): Array<Tensor>
external fun unstack(x: Tensor, axis: Number?): Array<Tensor>

// Random
external fun multinomial(logits: Array<dynamic>, numSamples: Number, seed: Number?, normalized: Boolean?): Tensor
external fun randomGamma(shape: IntArray, alpha: Number, beta: Number?, dtype: String?, seed: Number?): Tensor
external fun randomNormal(shape: IntArray, mean: Number?, stdDev: Number?, dtype: String?, seed: Number?): Tensor
external fun randomUniform(shape: IntArray, minval: Number?, maxval: Number?, dtype: String?, seed: Number?): Tensor
