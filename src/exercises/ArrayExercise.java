package exercises;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        // print each value in numbers array
//        for (int i : numbers)
//            System.out.println(i);

        // print only odd numbers
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                System.out.println(numbers[i]);
//            }
//        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        // split into array on each space
//        String[] phraseArray = phrase.split(" ");
//        System.out.println(Arrays.toString(phraseArray));

        // split into array on each sentence
        String[] phraseArray = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArray));
    }
}
