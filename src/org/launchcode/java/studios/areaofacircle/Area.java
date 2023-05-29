package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userRadius;
        double radius;
        double area;

        while (true) {
            System.out.println("Enter a radius: ");
            userRadius = input.nextLine();

            if (!ValidateRadius.validateRadius(userRadius))
                System.out.println("Radius must be a positive number");
            else {
                radius = Double.parseDouble(userRadius);
                break;
            }
        }

        input.close();
        area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}
