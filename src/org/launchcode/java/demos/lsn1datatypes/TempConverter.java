package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;
        input = new Scanner(System.in);

        int tempsEntered = 0;
        int numOfTemps = Integer.parseInt(args[0]);

        while (tempsEntered < numOfTemps) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            fahrenheit = input.nextDouble();

            celsius = (fahrenheit - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsius + "°C");

            tempsEntered++;
        }
        input.close();
    }
}
