package com.example.project1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

public class TeacherPageController {

    @FXML
    private AnchorPane CollectMoneyForm;

    @FXML
    private Button Teacher_CollectMoneybtn;

    @FXML
    private AnchorPane Teacher_Dashboard;

    @FXML
    private Label Teacher_TotalCourses;

    @FXML
    private Label Teacher_TotalIncome;

    @FXML
    private Label Teacher_TotalRegisteration;

    @FXML
    private Label Teacher_totalStudents;

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
    private Button addCourse_addBtn;

    @FXML
    private Button addCourse_clearBtn;

    @FXML
    private TableColumn<?, ?> addCourse_col_course;

    @FXML
    private TableColumn<?, ?> addCourse_col_dateInsert;

    @FXML
    private TableColumn<?, ?> addCourse_col_department;

    @FXML
    private TableColumn<?, ?> addCourse_col_price;

    @FXML
    private TableColumn<?, ?> addCourse_col_status;

    @FXML
    private TextField addCourse_course;

    @FXML
    private Button addCourse_deleteBtn;

    @FXML
    private TextField addCourse_department;

    @FXML
    private AnchorPane addCourse_form;

    @FXML
    private TextField addCourse_price;

    @FXML
    private ComboBox<String> addCourse_status;

    @FXML
    private TableView<CourseData> addCourse_tableView;

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
    private AnchorPane addStudent_form;

    @FXML
    private TableView<StudentData> addStudent_tableView;

    @FXML
    private Button addStudent_updateBtn;

    @FXML
    private LineChart<?, ?> dashboard_chart_DI1;

    @FXML
    private AreaChart<?, ?> dashboard_chart_DS;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Button updateCoursebtn;

    @FXML
    void Delete_andwrite(ActionEvent event) {

    }

    @FXML
    void addCourseSelectItem(MouseEvent event) {

    }

    @FXML
    void addStudentDeleteBtn(ActionEvent event) {

    }

    @FXML
    void addStudentUpdateBtn(ActionEvent event) {

    }

    public void switchForm(ActionEvent event) throws IOException {
        if (event.getSource() == Teacherdashboard_btn) {
            Teacher_Dashboard.setVisible(true);
            addStudent_form.setVisible(false);
            CollectMoneyForm.setVisible(false);
            addCourse_form.setVisible(false);
            int nbStudent=0;
            int nbCourses=0;
            try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    nbStudent++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("Courses.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    nbCourses++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            Teacher_totalStudents.setText(nbStudent+"");
            Teacher_TotalCourses.setText(""+nbCourses);
            Teacher_TotalRegisteration.setText(nbStudent+"");
            Teacher_TotalIncome.setText("11000");
        }

        if (event.getSource() == Teacher_CollectMoneybtn) {

            Teacher_Dashboard.setVisible(false);
            addStudent_form.setVisible(false);
            CollectMoneyForm.setVisible(true);
            addCourse_form.setVisible(false);

        }
        if (event.getSource() == TeacheraddStudent_btn) {

            Teacher_Dashboard.setVisible(false);
            addStudent_form.setVisible(true);
            CollectMoneyForm.setVisible(false);
            addCourse_form.setVisible(false);
            addStudentDisplayData();
        }
        if (event.getSource() == TeacheraddCourse_btn) {
            addCourse_form.setVisible(true);
            Teacher_Dashboard.setVisible(false);
            addStudent_form.setVisible(false);
            CollectMoneyForm.setVisible(false);
            addCourseDisplayData();
        }
        if(event.getSource()==Teacherlogout){
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

    }

public void initialize() {
    displayGreet();
    int nbStudent=0;
    int nbCourses=0;
    try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            nbStudent++;
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    try (BufferedReader reader = new BufferedReader(new FileReader("Courses.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            nbCourses++;
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    Teacher_totalStudents.setText(nbStudent+"");
    Teacher_TotalCourses.setText(""+nbCourses);
    Teacher_TotalRegisteration.setText(nbStudent+"");
    Teacher_TotalIncome.setText("11000");
    addCourse_status.getItems().addAll( "choose...","available","Not available");
    addCourse_tableView.setOnMouseClicked(event -> {
        if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
            CourseData selectedCourse = addCourse_tableView.getSelectionModel().getSelectedItem();
            if (selectedCourse != null) {
                handleSelectedRowCourse(selectedCourse);
            }
        }
    });
}
    private void handleSelectedRowCourse(CourseData selectedRowData) {
        // Get the data of each individual column
        TableColumn<CourseData, ?> column1 = addCourse_tableView.getColumns().get(0); // Replace 0 with the index of the column
        TableColumn<CourseData, ?> column2 = addCourse_tableView.getColumns().get(1); // Replace 1 with the index of the column
        TableColumn<CourseData, ?> column3 = addCourse_tableView.getColumns().get(2); // Replace 0 with the index of the column
        TableColumn<CourseData, ?> column4 = addCourse_tableView.getColumns().get(3); // Replace 1 with the index of the column
        TableColumn<CourseData, ?> column5 = addCourse_tableView.getColumns().get(4); // Replace 1 with the index of the column

        Object data1 = column1.getCellData(selectedRowData);
        Object data2 = column2.getCellData(selectedRowData);
        Object data3 = column3.getCellData(selectedRowData);
        Object data4 = column4.getCellData(selectedRowData);
        Object data5 = column4.getCellData(selectedRowData);
        addCourse_course.setText(data1.toString());
        addCourse_department.setText(data2.toString());
        addCourse_price.setText(data3.toString());
        addCourse_status.getSelectionModel().select(data5.hashCode());
    }
public void displayGreet() {
    String username = ListData.teacher_username;
    username = username.substring(0, 1).toUpperCase() + username.substring(1);
    Teachergreet_username.setText("Welcome, " + username);
}
@FXML
void addStudentAddBtn(ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddStudent.fxml"));
    AnchorPane anchorPane = fxmlLoader.load();
    Stage stage = new Stage();
    Scene scene=new Scene(anchorPane);
    stage.setScene(scene);
    stage.setTitle("AddStudent Page");
    stage.showAndWait();
    addStudentDisplayData();
}
public ObservableList<StudentData> addStudentGetData() {

    ObservableList<StudentData> listData = FXCollections.observableArrayList();
    try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String studentNo = parts[0].trim();
            String name = parts[1].trim();
            String year = parts[2].trim();
            String course = parts[3].trim();
            String section = parts[4].trim();
            double pay = Double.parseDouble(parts[5].trim());
            String statuspay=parts[6].trim();
            java.sql.Date date = java.sql.Date.valueOf(parts[7].trim());
            String status = parts[8].trim();
            StudentData sData = new StudentData(studentNo,name,year,course,section,pay,statuspay,date,status);
            listData.add(sData);
        }
    } catch (IOException e) {
        e.printStackTrace();
        // Handle file reading errors
    }
    return listData;
}

private ObservableList<StudentData> addStudentListData;

public void addStudentDisplayData() {
    addStudentListData = addStudentGetData();

    addStudent_col_studentNumber.setCellValueFactory(new PropertyValueFactory<>("studentID"));
    addStudent_col_name.setCellValueFactory(new PropertyValueFactory<>("fullName"));
    addStudent_col_year.setCellValueFactory(new PropertyValueFactory<>("year"));
    addStudent_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
    addStudent_col_section.setCellValueFactory(new PropertyValueFactory<>("section"));
    addStudent_col_pay.setCellValueFactory(new PropertyValueFactory<>("payment"));
    addStudent_col_statusPayment.setCellValueFactory(new PropertyValueFactory<>("statusPayment"));
    addStudent_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
    addStudent_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

    addStudent_tableView.setItems(addStudentListData);
}

    @FXML
    void addCourseAddBtn(ActionEvent event) {
        String course = addCourse_course.getText();
        String dep = addCourse_department.getText();

        // Parse price
        double price = Double.parseDouble(addCourse_price.getText());

        String status = addCourse_status.getValue().toString();

        // Convert LocalDate to java.sql.Date
        LocalDate localDate = LocalDate.now();
        Date currentDate = Date.valueOf(localDate);

        CourseData c = new CourseData(course, dep, price, currentDate, status);

        try (FileWriter writer = new FileWriter("courses.txt", true)) { // true for append mode
            writer.write(c.toString());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file writing errors
        }
        addCourseDisplayData();
    }
    private ObservableList<CourseData> addCourseListData;

    public void addCourseDisplayData() {
        addCourseListData = addCourseGetData();

        addCourse_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
        addCourse_col_department.setCellValueFactory(new PropertyValueFactory<>("department"));
        addCourse_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        addCourse_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
        addCourse_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        addCourse_tableView.setItems(addCourseListData);
        clearCourse();
    }
    public ObservableList<CourseData> addCourseGetData() {
        ObservableList<CourseData> listData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int courseid = Integer.parseInt(parts[0].trim());
                String Course = parts[1].trim();
                String dep = parts[2].trim();
                double price = Double.parseDouble(parts[3].trim());
                java.sql.Date date = java.sql.Date.valueOf(parts[4].trim());
                String status = parts[5].trim();
                CourseData cData = new CourseData(courseid, Course, dep, price, date, status);
                listData.add(cData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listData;
    }
    @FXML
    void addCourseClear(ActionEvent event) {
        clearCourse();
    }
    void clearCourse(){
        addCourse_course.setText("");
        addCourse_department.setText("");
        addCourse_price.setText("");
        addCourse_status.getSelectionModel().select(0);
    }
}
=======
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
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

public class TeacherPageController {

}
>>>>>>> origin/master
