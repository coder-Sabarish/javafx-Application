package com.example.course_purchase;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
//import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class signup{

    public static void su()
    {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");
        Stage primaryStage=new Stage();
        Label l1 = new Label("\nUsername");
        Label l2 = new Label("Email Address");
        Label l3 = new Label("FirstName");
        Label l4 = new Label("LastName");
        Label l5 = new Label("Password");
        Label l6 = new Label("Confirm Password");
        Label l7 = new Label("Mobile Number");
        Label l8 = new Label("Already have a account?");

        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        PasswordField t5 = new PasswordField();
        PasswordField t6 = new PasswordField();
        TextField t7 = new TextField();
        Hyperlink hp = new Hyperlink("LoginPage");

        Text title = new Text();
        title.setText("Create Account");
        title.setX(10);
        title.setY(20);
        title.setId("title");

        hp.setOnAction(e -> primaryStage.close());

        Button ca = new Button("Create account");
        ca.setId("createaccount");

        GridPane root = new GridPane();
        root.addRow(0,title);
        root.addRow(1,l1,t1);
        root.addRow(2,l2,t2);
        root.addRow(3,l3,t3);
        root.addRow(4,l4,t4);
        root.addRow(5,l5,t5);
        root.addRow(6,l6,t6);
        root.addRow(7,l7,t7);
        root.addRow(8,ca);
        root.addRow(9,l8,hp);
        root.setHgap(20);
        root.setVgap(20);
        root.getStylesheets().add("form.css");

        Scene scene = new Scene(root,600,450);

        primaryStage.setScene(scene);
        primaryStage.show();


        ca.setOnMouseClicked (new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information...");
                alert.setContentText("Account created Successfully!");
                alert.showAndWait();
            }
        });
    }
}