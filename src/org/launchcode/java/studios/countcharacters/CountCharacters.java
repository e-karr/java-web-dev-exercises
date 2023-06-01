package org.launchcode.java.studios.countcharacters;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isAlphabetic;

public class CountCharacters {
    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into a form " +
                "that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

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
