package com.example.course_purchase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class css{

    public static void cs()
    {
        //buttons
        Button b1=new Button("home");
        Button b2=new Button("course");
        Button b3=new Button("e_certificates");
        Button b4=new Button("contacts");
        Button b5=new Button("login");
        Button b6=new Button("careers");
        Text ll = new Text("\n\t\t\t\tBUY NOW:");
        ll.setStyle("  -fx-text-fill:orange;  ");

        Label l=new Label("\t\t\t\t");
        Label cn=new Label("Course Name - CSS");
        Label cp=new Label("Course Prize - 70$");
        Label mv=new Label("Materials Available :\nVideos and Documents");
        Label sm=new Label("Study Materials :\nQuestion Bank\n\n");
        Button buy=new Button("Confirm Buying");

        b2.setOnAction(e -> courses.co());
        b3.setOnAction(e -> Ecertificates.certificates());
        b4.setOnAction(e -> Contact.contacts());
        b5.setOnAction(e -> LoginPage.lp());
        b6.setOnAction(e -> Careers.career());
        buy.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information...");
            alert.setContentText("Course added to cart sucessfully");
            alert.showAndWait();});

        Image i=new Image("D:\\Documents\\java_programs\\Javafx\\course_purchase\\src\\main\\java\\com\\example\\course_purchase\\css.jpg");
        ImageView im=new ImageView(i);
        im.setX(50);  im.setY(50);
        /*im.setFitHeight(700);
        im.setFitWidth(410);*/
        im.setPreserveRatio(true);
        Group g=new Group(im);

        Stage st=new Stage();
        GridPane gp=new GridPane();
        gp.setPadding(new Insets(5,5,5,5));
        gp.setHgap(5);
        gp.setVgap(5);
        gp.add(g, 0,1);
        gp.add(ll,0,0);
        gp.add(cn, 0,2);
        gp.add(cp, 0,3);
        gp.add(mv, 0,4);
        gp.add(sm, 0,5);
        gp.add(buy, 0,6);
        HBox h=new HBox(10);
        h.getChildren().addAll(b1,b2,b3,b4,b5,b6);
        BorderPane b=new BorderPane();
        b.setTop(h);
        b.setLeft(l);
        b.setCenter(gp);
        Scene sc=new Scene(b,600,450);
        st.setScene(sc);
        st.show();
    }
}
