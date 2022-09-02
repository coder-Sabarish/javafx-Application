package com.example.course_purchase;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class menu_bar extends Application {
    Scene homepage;
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");

        //home.setOnAction(e -> LoginPage.loginpage);

        //layout
        HBox h=new HBox(10);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        BorderPane b=new BorderPane();
        b.setTop(h);
        homepage=new Scene(b,500,300);

        //finishing
        stage.setTitle("menubar");
        stage.setScene(homepage);
        stage.show();
    }
}