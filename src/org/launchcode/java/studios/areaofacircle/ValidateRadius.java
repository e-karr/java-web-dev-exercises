package org.launchcode.java.studios.areaofacircle;

public class ValidateRadius {
    public static boolean validateRadius(String radius) {
        boolean isDouble = true;
        double doubleRadius;

        if (radius.isEmpty())
            return false;

        try {
            doubleRadius = Double.parseDouble(radius);
        } catch (NumberFormatException error) {
            isDouble = false;
        }

        if (!isDouble)
            return false;
        else {
            doubleRadius = Double.parseDouble(radius);

            if (doubleRadius <= 0)
                return false;
        }

        return true;
    }
}
