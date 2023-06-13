package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Menu {
    private String type;
    private ArrayList<MenuItem> menuItems;

    public Menu(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
