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
@file:JsQualifier("io")
package com.fortytwoapps.tfkt.models.io

import com.fortytwoapps.tfkt.models.Sequential
import org.w3c.files.File
import kotlin.js.Json
import kotlin.js.Promise

external class IOHandler {

}

// Loading
external fun browserDownloads(fileNamePrefix: String): IOHandler
external fun browserFiles(files: Array<File>): IOHandler
external fun http(path: String, loadOptions: dynamic = definedExternally): IOHandler

// Management
@JsName("copyModel")
internal external fun copyModelJS(sourceUrl: String, destURL: String): Promise<Json>
@JsName("listModels")
internal external fun listModelsJS(): Promise<Json>
@JsName("removeModel")
internal external fun removeModelJS(url: String): Promise<Json>

// IO
private external fun copyModel(pathOrIOHandler: dynamic = definedExternally, options: dynamic = definedExternally): Sequential
