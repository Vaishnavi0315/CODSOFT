package com.vsb.javaFxQuizApp;

public class Question {
    private String question;
    private String[] options;
    private int correctOptionIndex;
    public Question(String s, String[] strings, int i) {
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}
