/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The Nonce model.
 */
@JsonFlatten
public class Nonce extends ProxyOnlyResource {
    /**
     * The validateNonce property.
     */
    @JsonProperty(value = "properties.validateNonce")
    private Boolean validateNonce;

    /**
     * The nonceExpirationInterval property.
     */
    @JsonProperty(value = "properties.nonceExpirationInterval")
    private String nonceExpirationInterval;

    /**
     * Get the validateNonce value.
     *
     * @return the validateNonce value
     */
    public Boolean validateNonce() {
        return this.validateNonce;
    }

    /**
     * Set the validateNonce value.
     *
     * @param validateNonce the validateNonce value to set
     * @return the Nonce object itself.
     */
    public Nonce withValidateNonce(Boolean validateNonce) {
        this.validateNonce = validateNonce;
        return this;
    }

    /**
     * Get the nonceExpirationInterval value.
     *
     * @return the nonceExpirationInterval value
     */
    public String nonceExpirationInterval() {
        return this.nonceExpirationInterval;
    }

    /**
     * Set the nonceExpirationInterval value.
     *
     * @param nonceExpirationInterval the nonceExpirationInterval value to set
     * @return the Nonce object itself.
     */
    public Nonce withNonceExpirationInterval(String nonceExpirationInterval) {
        this.nonceExpirationInterval = nonceExpirationInterval;
        return this;
    }

}
