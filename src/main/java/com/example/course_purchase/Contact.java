package com.example.course_purchase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Contact{

    public static void contacts()
    {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");

        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());

        Stage primaryStage=new Stage();
        Label l = new Label("\n\t\t\t\tCONTACT INFORMATION:");
        l.setStyle("  -fx-text-fill:green;  ");
        Label l1 = new Label("\n\tPRIYADHARSHINI KRISHNAMOORTHY\r\n"
                + "\tCONTACT INFO:\r\n"
                + "\tEmail : priyadharshini200210@gmail.com\r\n"
                + "\tPhone Number : 7548817893"
                +  "\r\n");
        l1.setStyle(" -fx-text-fill:black;");
        Label l2 = new Label("\tSABARISH K\r\n"
                + "\tCONTACT INFO:\r\n"
                + "\tEmail : sabarikannan500@gmail.com\r\n"
                + "\tPhone Number : 9500242912"
                +  "\r\n");
        l2.setStyle(" -fx-text-fill:black;");
        Label l3 = new Label("\tRAGUL K\r\n"
                +  "\tCONTACT INFO\r\n"
                +  "\tEmail : ragulk.20cse@kongu.edu\r\n"
                +  "\tPhone Number : 9384387249"
                +  "\r\n");
        l3.setStyle(" -fx-text-fill:black;");
        GridPane root = new GridPane();
        root.addRow(0,l);
        root.addRow(1,l1);
        root.addRow(2, l2);
        root.addRow(3, l3);
        root.setHgap(10);
        root.setVgap(10);
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