/*
 * Copyright (c)  [2011-2015] "Neo Technology" / "Graph Aware Ltd."
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices and license terms. Your use of the source code for these subcomponents is subject to the terms and conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 *
 */

package school.domain

import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.JsonProperty
import com.voodoodyne.jackson.jsog.JSOGGenerator

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@JsonIdentityInfo(generator=JSOGGenerator.class)
public abstract class Entity {

    @JsonProperty("id")
    private Long id

    public Long getId() {
        return id
    }

    @Override
    public boolean equals(Object o) {
        if (this.is(o)) return true
        if (o == null || id == null || getClass() != o.getClass()) return false

        Entity entity = (Entity) o

        if (!id.equals(entity.id)) return false

        return true
    }

    @Override
    public int hashCode() {
        return (id == null) ? -1 : id.hashCode()
    }
}
