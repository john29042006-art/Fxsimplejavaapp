package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        // Requirement 2: Initial message with your name
        String originalMessage = "Welcome, PHIRI JOHN";
        Label message = new Label(originalMessage);

        // Requirement 3: First button labeled "Start"
        Button startButton = new Button("Start");
        startButton.setOnAction(event ->
                message.setText("Great! You clicked the button.")
        );

        // Requirement 4: Second button labeled "Reset" that restores the original text
        Button resetButton = new Button("Reset");
        resetButton.setOnAction(event ->
                message.setText(originalMessage)
        );

        // Group the buttons horizontally side-by-side
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(startButton, resetButton);

        // Vertical layout for the message label and button row
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, buttonBox);

        Scene scene = new Scene(layout, 500, 300);

        // Requirement 1: Window title including your student number
        stage.setTitle("My First JavaFX Application - 202502668");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}