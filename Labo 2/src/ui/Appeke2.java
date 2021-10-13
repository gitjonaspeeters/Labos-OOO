package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Appeke2 extends Application {


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Codeer je tekst!");
        Label label = new Label("Voor je tekst in.");
        Scene scene = new Scene(label, 400,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}