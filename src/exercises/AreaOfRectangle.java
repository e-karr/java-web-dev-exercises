package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        double length = input.nextDouble();

        System.out.println("Enter rectangle width: ");
        double width = input.nextDouble();
        input.close();

        double areaOfRectangle = length * width;

        System.out.println("Area = " + areaOfRectangle);
    }
}
