package com.example.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestController {

    @FXML
    private Button Teacherdashboard_btn;

    @FXML
    private Label Teachergreet_username;

    @FXML
    private Button Teacherlogout;
    @FXML
    void switchForm(ActionEvent event) {

    }

@FXML
    void sign(ActionEvent event) {
        try {
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-up.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene=new Scene(anchorPane);
            stage.setScene(scene);
            stage.setTitle("Sign Up Page");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
