package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        boolean canCompute = false;
        String userInput;
        double radius;
        double area;

//        do {
//            System.out.println("Enter a radius: ");
//            userInput = input.nextLine();
//
//            if (userInput.isEmpty()) {
//                continue;
//            }
//
//            if (input.hasNextDouble() && (radius = input.nextDouble()) > 0) {
//                canCompute = true;
//            }
//        } while (!canCompute);
//
//        radius = input.nextDouble();
//        area = Circle.getArea(radius);
//        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        while (true) {
            System.out.println("Enter a radius: ");
            userInput = input.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Error: must enter a value");
                continue;
            }

            if (!(input.hasNextDouble())) {
                System.out.println("Error: must enter a number");
                continue;
            }

            if ((radius = input.nextDouble()) <= 0) {
                System.out.println("Error: must enter a positive number");
                continue;
            }

            break;
        }

        radius = input.nextDouble();
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        input.close();
    }
}
