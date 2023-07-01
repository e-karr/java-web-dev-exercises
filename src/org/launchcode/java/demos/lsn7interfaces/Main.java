package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
//        Comparator comparator = new FlavorComparator();

        System.out.println("\nBefore:\n");
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }

//        for (Cone cone : cones) {
//            System.out.println(cone.getName() + ": " + cone.getCost());
//        }

        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }

        System.out.println("\nAfter:\n");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());

//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

//        for (Cone cone : cones) {
//            System.out.println(cone.getName() + ": " + cone.getCost());
//        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        toppings.sort(new ToppingComparator());

        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
    }
}
