package com.vsb.javaFXQuiz;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

class Controller {

    @FXML
    private Label questionLabel;
    @FXML
    private ToggleGroup options;
    @FXML
    private Button submitButton;
    @FXML
    private Label timerLabel;
    @FXML
    private Label resultLabel;

    private int questionIndex = 0;
    private int score = 0;
    private int timeLeft = 30; // Time in seconds
    private String[] questionBank = {
            "What is the capital of France?",
            "Who is the president of the USA?",
            "What is the largest planet in our solar system?"
    };
    private String[][] optionsBank = {
            {"Paris", "Berlin", "London", "Madrid"},
            {"Joe Biden", "Donald Trump", "Barack Obama", "George Washington"},
            {"Jupiter", "Saturn", "Uranus", "Neptune"}
    };
    private String[] correctAnswers = {"Paris", "Joe Biden", "Jupiter"};

    @FXML
    public void initialize() {
        displayQuestion();
        submitButton.setOnAction(event -> submitAnswer());
        timerLabel.setText(String.valueOf(timeLeft));
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                if (timeLeft > 0) {
                    timeLeft--;
                    timerLabel.setText(String.valueOf(timeLeft));
                }
            }
        }, 1000, 1000);
    }

    private void displayQuestion() {
        questionLabel.setText(questionBank[questionIndex]);
        options.getToggles().clear();     //clearSelection();
        for (int i = 0; i < 4; i++) {
            RadioButton option = (RadioButton) options.getToggles().get(i);
            option.setText(optionsBank[questionIndex][i]);
        }
    }

    private void submitAnswer() {
        RadioButton selectedOption = (RadioButton) options.getSelectedToggle();
        if (selectedOption != null) {
            String selectedAnswer = selectedOption.getText();
            if (questionIndex < questionBank.length && selectedAnswer.equals(correctAnswers[questionIndex])) {
                score++;
            }
            questionIndex++;
            if (questionIndex < questionBank.length) {
                displayQuestion();
            } else {
                resultLabel.setText("Your final score is: " + score);
            }
        }
    }
}

