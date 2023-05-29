package exercises;

import java.util.ArrayList;

public class PrintWordFiveLetters {

    public static void printWordFiveLetters(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
