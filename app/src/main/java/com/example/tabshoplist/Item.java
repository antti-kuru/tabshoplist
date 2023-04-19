package com.example.tabshoplist;

public class Item {
    private String name;
    private String extraNotes;

    public Item(String name, String extraNotes){
        this.name = name;
        this.extraNotes = extraNotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(String extraNotes) {
        this.extraNotes = extraNotes;
    }
}
