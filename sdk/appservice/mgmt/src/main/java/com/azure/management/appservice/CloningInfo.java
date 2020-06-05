// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** The CloningInfo model. */
@Fluent
public final class CloningInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloningInfo.class);

    /*
     * Correlation ID of cloning operation. This ID ties multiple cloning
     * operations
     * together to use the same snapshot.
     */
    @JsonProperty(value = "correlationId")
    private UUID correlationId;

    /*
     * <code>true</code> to overwrite destination app; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "overwrite")
    private Boolean overwrite;

    /*
     * <code>true</code> to clone custom hostnames from source app; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "cloneCustomHostNames")
    private Boolean cloneCustomHostNames;

    /*
     * <code>true</code> to clone source control from source app; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "cloneSourceControl")
    private Boolean cloneSourceControl;

    /*
     * ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "sourceWebAppId", required = true)
    private String sourceWebAppId;

    /*
     * Location of source app ex: West US or North Europe
     */
    @JsonProperty(value = "sourceWebAppLocation")
    private String sourceWebAppLocation;

    /*
     * App Service Environment.
     */
    @JsonProperty(value = "hostingEnvironment")
    private String hostingEnvironment;

    /*
     * Application setting overrides for cloned app. If specified, these
     * settings override the settings cloned
     * from source app. Otherwise, application settings from source app are
     * retained.
     */
    @JsonProperty(value = "appSettingsOverrides")
    private Map<String, String> appSettingsOverrides;

    /*
     * <code>true</code> to configure load balancing for source and destination
     * app.
     */
    @JsonProperty(value = "configureLoadBalancing")
    private Boolean configureLoadBalancing;

    /*
     * ARM resource ID of the Traffic Manager profile to use, if it exists.
     * Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     */
    @JsonProperty(value = "trafficManagerProfileId")
    private String trafficManagerProfileId;

    /*
     * Name of Traffic Manager profile to create. This is only needed if
     * Traffic Manager profile does not already exist.
     */
    @JsonProperty(value = "trafficManagerProfileName")
    private String trafficManagerProfileName;

    /**
     * Get the correlationId property: Correlation ID of cloning operation. This ID ties multiple cloning operations
     * together to use the same snapshot.
     *
     * @return the correlationId value.
     */
    public UUID correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Correlation ID of cloning operation. This ID ties multiple cloning operations
     * together to use the same snapshot.
     *
     * @param correlationId the correlationId value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the overwrite property: &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the overwrite value.
     */
    public Boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set the overwrite property: &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param overwrite the overwrite value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get the cloneCustomHostNames property: &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the cloneCustomHostNames value.
     */
    public Boolean cloneCustomHostNames() {
        return this.cloneCustomHostNames;
    }

    /**
     * Set the cloneCustomHostNames property: &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param cloneCustomHostNames the cloneCustomHostNames value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneCustomHostNames(Boolean cloneCustomHostNames) {
        this.cloneCustomHostNames = cloneCustomHostNames;
        return this;
    }

    /**
     * Get the cloneSourceControl property: &lt;code&gt;true&lt;/code&gt; to clone source control from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the cloneSourceControl value.
     */
    public Boolean cloneSourceControl() {
        return this.cloneSourceControl;
    }

    /**
     * Set the cloneSourceControl property: &lt;code&gt;true&lt;/code&gt; to clone source control from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param cloneSourceControl the cloneSourceControl value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneSourceControl(Boolean cloneSourceControl) {
        this.cloneSourceControl = cloneSourceControl;
        return this;
    }

    /**
     * Get the sourceWebAppId property: ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     *
     * @return the sourceWebAppId value.
     */
    public String sourceWebAppId() {
        return this.sourceWebAppId;
    }

    /**
     * Set the sourceWebAppId property: ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     *
     * @param sourceWebAppId the sourceWebAppId value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withSourceWebAppId(String sourceWebAppId) {
        this.sourceWebAppId = sourceWebAppId;
        return this;
    }

    /**
     * Get the sourceWebAppLocation property: Location of source app ex: West US or North Europe.
     *
     * @return the sourceWebAppLocation value.
     */
    public String sourceWebAppLocation() {
        return this.sourceWebAppLocation;
    }

    /**
     * Set the sourceWebAppLocation property: Location of source app ex: West US or North Europe.
     *
     * @param sourceWebAppLocation the sourceWebAppLocation value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withSourceWebAppLocation(String sourceWebAppLocation) {
        this.sourceWebAppLocation = sourceWebAppLocation;
        return this;
    }

    /**
     * Get the hostingEnvironment property: App Service Environment.
     *
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment property: App Service Environment.
     *
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get the appSettingsOverrides property: Application setting overrides for cloned app. If specified, these settings
     * override the settings cloned from source app. Otherwise, application settings from source app are retained.
     *
     * @return the appSettingsOverrides value.
     */
    public Map<String, String> appSettingsOverrides() {
        return this.appSettingsOverrides;
    }

    /**
     * Set the appSettingsOverrides property: Application setting overrides for cloned app. If specified, these settings
     * override the settings cloned from source app. Otherwise, application settings from source app are retained.
     *
     * @param appSettingsOverrides the appSettingsOverrides value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withAppSettingsOverrides(Map<String, String> appSettingsOverrides) {
        this.appSettingsOverrides = appSettingsOverrides;
        return this;
    }

    /**
     * Get the configureLoadBalancing property: &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and
     * destination app.
     *
     * @return the configureLoadBalancing value.
     */
    public Boolean configureLoadBalancing() {
        return this.configureLoadBalancing;
    }

    /**
     * Set the configureLoadBalancing property: &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and
     * destination app.
     *
     * @param configureLoadBalancing the configureLoadBalancing value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withConfigureLoadBalancing(Boolean configureLoadBalancing) {
        this.configureLoadBalancing = configureLoadBalancing;
        return this;
    }

    /**
     * Get the trafficManagerProfileId property: ARM resource ID of the Traffic Manager profile to use, if it exists.
     * Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     *
     * @return the trafficManagerProfileId value.
     */
    public String trafficManagerProfileId() {
        return this.trafficManagerProfileId;
    }

    /**
     * Set the trafficManagerProfileId property: ARM resource ID of the Traffic Manager profile to use, if it exists.
     * Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     *
     * @param trafficManagerProfileId the trafficManagerProfileId value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileId(String trafficManagerProfileId) {
        this.trafficManagerProfileId = trafficManagerProfileId;
        return this;
    }

    /**
     * Get the trafficManagerProfileName property: Name of Traffic Manager profile to create. This is only needed if
     * Traffic Manager profile does not already exist.
     *
     * @return the trafficManagerProfileName value.
     */
    public String trafficManagerProfileName() {
        return this.trafficManagerProfileName;
    }

    /**
     * Set the trafficManagerProfileName property: Name of Traffic Manager profile to create. This is only needed if
     * Traffic Manager profile does not already exist.
     *
     * @param trafficManagerProfileName the trafficManagerProfileName value to set.
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileName(String trafficManagerProfileName) {
        this.trafficManagerProfileName = trafficManagerProfileName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceWebAppId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceWebAppId in model CloningInfo"));
        }
    }
}