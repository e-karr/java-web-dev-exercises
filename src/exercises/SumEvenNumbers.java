package exercises;

import java.util.ArrayList;

public class SumEvenNumbers {

    public static int sumEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int i : numbers) {
            if (i % 2 == 0)
                sum += i;
        }

        return sum;
    }
}
