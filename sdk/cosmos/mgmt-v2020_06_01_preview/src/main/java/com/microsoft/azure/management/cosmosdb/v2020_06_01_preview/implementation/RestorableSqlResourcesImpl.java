/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableSqlResources;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableDatabaseAccountLocationDatabaseRestoreResource;

class RestorableSqlResourcesImpl extends WrapperImpl<RestorableSqlResourcesInner> implements RestorableSqlResources {
    private final CosmosDBManager manager;

    RestorableSqlResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().restorableSqlResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    private RestorableDatabaseAccountLocationDatabaseRestoreResourceImpl wrapModel(DatabaseRestoreResourceInner inner) {
        return  new RestorableDatabaseAccountLocationDatabaseRestoreResourceImpl(inner, manager());
    }

    @Override
    public Observable<RestorableDatabaseAccountLocationDatabaseRestoreResource> listAsync(String location, String instanceId) {
        RestorableSqlResourcesInner client = this.inner();
        return client.listAsync(location, instanceId)
        .flatMap(new Func1<List<DatabaseRestoreResourceInner>, Observable<DatabaseRestoreResourceInner>>() {
            @Override
            public Observable<DatabaseRestoreResourceInner> call(List<DatabaseRestoreResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseRestoreResourceInner, RestorableDatabaseAccountLocationDatabaseRestoreResource>() {
            @Override
            public RestorableDatabaseAccountLocationDatabaseRestoreResource call(DatabaseRestoreResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
