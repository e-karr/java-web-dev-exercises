package org.launchcode.java.studios.countcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.isAlphabetic;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String phrase = input.nextLine();

        phrase = phrase.toLowerCase();

        char[] phraseCharacterArray = phrase.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (char character : phraseCharacterArray) {
            if (!isAlphabetic(character)) {
                continue;
            }

            if (!characterCounts.containsKey(character))
                characterCounts.put(character, 0);

            characterCounts.computeIfPresent(character, (key, val) -> val + 1);
        }

        for (Map.Entry<Character, Integer> character : characterCounts.entrySet())
            System.out.println(character.getKey() + ": " + character.getValue());
    }
}
