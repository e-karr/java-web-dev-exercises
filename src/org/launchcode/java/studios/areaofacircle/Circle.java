package org.launchcode.java.studios.areaofacircle;

import java.lang.Math;
public class Circle {
    public static Double getArea(String stringRadius) {
        boolean isDouble = true;
        double convertedRadius;

        try {
            convertedRadius = Double.parseDouble(stringRadius);
        } catch (NumberFormatException error) {
            isDouble = false;
        }

        if (stringRadius.isEmpty()) {
            return 0.00;
        } else if (!isDouble) {
            return 0.00;
        } else {
            convertedRadius = Double.parseDouble(stringRadius);

            if (convertedRadius <= 0) {
                return 0.00;
            }
            return Math.PI * convertedRadius * convertedRadius;
        }
    }
}
