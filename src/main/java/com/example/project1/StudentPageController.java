package com.example.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class StudentPageController {

    @FXML
    private AnchorPane DropCourse;

    @FXML
    private AnchorPane Enroll_Course;

    @FXML
    private AnchorPane Student_Dashboard;

    @FXML
    private Button TeacheraddCourse_btn;

    @FXML
    private Button TeacheraddStudent_btn;

    @FXML
    private Button Teacherdashboard_btn;

    @FXML
    private Label Teachergreet_username;

    @FXML
    private Label TeacherheaderLabel;

    @FXML
    private Button Teacherlogout;

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
    void switchForm(ActionEvent event) {

    }

}
