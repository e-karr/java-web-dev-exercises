package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        String userInput = input.nextLine();
        input.close();

        if (userInput.isEmpty()) {
            System.out.println("Error: must enter a value");
            return;
        }

        for (int i = 0; i < userInput.length(); i++) {
            if (!isDigit(userInput.charAt(i))) {
                System.out.println("Error: must enter a number");
                return;
            }
        }

        double radius = Double.parseDouble(userInput);

        if (radius < 1) {
            System.out.println("Error: radius cannot be negative");
            return;
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
