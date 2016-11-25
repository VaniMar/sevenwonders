package org.fundacionjala.sevenwonders.core;

import org.fundacionjala.sevenwonders.core.rest.ResourceModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 11/25/2016.
 */
public class StorageProvider {
    private Storage storage;
    private List<ResourceModel> storageModel;

    public StorageProvider(){
        storage = new Storage();
        storageModel = new ArrayList<>(8);
    }

    public Storage getStorage() {
        return storage;
    }

    public void fillResources() {
        storage.addResource(ResourceType.BRICK, 5);
        storage.addResource(ResourceType.TEXTILE, 3);
        storage.addResource(ResourceType.GLASS, 8);
        storage.addResource(ResourceType.ORE, 2);
        storage.addResource(ResourceType.PAPYRUS, 1);
        storage.addResource(ResourceType.STONE, 4);
        storage.addResource(ResourceType.WOOD, 6);
        storage.addResource(ResourceType.COIN,10);


        storageModel.add(new ResourceModel(ResourceType.BRICK.toString()));
        storageModel.add(new ResourceModel(ResourceType.TEXTILE.toString()));
        storageModel.add(new ResourceModel(ResourceType.GLASS.toString()));
        storageModel.add(new ResourceModel(ResourceType.ORE.toString()));
        storageModel.add(new ResourceModel(ResourceType.PAPYRUS.toString()));
        storageModel.add(new ResourceModel(ResourceType.STONE.toString()));
        storageModel.add(new ResourceModel(ResourceType.WOOD.toString()));
        storageModel.add(new ResourceModel(ResourceType.COIN.toString()));
    }


}
