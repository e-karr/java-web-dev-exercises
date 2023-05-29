package exercises;

import java.util.ArrayList;

import static exercises.PrintWordFiveLetters.printWordFiveLetters;
import static exercises.SumEvenNumbers.sumEvenNumbers;

public class ArrayListExercise {
    public static void main(String[] args) {
        // create ArrayList of 10 integers and call sumEvenNumbers method
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(6);
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(2);
//        numbers.add(8);
//        numbers.add(12);
//        numbers.add(17);
//        numbers.add(22);
//
//        int sum = sumEvenNumbers(numbers);
//        System.out.println(sum);

        ArrayList<String> words = new ArrayList<>();
        words.add("hazel");
        words.add("hammond");
        words.add("jimmy");
        words.add("elizabeth");

        printWordFiveLetters(words);
    }
}
