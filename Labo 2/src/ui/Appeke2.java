package ui;

import domain.GeheimSchrift;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Appeke2 extends Application {


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Codeer je tekst!");

        Label label = new Label("Voor je tekst in.");
        TextField textfield = new TextField();
        textfield.setText("Geheime tekst");

        Button b = new Button("Volgende");
        Button Spiegel = new Button("Spiegel");
        Button Ceasar = new Button("Ceasar");
        Button Codeer = new Button("Codeer");
        Button Decodeer= new Button("Decodeer");


        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text=textfield.getText();
                primaryStage.close();
            }
        });
        Spiegel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                schrift="Spiegel";

            }
        });
        Ceasar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                schrift="Ceasar";
            }
        });
        Codeer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                codeer ="Codeer";

            }
        });
        Decodeer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                codeer="Codeer";
            }
        });



        GridPane root = new GridPane();
        root.addRow(0, label);
        root.addRow(1, textfield);
        root.addRow(2, Spiegel);
        root.addRow(2, Ceasar);
        root.addRow(3, Codeer);
        root.addRow(3, Decodeer);
        root.addRow(4, b);

        Scene scene1 = new Scene(root, 400, 200);


        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public String coderen(String text){
        GeheimSchrift result = new GeheimSchrift(text);
        if(schrift == "Ceasar"){

            if(codeer = "Codeer"){
                text.
            }
        }
    }











    public static void main(String[] args) {
        Application.launch(args);
    }

}