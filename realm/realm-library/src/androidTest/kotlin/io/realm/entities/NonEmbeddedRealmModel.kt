/*
 * Copyright 2020 Realm Inc.
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
package io.realm.entities

import io.realm.RealmObject
import io.realm.annotations.RealmClass
import java.util.*

/**
 * Just a regular RealmObject. As this class cannot represent an embedded object, it is used to test
 * that the embedded object creation process detects incorrectly specified relationships between
 * parents and children.
 */
open class NonEmbeddedRealmModel(
        var id: String = UUID.randomUUID().toString()
) : RealmObject()
