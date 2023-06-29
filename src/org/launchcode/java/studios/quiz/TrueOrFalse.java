package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class TrueOrFalse extends Question {
    private final boolean correctAnswer;

    public TrueOrFalse(int pointValue, String text, boolean correctAnswer) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer (boolean possibleAnswer) {
        return possibleAnswer == correctAnswer;
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for True and 'f' for False");
        String userAnswer = answer.nextLine();
        if (userAnswer.equals("t")) {
            if (isCorrectAnswer(true)) {
                return getPointValue();
            }
            else {
                return 0;
            }
        }
        else {
            if (isCorrectAnswer(false)) {
                return getPointValue();
            }
            else {
                return 0;
            }
        }
    }
}
