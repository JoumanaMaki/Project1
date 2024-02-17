/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project1;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import java.time.LocalDate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Center {

    @FXML
    private AnchorPane Dashboard;

    @FXML
    private Button addCourse_addBtn;

    @FXML
    private Button addCourse_btn;

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
    private Button addCourse_updateBtn;

    @FXML
    private Button addStudent_addBtn;

    @FXML
    private Button addStudent_btn;

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
    private Button addSubject_addBtn;

    @FXML
    private Button addSubject_clearBtn;

    @FXML
    private Button logout;
    @FXML
    private TextField addSubject_code;

    @FXML
    private TableColumn<?, ?> addSubject_col_code;

    @FXML
    private TableColumn<?, ?> addSubject_col_course;

    @FXML
    private TableColumn<?, ?> addSubject_col_dateInsert;

    @FXML
    private TableColumn<?, ?> addSubject_col_status;

    @FXML
    private TableColumn<?, ?> addSubject_col_subject;

    @FXML
    private ComboBox<?> addSubject_course;

    @FXML
    private Button addSubject_deleteBtn;

    @FXML
    private AnchorPane addSubject_form;

    @FXML
    private ComboBox<?> addSubject_status;

    @FXML
    private TextField addSubject_subject;

    @FXML
    private TableView<SubjectData> addSubject_tableView;

    @FXML
    private Button addSubject_updateBtn;

    @FXML
    private Button addTeacher_addBtn;

    @FXML
    private Button addTeacher_btn;

    @FXML
    private Button addTeacher_clearBtn;

    @FXML
    private TableColumn<?, ?> addTeacher_col_dateInsert;

    @FXML
    private TableColumn<?, ?> addTeacher_col_department;

    @FXML
    private TableColumn<?, ?> addTeacher_col_experience;

    @FXML
    private TableColumn<?, ?> addTeacher_col_gender;

    @FXML
    private TableColumn<?, ?> addTeacher_col_name;

    @FXML
    private TableColumn<?, ?> addTeacher_col_salary;

    @FXML
    private TableColumn<?, ?> addTeacher_col_status;

    @FXML
    private TableColumn<?, ?> addTeacher_col_teacherID;

    @FXML
    private TableColumn<?, ?> addTeacher_col_yearExperience;

    @FXML
    private Button addTeacher_deleteBtn;

    @FXML
    private ComboBox<String> addTeacher_department;

    @FXML
    private TextField addTeacher_experience;

    @FXML
    private ComboBox<String> addTeacher_experienceYear;

    @FXML
    private AnchorPane addTeacher_form;

    @FXML
    private TextField addTeacher_fullName;

    @FXML
    private ComboBox<String> addTeacher_gender;

    @FXML
    private ImageView addTeacher_imageView;

    @FXML
    private Button addTeacher_importBtn;

    @FXML
    private TextField addTeacher_salary;

    @FXML
    private ComboBox<?> addTeacher_salaryStatus;

    @FXML
    private ComboBox<String> addTeacher_status;

    @FXML
    private TableView<TeacherData> addTeacher_tableView;

    @FXML
    private TextField addTeacher_teacherID;

    @FXML
    private Button addTeacher_updateBtn;

    @FXML
    private Label dashboard_SRT;

    @FXML
    private Label dashboard_TI;

    @FXML
    private Label dashboard_TS;

    @FXML
    private Label dashboard_TT;

    @FXML
    private Button dashboard_btn;

    @FXML
    private LineChart<?, ?> dashboard_chart_DI;

    @FXML
    private AreaChart<?, ?> dashboard_chart_DS;

    @FXML
    private BarChart<?, ?> dashboard_chart_DT;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private AnchorPane dashboard_in_center;

    @FXML
    private Label greet_username;

    @FXML
    private HBox hbox1;

    @FXML
    private LineChart<?, ?> linechart;

    @FXML
    private Button payment_clearBtn;

    @FXML
    private TableColumn<?, ?> payment_col_name;

    @FXML
    private TableColumn<?, ?> payment_col_payment;

    @FXML
    private TableColumn<?, ?> payment_col_section;

    @FXML
    private TableColumn<?, ?> payment_col_semester;

    @FXML
    private TableColumn<?, ?> payment_col_statusPayment;

    @FXML
    private TableColumn<?, ?> payment_col_studentID;

    @FXML
    private TableColumn<?, ?> payment_col_year;

    @FXML
    private AnchorPane payment_form;

    @FXML
    private ImageView payment_imageView;

    @FXML
    private TextField payment_name;

    @FXML
    private Button payment_payBtn;

    @FXML
    private TextField payment_payment;

    @FXML
    private TextField payment_section;

    @FXML
    private TextField payment_semester;

    @FXML
    private ComboBox<?> payment_status;

    @FXML
    private TextField payment_studentID;

    @FXML
    private TableView<StudentData> payment_tableView;

    @FXML
    private TextField payment_year;

    @FXML
    private TableColumn<?, ?> salary_SP_col_datePaid;

    @FXML
    private TableColumn<?, ?> salary_SP_col_salaryPaid;

    @FXML
    private TableColumn<?, ?> salary_SP_col_teacherID;

    @FXML
    private TableView<SalaryData> salary_SP_tableView;

    @FXML
    private Button salary_clearBtn;

    @FXML
    private TableColumn<?, ?> salary_col_dateInsert;

    @FXML
    private TableColumn<?, ?> salary_col_dateUpdate;

    @FXML
    private TableColumn<?, ?> salary_col_fullName;

    @FXML
    private TableColumn<?, ?> salary_col_gender;

    @FXML
    private TableColumn<?, ?> salary_col_salaryPerDay;

    @FXML
    private TableColumn<?, ?> salary_col_status;

    @FXML
    private TableColumn<?, ?> salary_col_teacherID;

    @FXML
    private AnchorPane salary_form;

    @FXML
    private DatePicker salary_fromDate;

    @FXML
    private TextField salary_name;

    @FXML
    private Button salary_payBtn;

    @FXML
    private Label salary_salary;

    @FXML
    private TextField salary_salaryPerDay;

    @FXML
    private ComboBox<?> salary_status;

    @FXML
    private TableView<TeacherData> salary_tableView;

    @FXML
    private TextField salary_teacherID;

    @FXML
    private DatePicker salary_toDate;

    @FXML
    private Label salary_totalDays;

    @FXML
    private Button student_addBtn;

    @FXML
    private DatePicker student_birthDate;

    @FXML
    private ComboBox<?> student_course;

    @FXML
    private ComboBox<?> student_gender;

    @FXML
    private ImageView student_imageView;

    @FXML
    private Button student_importBtn;

    @FXML
    private AnchorPane student_in_center;

    @FXML
    private TextField student_name;

    @FXML
    private TextField student_number;

    @FXML
    private TextField student_pay;

    @FXML
    private ComboBox<?> student_payment;

    @FXML
    private ComboBox<?> student_section;

    @FXML
    private ComboBox<?> student_semester;

    @FXML
    private ComboBox<?> student_status;

    @FXML
    private Button student_updateBtn;

    @FXML
    private ComboBox<?> student_year;

    @FXML
    private AnchorPane teacher_in_center;

    @FXML
    private Pane total_students;

    @FXML
    void addBtn(ActionEvent event) {

    }

    @FXML
    void addCourseSelectItem(MouseEvent event) {

    }

    @FXML
    void addCourseUpdateBtn(ActionEvent event) {

    }

    @FXML
    void addStudentUpdateBtn(ActionEvent event) {

    }

    @FXML
    void addSubjectAddBtn(ActionEvent event) {

    }

    @FXML
    void addSubjectClear(ActionEvent event) {

    }

    @FXML
    void addSubjectDeleteBtn(ActionEvent event) {

    }

    @FXML
    void addSubjectSelectItem(MouseEvent event) {

    }

    @FXML
    void addSubjectUpdateBtn(ActionEvent event) {

    }

    @FXML
    void addTeacherImportBtn(ActionEvent event) {

    }

    @FXML
    void addTeacherSelectItems(MouseEvent event) {

    }

    @FXML
    void addTeacherUpdateBtn(ActionEvent event) {

    }

    @FXML
    void countAge(ActionEvent event) {

    }

    @FXML
    void courseList(ActionEvent event) {

    }

    @FXML
    void importBtn(ActionEvent event) {

    }

    @FXML
    void paymentSelectItem(MouseEvent event) {

    }

    @FXML
    void salaryClear(ActionEvent event) {

    }

    @FXML
    void salaryCountDays(ActionEvent event) {

    }

    @FXML
    void salaryPayBtn(ActionEvent event) {

    }

    @FXML
    void salarySelectItem(MouseEvent event) {

    }


    @FXML
    void updateBtn(ActionEvent event) {

    }


    // DATABASE TOOLS
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;

    private AlertMessage alert = new AlertMessage();

    private Image image;

    public void dashboardDisplayTS() {

    }

    public void dashboardDisplayTT() {

    }

    public void dashboardDisplaySRT() {

    }

    public void dashboardDisplayTI() {

    }

    public void dashboardDSChart() {


    }

    public void dashboardDTChart() {


    }

    public void dashboardDIChart() {


    }

    public void addStudentUpdateBtn() {
    }

    public void addTeacherSelectItems() {

    }

    public void addTeacherGenderList() {


    }

    public void addTeacherEYList() {


    }

    public void addTeacherSSList() {


    }

    public void addTeacherDepartmentList() {


    }

    public void addTeacherStatusList() {

    }

    private String teacherID;

    public void generateTeacherID() {


    }

    public void addTeacherDisplayTeacherID() {

    }


    public void addTeacherUpdateBtn() {

    }

    public void addTeacherImportBtn() {

        FileChooser open = new FileChooser();
        open.getExtensionFilters().add(new FileChooser.ExtensionFilter("Open Image", "*.jpg", "*.jpeg", "*.png"));

        File file = open.showOpenDialog(addTeacher_importBtn.getScene().getWindow());

        if (file != null) {
            ListData.path = file.getAbsolutePath();

            image = new Image(file.toURI().toString(), 90, 103, false, true);
            addTeacher_imageView.setImage(image);
        }
    }

    //Add course to table
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
/*
    public void displaytafterdeleted(ActionEvent e){
    CourseListDataAfterDeletion= addCourseDeleteBtn();

    addCourse_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
    addCourse_col_department.setCellValueFactory(new PropertyValueFactory<>("department"));
    addCourse_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
    addCourse_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
    addCourse_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

    addCourse_tableView.setItems(CourseListDataAfterDeletion);
}*/


    private int courseID = 0;

    public void addCourseSelectItem() {

    }


    public void addCourseUpdateBtn() {

    }


    public void addCourseStatus() {

    }

    public ObservableList<SubjectData> addSubjectGetData() {
        return null;
    }

    private ObservableList<SubjectData> addSubjectListData;

    public void addSubjectDisplayData() {

        addSubjectListData = addSubjectGetData();

        addSubject_col_code.setCellValueFactory(new PropertyValueFactory<>("subjectCode"));
        addSubject_col_subject.setCellValueFactory(new PropertyValueFactory<>("subject"));
        addSubject_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
        addSubject_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
        addSubject_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        addSubject_tableView.setItems(addSubjectListData);
    }

    private int subjectID = 0;

    public void addSubjectSelectItem() {

    }

    public void addSubjectAddBtn() {


    }

    public void addSubjectUpdateBtn() {


    }

    public void addSubjectDeleteBtn() {


    }

    public void addSubjectClear() {
    }

    public void addSubjectCourseList() {


    }

    public void addSubjectStatusList() {


    }

    public ObservableList<StudentData> paymentGetData() {
        return null;
    }

    private ObservableList<StudentData> paymentListData;

    public void paymentDisplayData() {
        paymentListData = paymentGetData();

        payment_col_studentID.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        payment_col_name.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        payment_col_year.setCellValueFactory(new PropertyValueFactory<>("year"));
        payment_col_section.setCellValueFactory(new PropertyValueFactory<>("section"));
        payment_col_semester.setCellValueFactory(new PropertyValueFactory<>("semester"));
        payment_col_payment.setCellValueFactory(new PropertyValueFactory<>("payment"));
        payment_col_statusPayment.setCellValueFactory(new PropertyValueFactory<>("statusPayment"));

        payment_tableView.setItems(paymentListData);

    }

    public void paymentSelectItem() {

    }


    public ObservableList<TeacherData> salaryGetData() {

        return null;
    }

    private ObservableList<TeacherData> salaryListData;

    public void salaryDisplayData() {
        salaryListData = salaryGetData();

        salary_col_teacherID.setCellValueFactory(new PropertyValueFactory<>("teacherID"));
        salary_col_fullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        salary_col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        salary_col_salaryPerDay.setCellValueFactory(new PropertyValueFactory<>("salary"));
        salary_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
        salary_col_dateUpdate.setCellValueFactory(new PropertyValueFactory<>("dateUpdate"));
        salary_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        salary_tableView.setItems(salaryListData);
    }

    public void salarySelectItem() {


    }

    public void salaryDisableFields() {

    }

    public double salaryGetSalaryPerDay() {

        return 3;
    }

    private long countDays;
    private double totalSalary;

    public void salaryCountDays() {

    }

    public void salaryPayBtn() {


    }

    public void salaryClear() {

    }

    public void salarySalaryStatusList() {


    }

    public ObservableList<SalaryData> salarySPGetdata() {
        return null;
    }

    private ObservableList<SalaryData> salarySPListData;

    public void salaryDisplaydata() {

    }

    public void switchForm(ActionEvent event) throws IOException {
        if (event.getSource() == dashboard_btn) {

            dashboard_form.setVisible(true);
            addStudent_form.setVisible(false);
            addTeacher_form.setVisible(false);
            addCourse_form.setVisible(false);
            int nbStudent=0;
            int nbTeacher=0;
            try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    nbStudent++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("Teachers.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    nbTeacher++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            dashboard_TS.setText(nbStudent+"");
            dashboard_TT.setText(""+nbTeacher);
            dashboard_SRT.setText(nbStudent+"");
            dashboard_TI.setText("120000");
        }

        if (event.getSource() == addTeacher_btn) {

            dashboard_form.setVisible(false);
            addStudent_form.setVisible(false);
            addTeacher_form.setVisible(true);
            addCourse_form.setVisible(false);
            addTeacherDisplayData();

        }
        if (event.getSource() == addStudent_btn) {

            dashboard_form.setVisible(false);
            addStudent_form.setVisible(true);
            addTeacher_form.setVisible(false);
            addCourse_form.setVisible(false);
            addStudentDisplayData();


        }
        if (event.getSource() == addCourse_btn) {
            addCourse_form.setVisible(true);
            dashboard_form.setVisible(false);
            addStudent_form.setVisible(false);
            addTeacher_form.setVisible(false);
            addCourseDisplayData();
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
    @FXML
    public void initialize() {
        dashboard_TS.setText("0");
        dashboard_TT.setText("0");
        dashboard_SRT.setText("0");
        dashboard_TI.setText("120000");
        // Add initialization logic here
        System.out.println("FXML file opened successfully!");
        displayGreet();
        addCourse_status.getItems().addAll( "choose...","available","Not available");
        addTeacher_gender.getItems().addAll("choose..","Female","Male");
        addTeacher_experienceYear.getItems().addAll("choose...","1","2","3","more");
        addTeacher_department.getItems().addAll("choose...","ComputerScience","Biology","Chemistry");
        addTeacher_status.getItems().addAll("choose...","Single","Married","Divorced");

        addCourse_tableView.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
                CourseData selectedCourse = addCourse_tableView.getSelectionModel().getSelectedItem();
                if (selectedCourse != null) {
                    handleSelectedRowCourse(selectedCourse);
                }
            }
        });
        addTeacher_tableView.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
                TeacherData selectedTeacher = addTeacher_tableView.getSelectionModel().getSelectedItem();
                if (selectedTeacher != null) {
                    handleSelectedRowTeacher(selectedTeacher);
                }
            }
        });
        int nbStudent=0;
        int nbTeacher=0;
        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                nbStudent++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Teachers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                nbTeacher++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        dashboard_TS.setText(nbStudent+"");
        dashboard_TT.setText(""+nbTeacher);
        dashboard_SRT.setText(""+nbStudent);
        dashboard_TI.setText("120000");
    }

    private void handleSelectedRowTeacher(TeacherData selectedRowData) {
        TableColumn<TeacherData, ?> column1 = addTeacher_tableView.getColumns().get(0); // Replace 0 with the index of the column
        TableColumn<TeacherData, ?> column2 = addTeacher_tableView.getColumns().get(1); // Replace 1 with the index of the column
        TableColumn<TeacherData, ?> column3 = addTeacher_tableView.getColumns().get(2); // Replace 0 with the index of the column
        TableColumn<TeacherData, ?> column4 = addTeacher_tableView.getColumns().get(3); // Replace 1 with the index of the column
        TableColumn<TeacherData, ?> column5 = addTeacher_tableView.getColumns().get(4); // Replace 0 with the index of the column
        TableColumn<TeacherData, ?> column6 = addTeacher_tableView.getColumns().get(5); // Replace 1 with the index of the column
        TableColumn<TeacherData, ?> column7 = addTeacher_tableView.getColumns().get(6); // Replace 0 with the index of the column
        TableColumn<TeacherData, ?> column8 = addTeacher_tableView.getColumns().get(7); // Replace 1 with the index of the column
        TableColumn<TeacherData, ?> column9 = addTeacher_tableView.getColumns().get(8); // Replace 1 with the index of the column

        Object data1 = column1.getCellData(selectedRowData);
        Object data2 = column2.getCellData(selectedRowData);
        Object data3 = column3.getCellData(selectedRowData);
        Object data4 = column4.getCellData(selectedRowData);
        Object data5 = column5.getCellData(selectedRowData);
        Object data6 = column6.getCellData(selectedRowData);
        Object data7 = column7.getCellData(selectedRowData);
        Object data8 = column8.getCellData(selectedRowData);
        Object data9=column9.getCellData(selectedRowData);
        addTeacher_teacherID.setText(data1.toString());
        addTeacher_fullName.setText(data2.toString());
        addTeacher_gender.getSelectionModel().select(data3.toString());
        addTeacher_experienceYear.getSelectionModel().select(data4.toString());
        addTeacher_experience.setText(data5.toString());
        addTeacher_department.getSelectionModel().select(data6.toString());
        addTeacher_salary.setText(data7.toString());
        addTeacher_status.getSelectionModel().select(data9.toString());
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
        String username = ListData.center_username;
        username = username.substring(0, 1).toUpperCase() + username.substring(1);
        greet_username.setText("Welcome, " + username);
    }
    //Add Btn
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
////////////////////////////////////////////////////////////////
    //Delete
@FXML
public ObservableList<CourseData> addCourseDeleteBtn(String courseToDelete) {
    ObservableList<CourseData> listData = FXCollections.observableArrayList();
    try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int courseid = Integer.parseInt(parts[0].trim());
            String Course = parts[1].trim();
            String dep = parts[2].trim();
            double price = parts[3].trim().isEmpty() ? 0.0 : Double.parseDouble(parts[3].trim());
            java.sql.Date date = java.sql.Date.valueOf(parts[4].trim());
            String status = parts[5].trim();
            if(!courseToDelete.equals(Course)){
                CourseData cData = new CourseData(courseid, Course, dep, price, date, status);
                listData.add(cData);
               }

        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    return listData;
}
    public void writeToFileAfterDeletion(String courseToDelete){
         ObservableList<CourseData> C=addCourseDeleteBtn(courseToDelete);
        try (FileWriter writer = new FileWriter("courses.txt")) {
            System.out.println("empty");
        } catch (IOException evp) {
            evp.printStackTrace();
            // Handle file writing errors
        }
        for (CourseData c :C) {
            try (FileWriter writer = new FileWriter("courses.txt", true)) { // true for append mode
                writer.write(c.toString());
                System.out.println("Data written to file successfully.");
            } catch (IOException ev) {
                ev.printStackTrace();

            }
        }
        displaytafterdeleted();

    }
    @FXML
    public void Delete_andwrite(ActionEvent e){
        if(!addCourse_course.getText().equals("")){
            writeToFileAfterDeletion(addCourse_course.getText().toString());}
    }
    private ObservableList<CourseData> CourseListDataAfterDeletion;
    public void displaytafterdeleted(){
    CourseListDataAfterDeletion= addCourseDeleteBtn("");
    addCourse_col_course.setCellValueFactory(new PropertyValueFactory<>("course"));
    addCourse_col_department.setCellValueFactory(new PropertyValueFactory<>("department"));
    addCourse_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
    addCourse_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
    addCourse_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
    addCourse_tableView.setItems(CourseListDataAfterDeletion);
        clearCourse();

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
    @FXML
    void addTeacherAddBtn(ActionEvent event) {
        String TeacherId = addTeacher_teacherID.getText();
        String name = addTeacher_fullName.getText();
        String gender = addTeacher_gender.getSelectionModel().getSelectedItem().toString();
        String expYear = addTeacher_experienceYear.getSelectionModel().getSelectedItem().toString();
        String exp = addTeacher_experience.getText();
        String dep = addTeacher_department.getSelectionModel().getSelectedItem().toString();
        double salary = Double.parseDouble(addTeacher_salary.getText());
        // Convert LocalDate to java.sql.Date
        java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
        String status = addTeacher_status.getSelectionModel().getSelectedItem().toString();
        TeacherData tData = new TeacherData(TeacherId, name, gender, expYear, exp, dep, salary, currentDate, status);
        try (FileWriter writer = new FileWriter("Teachers.txt", true)) { // true for append mode
            writer.write(tData.toString());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file writing errors
        }
        addTeacherDisplayData();

    }

    private ObservableList<TeacherData> addTeacherListData;

    public void addTeacherDisplayData() {
        addTeacherListData = addTeacherGetData();

        addTeacher_col_teacherID.setCellValueFactory(new PropertyValueFactory<>("teacherID"));
        addTeacher_col_name.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        addTeacher_col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        addTeacher_col_yearExperience.setCellValueFactory(new PropertyValueFactory<>("yearExperience"));
        addTeacher_col_experience.setCellValueFactory(new PropertyValueFactory<>("experience"));
        addTeacher_col_department.setCellValueFactory(new PropertyValueFactory<>("department"));
        addTeacher_col_salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        addTeacher_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
        addTeacher_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        addTeacher_tableView.setItems(addTeacherListData);
        clearTeacher();
    }

    public ObservableList<TeacherData> addTeacherGetData() {
        ObservableList<TeacherData> listData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("Teachers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String teacherid = parts[0].trim();
                String name = parts[1].trim();
                String gender = parts[2].trim();
                String expYear = parts[3].trim();
                String exp = parts[4].trim();
                String dep = parts[5].trim();
                double salary = Double.parseDouble(parts[6].trim());
                java.sql.Date date = java.sql.Date.valueOf(parts[7].trim());
                String status = parts[8].trim();
                TeacherData tData = new TeacherData(teacherid, name, gender, expYear, exp, dep, salary, date, status);
                listData.add(tData);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file reading errors
        }
        return listData;
    }
    @FXML
    void addTeacherClearBtn(ActionEvent event) {
        clearTeacher();
}

    void clearTeacher(){
            addTeacher_teacherID.setText("");
            addTeacher_fullName.setText("");
            addTeacher_gender.getSelectionModel().select(0);
            addTeacher_experienceYear.getSelectionModel().select(0);
            addTeacher_experience.setText("");
            addTeacher_department.getSelectionModel().select(0);
            addTeacher_salary.setText("");
            addTeacher_status.getSelectionModel().select(0);
    }

    public ObservableList<TeacherData> addTeacherDeleteBtn(String TeacherId) {
        ObservableList<TeacherData> listData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("Teachers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String teacherid = parts[0].trim();
                String name = parts[1].trim();
                String gender = parts[2].trim();
                String expYear = parts[3].trim();
                String exp = parts[4].trim();
                String dep = parts[5].trim();
                double salary = Double.parseDouble(parts[6].trim());
                java.sql.Date date = java.sql.Date.valueOf(parts[7].trim());
                String status = parts[8].trim();

                if(!TeacherId.equals(teacherid)){
                    TeacherData tData = new TeacherData(teacherid, name, gender, expYear, exp, dep, salary, date, status);
                    listData.add(tData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listData;
    }

    public void writeToFileAfterDeletionTeacher(String TeacherId){
        ObservableList<TeacherData> T=addTeacherDeleteBtn(TeacherId);
        try (FileWriter writer = new FileWriter("Teachers.txt")) {
            System.out.println("empty");
        } catch (IOException evp) {
            evp.printStackTrace();
            // Handle file writing errors
        }
        for (TeacherData c :T) {
            try (FileWriter writer = new FileWriter("Teachers.txt", true)) { // true for append mode
                writer.write(c.toString());
                System.out.println("Data written to file successfully.");
            } catch (IOException ev) {
                ev.printStackTrace();
            }
        }
        displaytafterdeletedTeacher();
    }
    @FXML
    public void Delete_andwriteTeacher(ActionEvent e){
        if(!addTeacher_teacherID.getText().equals("")){
            writeToFileAfterDeletionTeacher(addTeacher_teacherID.getText().toString());}
    }
    private ObservableList<TeacherData> TeacherListDataAfterDeletion;
    public void displaytafterdeletedTeacher(){
        TeacherListDataAfterDeletion= addTeacherDeleteBtn("");
        addTeacher_col_teacherID.setCellValueFactory(new PropertyValueFactory<>("teacherID"));
        addTeacher_col_name.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        addTeacher_col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        addTeacher_col_yearExperience.setCellValueFactory(new PropertyValueFactory<>("yearExperience"));
        addTeacher_col_experience.setCellValueFactory(new PropertyValueFactory<>("experience"));
        addTeacher_col_department.setCellValueFactory(new PropertyValueFactory<>("department"));
        addTeacher_col_salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        addTeacher_col_dateInsert.setCellValueFactory(new PropertyValueFactory<>("dateInsert"));
        addTeacher_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        addTeacher_tableView.setItems(TeacherListDataAfterDeletion);
        clearTeacher();
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
    void addStudentDeleteBtn(ActionEvent event) {

    }
}