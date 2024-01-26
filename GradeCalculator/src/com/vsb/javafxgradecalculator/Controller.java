package com.vsb.javafxgradecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField subject1TextField;

    @FXML
    private TextField subject2TextField;

    @FXML
    private TextField subject3TextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label totalMarksLabel;

    @FXML
    private Label averagePercentageLabel;

    @FXML
    private Label gradeLabel;

    @FXML
    public void initialize() {
        // Set up initialization if needed
    }

    @FXML
    public void calculateGrade() {
        try {
            // Parse input values
            int subject1 = Integer.parseInt(subject1TextField.getText());
            int subject2 = Integer.parseInt(subject2TextField.getText());
            int subject3 = Integer.parseInt(subject3TextField.getText());

            // Calculate total marks and average percentage
            int totalMarks = subject1 + subject2 + subject3;
            double averagePercentage = totalMarks / 3.0;

            // Display results
            totalMarksLabel.setText("Total Marks: " + totalMarks);
            averagePercentageLabel.setText("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");

            // Assign grades based on average percentage
            String grade;
            if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            gradeLabel.setText("Grade: " + grade);

        } catch (NumberFormatException e) {
            totalMarksLabel.setText("Please enter valid marks for all subjects");
            averagePercentageLabel.setText("");
            gradeLabel.setText("");
        }
    }
}



