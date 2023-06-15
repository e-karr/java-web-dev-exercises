package org.launchcode.java.studios.restaurant;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded = LocalDate.now();
    private boolean special = false;

    public MenuItem(String name, double price, String description, String category, boolean special) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.special = special;
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

    private String printCurrency() {
        Locale usa = new Locale("en", "US");
        Currency dollars = Currency.getInstance(usa);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        return dollarFormat.format(price);
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    private boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    private boolean isNewItem() {
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(getDateAdded(), currentDate);

        if (daysBetween > Menu.DAYS_NEW) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String menuItemStr = "";
        if (isNewItem())
            menuItemStr += "**NEW**";
        if(isSpecial())
            menuItemStr += "\n**SPECIAL**";
        menuItemStr += "\nName: " + getName();
        menuItemStr += "\nPrice: " + printCurrency();
        menuItemStr += "\nDescription: " + getDescription();
        menuItemStr += "\nCategory: " + getCategory();

        return menuItemStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
