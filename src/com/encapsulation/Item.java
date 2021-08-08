package com.encapsulation;

public class Item {
    private String name;
    private String type;
    private int id;
    private boolean available;

    Item (String name, String type, int id, boolean available) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
