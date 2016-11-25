package org.fundacionjala.sevenwonders.core.rest;

import org.fundacionjala.sevenwonders.core.ResourceType;

import java.util.Map;

/**
 * Created by Dell on 11/25/2016.
 */
public class ResourceModel {
    private String name;
    private int count;

    public ResourceModel(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
