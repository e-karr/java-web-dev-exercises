package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {
    private final ArrayList<String> possibleAnswers;
    private final ArrayList<Integer> correctAnswers;

    public Checkbox(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(correctAnswers.size(), text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayAnswers () {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println((i + 1) + ": " + possibleAnswers.get(i));
        }
    }

    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (Integer integer : check) {
            if (correctAnswers.contains(integer)) {
                answersCorrect++;
            }
        }
        return answersCorrect;
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> usersAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.equals("y") && usersAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            usersAnswers.add(option);

            System.out.println("For this question, there are multiple correct answers. To continue answering the question, enter 'y'. To stop, enter 'n'");
            goingToContinue = userContinue.nextLine();
        }

        return checkAnswers(usersAnswers);
    }
}
