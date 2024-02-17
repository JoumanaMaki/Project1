/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author WINDOWS 10
 */
public class AddStudentController implements Initializable {

    @FXML
    private AnchorPane main_form;

    @FXML
    private TextField student_number;

    @FXML
    private TextField student_name;

    @FXML
    private DatePicker student_birthDate;

    @FXML
    private ComboBox<String> student_year;

    @FXML
    private ComboBox<String> student_course;

    @FXML
    private ComboBox<String> student_section;

    @FXML
    private TextField student_pay;

    @FXML
    private ComboBox<String> student_payment;

    @FXML
    private ImageView student_imageView;

    @FXML
    private Button student_importBtn;

    @FXML
    private Button student_addBtn;

    @FXML
    private Button student_updateBtn;

    @FXML
    private ComboBox<String> student_status;

    @FXML
    private Label student_price;

    @FXML
    private ComboBox<String> student_semester;

    @FXML
    private ComboBox<String> student_gender;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    private AlertMessage alert = new AlertMessage();

    private Image image;
    public void updateBtn() {
    }

    public void clearFields() {
        student_name.clear();
        student_birthDate.setValue(null);
        student_year.getSelectionModel().clearSelection();
        student_course.getSelectionModel().clearSelection();
        student_gender.getSelectionModel().clearSelection();
        student_section.getSelectionModel().clearSelection();
        student_semester.getSelectionModel().clearSelection();
        student_payment.getSelectionModel().clearSelection();
        student_status.getSelectionModel().clearSelection();
        student_pay.clear();
        ListData.path = "";
        student_imageView.setImage(null);

    }

    private int getAge = 0;

    public void countAge() {
        if (student_birthDate.getValue() != null) {
            LocalDate birthDate = student_birthDate.getValue();
            int age = Period.between(birthDate, LocalDate.now()).getYears();

            getAge = age;

            System.out.println(getAge);
        }
    }

    public void importBtn() {

        FileChooser open = new FileChooser();
        open.getExtensionFilters().add(new ExtensionFilter("Open Image", "*.jpg", "*.jpeg", "*.png"));

        File file = open.showOpenDialog(student_importBtn.getScene().getWindow());

        if (file != null) {
            ListData.path = file.getAbsolutePath();

            image = new Image(file.toURI().toString(), 100, 113, false, true);
            student_imageView.setImage(image);
        }
    }

    public void displayStudentNumber() {

    }
    private double price = 0;

    public void priceList() {
//
    }
    public void setFields() {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        yearList();
        courseList();
        sectionList();
        statusPaymentList();
        statusList();
        semesterList();
        genderList();
        displayStudentNumber();
        setFields();
    }
    public void sectionList() {
        student_section.getItems().addAll("choose...","A","B","C","D");
    }
    public void genderList() {
        student_gender.getItems().addAll("choose...","Female","Male");
    }
    public void semesterList() {
        student_semester.getItems().addAll("choose...","Semester 1","Semester 2");
    }
    public void statusPaymentList() {
        student_payment.getItems().addAll("choose...","Paid","Pending","Failed","Cancelled","Refunded","Authorized");
    }
    public void statusList() {
        student_status.getItems().addAll("choose...","Enrolled","Active","Inactive","Graduated");
    }
    public void yearList() {
        student_year.getItems().addAll("choose..","2020","2021","2022","2023","2024");
    }

    public void courseList() {
        student_course.getItems().add("choose...");
        try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String Course = parts[1].trim();
                student_course.getItems().add(Course);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void addBtn(ActionEvent event) {
        LocalDate l = LocalDate.now();
        java.sql.Date currentDate = java.sql.Date.valueOf(l);
        String stdNo=student_number.getText();
        String name=student_name.getText();
        LocalDate localDate= student_birthDate.getValue();
        Date date = java.sql.Date.valueOf(localDate);
        String stdyear=student_year.getValue();
        String course=student_course.getValue();
        String section=student_section.getValue();
        String gender=student_gender.getValue();
        String semester=student_semester.getValue();
        double pay=Double.parseDouble(student_pay.getText());
        String payStatus=student_payment.getValue();
        String status=student_status.getValue();
        StudentData student=new StudentData(stdNo,name,stdyear,course,section,pay,payStatus,currentDate,status);
        try (FileWriter writer = new FileWriter("Student.txt", true)) { // true for append mode
            writer.write(student.toString());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();

    }



}
