package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean special;

    public MenuItem(String name, double price, String description, String category, boolean special) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.special = special;
        this.dateAdded = new Date();
    }

    public MenuItem(String name, double price, String description, String category) {
        this(name, price, description, category, false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
}
