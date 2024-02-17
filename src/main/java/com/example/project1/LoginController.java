package com.example.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private ToggleGroup loginChoice;

    @FXML
    private ToggleGroup loginChoice1;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton rButton1;

    @FXML
    private RadioButton rButton2;

    @FXML
    private RadioButton rButton3;

    @FXML
    private RadioButton rButton4;

    @FXML
    private TextField usernameField;

    @FXML
    void login(ActionEvent event) throws IOException {
        if(rButton3.isSelected()){
            if(usernameField.getText().equals("Fatima")&&passwordField.getText().equals("123")){
                ListData.center_username=usernameField.getText();
                try {
                    ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Center.fxml"));
                    StackPane stackPane = fxmlLoader.load();
                    Stage stage = new Stage();
                    Scene scene=new Scene(stackPane);
                    stage.setScene(scene);
                    stage.setTitle("Center Page");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           else if(usernameField.getText().equals("Joumana")&&passwordField.getText().equals("123")){
                ListData.center_username=usernameField.getText();
                try {
                    ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Center.fxml"));
                    StackPane stackPane = fxmlLoader.load();
                    Stage stage = new Stage();
                    Scene scene=new Scene(stackPane);
                    stage.setScene(scene);
                    stage.setTitle("Center Page");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


    }
        if(rButton2.isSelected()){
            if(usernameField.getText().equals("FatimaSheaib")&&passwordField.getText().equals("123")){
                ListData.teacher_username=usernameField.getText();
                try {
                    ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TeacherPage.fxml"));
                    StackPane stackPane = fxmlLoader.load();
                    Stage stage = new Stage();
                    Scene scene=new Scene(stackPane);
                    stage.setScene(scene);
                    stage.setTitle("Teacher Page");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(usernameField.getText().equals("Joumana")&&passwordField.getText().equals("123")){
                ListData.center_username=usernameField.getText();
                try {
                    ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TeacherPage.fxml"));
                    StackPane stackPane = fxmlLoader.load();
                    Stage stage = new Stage();
                    Scene scene=new Scene(stackPane);
                    stage.setScene(scene);
                    stage.setTitle("Teacher Page");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    @FXML
    void switchToSignUp(ActionEvent event) {
        try {
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-up.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene=new Scene(anchorPane);
            stage.setScene(scene);
            stage.setTitle("Sign Up");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
