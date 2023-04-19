package com.example.tabshoplist;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Item> importantItems = new ArrayList<>();
    private static Storage storage = null;

    public Storage(){

    }

    public static Storage getInstance(){
        if (storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void addImportantItem(Item item){
        importantItems.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> getImportantItems() {
        return importantItems;
    }
}
