package com.vsb.javaFxQuizApp;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.ArrayList;

public class QuizController {

    @FXML
    private Label questionLabel;

    @FXML
    private Label timerLabel;

    private int timeSeconds = 10; // Initial time for each question
    private Timeline timeline;

    @FXML
    public void initialize() {
        initializeQuestions();
        showNextQuestion(); // Initialize with the first question
        startTimer();
    }

    ArrayList<Object> questions = new ArrayList<>();
    private void initializeQuestions() {
        // Example questions, replace with your actual questions

        questions.add(new Question("What is the capital of France?", new String[]{"Paris", "Berlin", "London", "Rome"}, 0));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Mars", "Jupiter", "Venus", "Saturn"}, 0));
        // Add more questions...
    }
    private void startTimer() {
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), this::updateTimer));
        timeline.play();
    }

    private void updateTimer(ActionEvent event) {
        timeSeconds--;
        timerLabel.setText("Timer: " + timeSeconds);

        if (timeSeconds <= 0) {
            submitAnswer();
        }
    }

    private void showNextQuestion() {
        // Logic to fetch and display the next question and options
        //int[] currentQuestionIndex = new int[0];
        int currentQuestionIndex=0;
        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = (Question) questions.get(currentQuestionIndex);
            questionLabel.setText(currentQuestion.getQuestion());

            String[] options = currentQuestion.getOptions();
            // Assuming you have four options as buttons
            for (int i = 0; i < 4; i++) {
                ((Button) questionLabel.getScene().lookup("#option" + (i + 1))).setText(options[i]);
            }

            currentQuestionIndex++;
        } else {
            // Quiz completed, show result or perform any other actions
            System.out.println("Quiz completed!");
        }
        questionLabel.setText("Next Question goes here");
    }



    @FXML
    private void submitAnswer() {

        ActionEvent event= new ActionEvent();
        String selectedOption = ((Button) event.getSource()).getText();
        int currentQuestionIndex=0;
        Question currentQuestion = (Question) questions.get(currentQuestionIndex - 1); // Adjust index

        if (selectedOption.equals(currentQuestion.getOptions()[currentQuestion.getCorrectOptionIndex()])) {
            // Correct answer
            System.out.println("Correct!");
            int score=0;
            score++;
        } else {
            // Incorrect answer
            System.out.println("Incorrect!");
        }

        // Reset timer for the next question
        timeSeconds = 10;
        timerLabel.setText("Timer: " + timeSeconds);

        // Show the next question
        showNextQuestion();
    }
}
