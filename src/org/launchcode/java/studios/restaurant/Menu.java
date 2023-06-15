package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static final int DAYS_NEW = 30;
    private String type;
    private ArrayList<MenuItem> menuItems;
    private LocalDate lastUpdated = LocalDate.now();

    public Menu(String type, ArrayList<MenuItem> menuItems) {
        this.type = type;
        this.menuItems = menuItems;
    }

    public Menu(String type) {
        this(type, new ArrayList<>());
    }

    public boolean add(MenuItem newItem) {
        boolean addItem = this.menuItems.add(newItem);

        if (!addItem) {
            return false;
        }
        setLastUpdated(LocalDate.now());
        return true;
    }

    public boolean remove(MenuItem item) {
        boolean removeItem = this.menuItems.remove(item);

        if (!removeItem) {
            return false;
        }
        setLastUpdated(LocalDate.now());
        return true;
    }

    @Override
    public String toString() {
        String fullMenu = "";
        fullMenu += "Type: " + getType();
        fullMenu += "\nLast Updated: " + getLastUpdated();
        fullMenu += "\n**********";

        for (MenuItem item : menuItems) {
            fullMenu += "\n" + item + "\n";
        }

        return fullMenu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        setLastUpdated(LocalDate.now());
        this.type = type;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        setLastUpdated(LocalDate.now());
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
