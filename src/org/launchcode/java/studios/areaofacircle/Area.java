package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String radius = input.nextLine();
        double area = Circle.getArea(radius);
        boolean areaInvalid = area == 0.00;

        if (areaInvalid) {
            System.out.println("Error: must enter a positive number");
            main(new String[0]);
        } else {
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            input.close();
        }
    }
}
