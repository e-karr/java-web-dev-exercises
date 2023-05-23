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

        if (aliceFirstSentence.toLowerCase().contains(searchTerm)) {
            int searchTermIndex = aliceFirstSentence.toLowerCase().indexOf(searchTerm);
            int searchTermLength = searchTerm.length();
            System.out.println("Index: " + searchTermIndex + " Length: " + searchTermLength);

//            String substring = aliceFirstSentence.substring(searchTermIndex, searchTermIndex + searchTermLength);
            String newSentence = aliceFirstSentence.toLowerCase().replace(searchTerm, "");
            System.out.println(newSentence);
        } else {
            System.out.println("Search term not found");
        }
    }
}
