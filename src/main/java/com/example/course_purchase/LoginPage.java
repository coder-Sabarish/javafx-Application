package com.example.course_purchase;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LoginPage extends signup{


    public static void lp()
    {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");
        Stage primaryStage=new Stage();
        Label l1 = new Label("\nUsername or Email");
        Label l2 = new Label("Password");
        Label l3 = new Label("Want to create new account?");
        Label l4 = new Label("Sign-up below");

        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());


        TextField t1 = new TextField();
        PasswordField t2 = new PasswordField();


        Button submit = new Button("Submit");
        submit.setId("submit");
        Button fp = new Button("Forget Password");
        Button Signup = new Button("Sign-up");

        Signup.setOnAction(e -> signup.su());

        Text title = new Text();
        title.setText("Sign-in");
        title.setX(50);
        title.setY(50);
        title.setId("title");

        GridPane root = new GridPane();
        root.addRow(0, title);
        root.addRow(1,l1,t1);
        root.addRow(2, l2,t2);
        root.addRow(3,submit,fp);
        root.addRow(4,l3);
        root.addRow(5,l4);
        root.addRow(6,Signup);
        HBox h=new HBox(10);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        BorderPane b=new BorderPane();
        b.setTop(h);
        b.setCenter(root);

        root.setHgap(25);
        root.setVgap(25);

        root.getStylesheets().add("form.css");

        Scene scene = new Scene(b,600,450);

        primaryStage.setScene(scene);
        primaryStage.show();

        submit.setOnMouseClicked (new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information...");
                alert.setContentText("Logged in Successfully!");
                alert.showAndWait();
            }
        });

        fp.setOnMouseClicked (new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                System.out.println("Hello World");
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information...");
                alert.setContentText("Check your mail...");
                alert.showAndWait();
            }
        });

    }

}