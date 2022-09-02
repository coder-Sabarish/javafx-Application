package com.example.course_purchase;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class courses{
    static Button b1,b3,b2,b4,b5,b6;
    static Button html1,css1,js1,react1;

    public static void co()
    {
        //buttons
        Scene homepage;
        Stage stage=new Stage();
        b1=new Button("home");
        b2=new Button("course");
        b3=new Button("e_certificates");
        b4=new Button("contacts");
        b5=new Button("login");
        b6=new Button("careers");
        html1=new Button("html");
        css1=new Button("css");
        js1=new Button("js");
        react1=new Button("react");
        Label l=new Label("\n\n");
        Label t=new Label("\t\t");

        b2.setOnAction(e -> {
            courses.co();
            stage.close();
        });
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());
        html1.setOnAction(e -> html.ht());
        css1.setOnAction(e -> css.cs());
        js1.setOnAction(e -> js.j());
        react1.setOnAction(e -> react.re());
        html1.setMinHeight(100);
        html1.setMinWidth(100);
        css1.setMinHeight(100);
        css1.setMinWidth(100);
        js1.setMinHeight(100);
        js1.setMinWidth(100);
        react1.setMinHeight(100);
        react1.setMinWidth(100);

        //layout
        HBox h=new HBox(10);
        GridPane gp=new GridPane();
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(20);
        gp.setVgap(20);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        gp.add(html1,0,0); gp.add(css1,1,0);
        gp.add(js1,0,1); gp.add(react1,1,1);
        BorderPane b=new BorderPane();
        b.setTop(h);
        b.setLeft(t);
        b.setCenter(gp);

        homepage=new Scene(b,600,450);

        //finishing
        stage.setScene(homepage);
        stage.show();
    }
}