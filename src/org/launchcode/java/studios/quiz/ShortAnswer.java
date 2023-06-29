package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class ShortAnswer extends Question{

    private final String correctAnswer;

    public ShortAnswer(int pointValue, String questionText, String correctAnswer) {
        super(pointValue, questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {

    }

    public boolean isCorrectAnswer(String possibleAnswer) {
        return possibleAnswer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Answer must be less than 80 characters.");
        String userAnswer = answer.nextLine();
        while (userAnswer.length() > 80) {
            System.out.println("Answer must be less than 80 characters.");
            userAnswer = answer.nextLine();
        }

        if (isCorrectAnswer(userAnswer)) {
            return getPointValue();
        } else {
            return 0;
        }
    }
}
