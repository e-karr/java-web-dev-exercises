package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceFirstSentence = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?";

        Scanner input = new Scanner(System.in);
        System.out.println("Search term: ");
        String searchTerm = input.next().toLowerCase();
        input.close();

        if (aliceFirstSentence.contains(searchTerm)) {
            System.out.println("The first sentence of Alice in Wonderland does contain '" + searchTerm + "'.");
        } else {
            System.out.println("'" + searchTerm + "' was not in the first sentence of Alice in Wonderland.");
        }
    }
}
