/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.sevenwonders.core.rest;

import java.util.List;

/**
 * Generates a City model according to the name, {@link WonderModel} and {@link StoragePointModel}.
 *
 * @author Jhonatan Mamani
 */
public class CityModel {

    private String name;
    private WonderModel wonder;
    private StoragePointModel storagePoint;
    private List<ResourceModel> storageModel;


    public CityModel() {
    }

    public void setStorageModel(List<ResourceModel> storageModel) {
        this.storageModel = storageModel;
    }

    public List<ResourceModel> getStorageModel() {
        return storageModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoragePointModel getStoragePoint() {
        return storagePoint;
    }

    public void setStoragePoint(StoragePointModel storagePoint) {
        this.storagePoint = storagePoint;
    }

    public WonderModel getWonder() {
        return wonder;
    }

    public void setWonder(WonderModel wonder) {
        this.wonder = wonder;
    }
}
