package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class RestaurantMenuApp {
    public static void main(String[] args) {
        //create menu items
        MenuItem blt = new MenuItem("BLT", 12, "Bacon, Lettuce, & Tomato sandwich", "handhelds");
        MenuItem tomatoSoup = new MenuItem("Tomato Soup", 5, "Hot & Steamy Tomato soup", "soups", true);

        //create menu
        Menu lunchMenu = new Menu("lunch");

        //add item to menu
        lunchMenu.add(blt);
        System.out.println(lunchMenu);

        //add another item to menu
        lunchMenu.add(tomatoSoup);
        System.out.println(lunchMenu);

        //remove item from menu
        lunchMenu.remove(blt);
        System.out.println(lunchMenu);

        //print individual menu item
        System.out.println(blt);

        //create duplicate item
        MenuItem tomatoSoupDupe = new MenuItem("Tomato Soup", 5, "Fresh Tomatoes", "soups");

        //Try to add duplicate to lunch menu
        lunchMenu.add(tomatoSoupDupe);
        System.out.println(lunchMenu);
    }
}
