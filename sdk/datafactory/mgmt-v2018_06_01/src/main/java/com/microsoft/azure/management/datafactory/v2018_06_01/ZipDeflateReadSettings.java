/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ZipDeflate compression read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ZipDeflateReadSettings.class)
@JsonTypeName("ZipDeflateReadSettings")
public class ZipDeflateReadSettings extends CompressionReadSettings {
    /**
     * Preserve the zip file name as folder path. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "preserveZipFileNameAsFolder")
    private Object preserveZipFileNameAsFolder;

    /**
     * Get preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     *
     * @return the preserveZipFileNameAsFolder value
     */
    public Object preserveZipFileNameAsFolder() {
        return this.preserveZipFileNameAsFolder;
    }

    /**
     * Set preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     *
     * @param preserveZipFileNameAsFolder the preserveZipFileNameAsFolder value to set
     * @return the ZipDeflateReadSettings object itself.
     */
    public ZipDeflateReadSettings withPreserveZipFileNameAsFolder(Object preserveZipFileNameAsFolder) {
        this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
        return this;
    }

}