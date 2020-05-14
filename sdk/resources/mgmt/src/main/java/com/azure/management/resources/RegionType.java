// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RegionType. */
public final class RegionType extends ExpandableStringEnum<RegionType> {
    /** Static value Physical for RegionType. */
    public static final RegionType PHYSICAL = fromString("Physical");

    /** Static value Logical for RegionType. */
    public static final RegionType LOGICAL = fromString("Logical");

    /**
     * Creates or finds a RegionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegionType.
     */
    @JsonCreator
    public static RegionType fromString(String name) {
        return fromString(name, RegionType.class);
    }

    /** @return known RegionType values. */
    public static Collection<RegionType> values() {
        return values(RegionType.class);
    }
}