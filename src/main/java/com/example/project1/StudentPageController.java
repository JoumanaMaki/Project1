package com.example.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentPageController {

    @FXML
    private AnchorPane DropCourse;

    @FXML
    private AnchorPane Enroll_Course;

    @FXML
    private AnchorPane Student_Dashboard;
    @FXML
    private Label Teachergreet_username;

    @FXML
    private Label TeacherheaderLabel;

    @FXML
    private Button logout;

    @FXML
    private Button addStudent_addBtn;

    @FXML
    private TableColumn<?, ?> addStudent_col_course;

    @FXML
    private TableColumn<?, ?> addStudent_col_dateInsert;

    @FXML
    private TableColumn<?, ?> addStudent_col_name;

    @FXML
    private TableColumn<?, ?> addStudent_col_pay;

    @FXML
    private TableColumn<?, ?> addStudent_col_section;

    @FXML
    private TableColumn<?, ?> addStudent_col_status;

    @FXML
    private TableColumn<?, ?> addStudent_col_statusPayment;

    @FXML
    private TableColumn<?, ?> addStudent_col_studentNumber;

    @FXML
    private TableColumn<?, ?> addStudent_col_year;

    @FXML
    private Button addStudent_deleteBtn;

    @FXML
    private TableView<?> addStudent_tableView;

    @FXML
    private Button addStudent_updateBtn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    void addStudentAddBtn(ActionEvent event) {

    }

    @FXML
    void addStudentDeleteBtn(ActionEvent event) {

    }

    @FXML
    void addStudentUpdateBtn(ActionEvent event) {

    }
    @FXML
    private Button dashboard_btn;
    @FXML
    private Button availabel_btn;

    @FXML
    private Button enrolled_btn;
    @FXML
    void switchForm(ActionEvent event) throws IOException {
        if (event.getSource() == dashboard_btn) {
            Student_Dashboard.setVisible(true);
            DropCourse.setVisible(false);
            Enroll_Course.setVisible(false);
        }
        if (event.getSource() == availabel_btn) {
            Student_Dashboard.setVisible(false);
            DropCourse.setVisible(false);
            Enroll_Course.setVisible(true);
        }
        if (event.getSource() == enrolled_btn) {
            Student_Dashboard.setVisible(false);
            Enroll_Course.setVisible(false);
            DropCourse.setVisible(true);
        }
        if(event.getSource()==logout){
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }
    }

}
