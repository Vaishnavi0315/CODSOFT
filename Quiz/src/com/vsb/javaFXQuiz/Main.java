package com.vsb.javaFXQuiz;

import javafx.application.Application;
                import javafx.fxml.FXMLLoader;
                import javafx.scene.Parent;
                import javafx.scene.Scene;
                import javafx.stage.Stage;

class Quiz extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("quiz.fxml"));
        primaryStage.setTitle("Quiz Application");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}