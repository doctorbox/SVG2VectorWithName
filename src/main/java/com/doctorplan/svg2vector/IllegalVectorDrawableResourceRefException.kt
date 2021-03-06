/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.doctorplan.svg2vector

import com.android.ide.common.blame.SourcePosition

/**
 * Runtime exception that a resource reference incorrectly referenced from vector drawables
 * causing PNG generation to fail.
 */
class IllegalVectorDrawableResourceRefException(
        val value: String, val sourcePosition: SourcePosition, message: String?)
    : RuntimeException(message)
