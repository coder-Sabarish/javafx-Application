package com.example.course_purchase;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class home extends Application {
    static Button b1,b2,b3,b4,b5,b6;
    Scene homepage;
    public static void main(String args[]) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        //buttons
        b1=new Button("home");
        b2=new Button("course");
        b3=new Button("e_certificates");
        b4=new Button("contacts");
        b5=new Button("login");
        b6=new Button("careers");
        Label t = new Label("\n\n\t\t\t\t\t\tLEARN AND BECOME A LEGEND");
        t.setStyle("  -fx-text-fill:orange;  ");

        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());

        //image
        Image i=new Image("D:\\Documents\\java_programs\\Javafx\\course_purchase\\src\\main\\java\\com\\example\\course_purchase\\img.jpg");
        Image i1=new Image("D:\\Documents\\java_programs\\Javafx\\course_purchase\\src\\main\\java\\com\\example\\course_purchase\\img1.jpg");
        ImageView im=new ImageView(i);
        im.setX(50);  im.setY(50);
        im.setPreserveRatio(true);
        Group g=new Group(im);
        ImageView im1=new ImageView(i1);
        im1.setX(50);  im1.setY(50);
        im1.setFitHeight(300);
        im1.setFitWidth(100);
        //im1.setPreserveRatio(true);
        Group left=new Group(im1);

        //layout
        HBox h=new HBox(10);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        GridPane stack =new GridPane();
        stack.add(t,0,0);
        stack.add(g,0,1);
        StackPane leftstack=new StackPane();
        leftstack.getChildren().add(left);
        BorderPane b=new BorderPane();
        b.setCenter(stack);
        b.setTop(h);
        b.setLeft(leftstack);
        homepage=new Scene(b,600,450);

        //finishing
        stage.setTitle("menubar");
        stage.setScene(homepage);
        stage.show();
    }

}