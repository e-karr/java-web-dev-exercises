package org.launchcode.java.studios.quiz;
// Design
// answers
    // correct answer
// question
// points
public abstract class Question {

    private int pointValue;

    private final String questionText;

    public Question(int pointValue, String questionText) {
        this.pointValue = pointValue;
        this.questionText = questionText;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public abstract void displayAnswers();
    public abstract int getAnswers();
}
