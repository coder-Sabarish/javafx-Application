package com.example.course_purchase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

import static javafx.application.Application.launch;

public class Ecertificates{
    static Stage primaryStage=new Stage();

    public static void certificates()
    {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");

        Scene homepage = null;
        b1.setOnAction(e -> primaryStage.setScene(homepage));
        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());

        Label l1 = new Label("\nYour completion certificates will available here...");

        GridPane root = new GridPane();
        root.addRow(0, l1);
        root.getStylesheets().add("form.css");
        HBox h=new HBox(10);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        BorderPane b=new BorderPane();
        b.setTop(h);
        b.setCenter(root);

        Scene scene = new Scene(b,600,450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}