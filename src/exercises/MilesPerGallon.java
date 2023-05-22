package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double milesDriven;
        double gallonsGasConsumed;
        double milesPerGallon;

        System.out.println("Miles driven: ");
        milesDriven = input.nextDouble();

        System.out.println("Gas consumed (in gallons): ");
        gallonsGasConsumed = input.nextDouble();

        input.close();

        milesPerGallon = milesDriven / gallonsGasConsumed;

        System.out.println("Miles per gallon: " + milesPerGallon);

    }
}
