package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintWordFiveLetters {

    public static void printWordFiveLetters(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.print("Search for words with length: ");
        int length = input.nextInt();

        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
