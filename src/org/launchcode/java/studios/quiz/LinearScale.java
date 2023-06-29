package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearScale extends Question{

    private final ArrayList<Integer> scale;

    public LinearScale(int pointValue, String questionText, ArrayList<Integer> scale) {
        super(pointValue, questionText);
        this.scale = scale;
    }

    @Override
    public void displayAnswers() {
        for (int number : scale) {
            System.out.println(number);
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter a number from the scale above. For example, to select the first option, enter 1");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        return getPointValue();
    }
}
