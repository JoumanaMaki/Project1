package com.example.project1;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AdminPageController  implements Initializable {

    @FXML
    private TextField gender_st;
    @FXML
    private AreaChart<?, ?> Center_Chart;
    @FXML
    private TableColumn<?, ?> s_idcol;

    @FXML
    private TableColumn<?, ?> birthdaycol_student;

    @FXML
    private DatePicker birthjda_date;

    @FXML
    private Button center_btn;

    @FXML
    private AnchorPane center_form;

    @FXML
    private TableColumn<?, ?> course_colstudnet;

    @FXML
    private TextField course_student;

    @FXML
    private FontAwesomeIcon dashbaord_btn;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Button delete_center;

    @FXML
    private Button delete_teacher;

    @FXML
    private TextField department_teacher;

    @FXML
    private TableColumn<?, ?> deptcol_teacher;

    @FXML
    private Button detele_student;

    @FXML
    private Button edit_center;

    @FXML
    private Button edit_student;

    @FXML
    private Button edit_teacher;

    @FXML
    private TableColumn<?, ?> expcol_teacher;

    @FXML
    private TextField experience_teacher;

    @FXML
    private AnchorPane gender_student;

    @FXML
    private TextField gender_teacher;

    @FXML
    private TableColumn<?, ?> gendercol_student;

    @FXML
    private TableColumn<?, ?> gendercol_teacher;

    @FXML
    private TableColumn<?, ?> idcol_name;

    @FXML
    private TableColumn<?, ?> idcol_teacher;

    @FXML
    private Button logout_btn;

    @FXML
    private TextField name_center;

    @FXML
    private TextField name_student;

    @FXML
    private TextField name_teacher;

    @FXML
    private TableColumn<?, ?> namecol_center;

    @FXML
    private TableColumn<?, ?> namecol_student;

    @FXML
    private TableColumn<?, ?> namecol_teacher;

    @FXML
    private Label nb_of_centers;

    @FXML
    private Label nb_of_income;

    @FXML
    private Label nb_of_students;

    @FXML
    private Label nb_of_teachers;

    @FXML
    private TextField payment_student;

    @FXML
    private TableColumn<?, ?> paymentcol_student;

    @FXML
    private TextField salary_teacher;

    @FXML
    private TableColumn<?, ?> salarycol_teacher;

    @FXML
    private TextField section_student;

    @FXML
    private TableColumn<?, ?> sectioncol_student;

    @FXML
    private TableColumn<?, ?> semester_col_teacher;

    @FXML
    private TextField semester_teacher;

    @FXML
    private AreaChart<?, ?> student_Chart;

    @FXML
    private Button student_btn;

    @FXML
    private AnchorPane student_form;

    @FXML
    private TableView<CenterData> table_center;

    @FXML
    private TableView<TeacherData> table_teacher;

    @FXML
    private AreaChart<?, ?> teacher_Chart;

    @FXML
    private Button teacher_btn;

    @FXML
    private AnchorPane teacher_form;

    @FXML
    private AnchorPane teacher_frim;

    @FXML
    private CheckBox validate_center;

    @FXML
    private CheckBox validate_student;

    @FXML
    private CheckBox validate_teacher;

    @FXML
    private TableColumn<?, ?> validatecol_center;

    @FXML
    private TableColumn<?, ?> validatecol_teacher;

    @FXML
    private TableColumn<?, ?> validated_student;

    @FXML
    private TextField year_center;

    @FXML
    private TextField year_student;

    @FXML
    private TextField year_teacher;
    @FXML
    private TableView<StudentData> table_student;
    @FXML
    private TableColumn<?, ?> yearcol_center;

    @FXML
    private TableColumn<?, ?> yearcol_student;

    @FXML
    private TableColumn<?, ?> yearexpcol_teacher;

    @FXML
    void deletecenter(ActionEvent event) {
        CenterData selectedcenter = table_center.getSelectionModel().getSelectedItem();
        if (selectedcenter != null) {
            ObservableList<CenterData> centerlist = table_center.getItems();
            centerlist.remove(selectedcenter);
        }
    }

    @FXML
    void deletestudent(ActionEvent event) {
        StudentData selectedStudent = table_student.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            ObservableList<StudentData> studentList = table_student.getItems();
            studentList.remove(selectedStudent);
        }
    }

    @FXML
    void deleteteacher(ActionEvent event) {
        TeacherData selectedTeacher = table_teacher.getSelectionModel().getSelectedItem();
        if (selectedTeacher != null) {
            ObservableList<TeacherData> teacherList = table_teacher.getItems();
            teacherList.remove(selectedTeacher);
        }
    }

    @FXML
    void editcenter(ActionEvent event) {
        CenterData selectedCENTER = table_center.getSelectionModel().getSelectedItem();
        if (selectedCENTER != null) {

            selectedCENTER.setName(name_center.getText());
            selectedCENTER.setYear(Integer.parseInt(year_center.getText()));


            selectedCENTER.setValidated(validate_center.isSelected());

            table_center.refresh();
        }
    }

    @FXML
    void editstudent(ActionEvent event) {
        StudentData selectedStudent = table_student.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            // Update the selected student's data
            selectedStudent.setFullName(name_student.getText());

            selectedStudent.setYear(year_student.getText());
            selectedStudent.setCourse(course_student.getText());
            selectedStudent.setSection(section_student.getText());
            selectedStudent.setGenderStudent(gender_st.getText());
            // Assuming payment is an integer field, parse the text to an integer
            try {
                int payment = Integer.parseInt(payment_student.getText());
                selectedStudent.setPayment(payment);
            } catch (NumberFormatException e) {
                System.out.println("Invalid payment value");
            }


            selectedStudent.setValidated(validate_student.isSelected());


            table_student.refresh();
        }
    }

    @FXML
    void editteacher(ActionEvent event) {
        TeacherData selectedTeacher = table_teacher.getSelectionModel().getSelectedItem();
        if (selectedTeacher != null) {

            selectedTeacher.setFullName(name_teacher.getText());
            selectedTeacher.setGender(gender_teacher.getText());
            selectedTeacher.setYearExperience(year_teacher.getText());
            selectedTeacher.setExperience(experience_teacher.getText());
            selectedTeacher.setDepartment(department_teacher.getText());
            selectedTeacher.setValidated(validate_teacher.isSelected());
            double salary = Double.parseDouble(salary_teacher.getText());
            selectedTeacher.setSalary(salary);
            selectedTeacher.setSemester(semester_teacher.getText());


            table_teacher.refresh();
        }
    }

    @FXML
    void switchForm(ActionEvent event) throws IOException {
        if (event.getSource() == dashboard_btn) {
            dashboard_form.setVisible(true);
            teacher_form.setVisible(false);
            student_form.setVisible(false);
            center_form.setVisible(false);
            int nbStudent=0;
            int nbTeacher=0;
            int nbCenter =2;
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
            nb_of_students.setText("3");
            nb_of_centers.setText("5");
            nb_of_teachers.setText("6");
            nb_of_income.setText("120000");
        }

        if (event.getSource() == student_btn) {
            dashboard_form.setVisible(false);
            teacher_form.setVisible(false);
            student_form.setVisible(true);
            center_form.setVisible(false);
            fetchStudent();
        }


        if (event.getSource() == teacher_btn) {
            dashboard_form.setVisible(false);
            teacher_form.setVisible(true);
            student_form.setVisible(false);
            center_form.setVisible(false);
            fetchTeacher();

        }

        if (event.getSource() == center_btn) {
            dashboard_form.setVisible(false);
            teacher_form.setVisible(false);
            student_form.setVisible(false);
            center_form.setVisible(true);
            fetchCenter();

        }


        if(event.getSource()==logout_btn){
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }
    }

    private void fetchCenter() {

        ObservableList<CenterData> centerList = FXCollections.observableArrayList();
        centerList.add(new CenterData(1, "Center1", 2022, false));
        centerList.add(new CenterData(2, "Center2", 2023, false));
        centerList.add(new CenterData(3, "Center3", 2021, false));
        centerList.add(new CenterData(4, "Center4", 2024, false));
        centerList.add(new CenterData(5, "Center5", 2023, false));
        table_center.setItems(centerList);
        idcol_name.setCellValueFactory(new PropertyValueFactory<>("id"));
        namecol_center.setCellValueFactory(new PropertyValueFactory<>("name"));
        yearcol_center.setCellValueFactory(new PropertyValueFactory<>("year"));
        validatecol_center.setCellValueFactory(new PropertyValueFactory<>("validated"));
    }

    private void fetchTeacher() {
        ObservableList<TeacherData> teacherList = FXCollections.observableArrayList();

        teacherList.add(new TeacherData(1, "TID1", "John Doe", "Male", "5", "Experience", "Computer Science", false, 50000.0, "Spring"));
        teacherList.add(new TeacherData(2, "TID2", "Jane Smith", "Female", "7", "Experience", "Engineering", true, 60000.0, "Fall"));
        teacherList.add(new TeacherData(3, "TID3", "Alice Johnson", "Female", "3", "Experience", "Mathematics", false, 45000.0, "Summer"));
        teacherList.add(new TeacherData(4, "TID4", "Joumana Makki ", "Female", "3", "Experience", "Mathematics", false, 45000.0, "Summer"));
        teacherList.add(new TeacherData(5, "TID5", "Fatima Shoeib ", "Female", "3", "Experience", "Mathematics", false, 45000.0, "Summer"));

        table_teacher.setItems(teacherList);
        idcol_teacher.setCellValueFactory(new PropertyValueFactory<>("teacherID"));
        namecol_teacher.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        expcol_teacher.setCellValueFactory(new PropertyValueFactory<>("experience"));
        yearexpcol_teacher.setCellValueFactory(new PropertyValueFactory<>("yearExperience"));
        deptcol_teacher.setCellValueFactory(new PropertyValueFactory<>("department"));
        salarycol_teacher.setCellValueFactory(new PropertyValueFactory<>("salary"));
        gendercol_teacher.setCellValueFactory(new PropertyValueFactory<>("gender"));
        semester_col_teacher.setCellValueFactory(new PropertyValueFactory<>("status"));
        validatecol_teacher.setCellValueFactory(new PropertyValueFactory<>("validated"));
    }

    private void fetchStudent() {
        ObservableList<StudentData> studentList = FXCollections.observableArrayList();

        studentList.add(new StudentData("1", "John Doe",Date.valueOf("2004-02-16"), "2022", "male","Computer Science", "A", 1000.0, "Paid", Date.valueOf("2024-02-16"), "Enrolled", true));
        studentList.add(new StudentData("2", "Jane Smith",Date.valueOf("2003-02-16"), "2023","female" ,"Engineering", "B", 1200.0, "Pending", Date.valueOf("2024-02-16"), "Active", false) );
        studentList.add(new StudentData("3", "Alice Johnson", Date.valueOf("2003-02-16"),"2022","female" ,"Mathematics", "C", 900.0, "Cancelled", Date.valueOf("2024-02-16"), "Enrolled", false));

        table_student.setItems(studentList);


        s_idcol.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        namecol_student.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        yearcol_student.setCellValueFactory(new PropertyValueFactory<>("year"));
        course_colstudnet.setCellValueFactory(new PropertyValueFactory<>("course"));
        sectioncol_student.setCellValueFactory(new PropertyValueFactory<>("section"));
        paymentcol_student.setCellValueFactory(new PropertyValueFactory<>("payment"));
        gendercol_student.setCellValueFactory(new PropertyValueFactory<>("gender"));
        validated_student.setCellValueFactory(new PropertyValueFactory<>("validated"));
        birthdaycol_student.setCellValueFactory(new PropertyValueFactory<>("birthDate"));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nb_of_students.setText("3");
        nb_of_centers.setText("5");
        nb_of_teachers.setText("5");
        nb_of_income.setText("120000");
        table_student.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
                StudentData students = table_student.getSelectionModel().getSelectedItem();
                if (students != null) {
                    handleSelectedStudent(students);
                }
            }
        });

        table_teacher.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
                TeacherData teachers = table_teacher.getSelectionModel().getSelectedItem();
                if (teachers != null) {
                    handleSelectedTeacher(teachers);
                }
            }
        });


        table_center.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1) {
                CenterData centers = table_center.getSelectionModel().getSelectedItem();
                if (centers != null) {
                    handleSelectedCenter(centers);
                }
            }
        });



    }

    private void handleSelectedCenter(CenterData centers) {
        TableColumn<CenterData, ?> column1 = table_center.getColumns().get(0);
        TableColumn<CenterData, ?> column2 = table_center.getColumns().get(1);
        TableColumn<CenterData, ?> column3 = table_center.getColumns().get(2);
        TableColumn<CenterData, ?> column4 = table_center.getColumns().get(3);

        CenterData selectedCenter = table_center.getSelectionModel().getSelectedItem();

        if (selectedCenter != null) {
            Object data1 = column1.getCellData(selectedCenter);
            Object data2 = column2.getCellData(selectedCenter);
            Object data3 = column3.getCellData(selectedCenter);
            Object data4 = column4.getCellData(selectedCenter);


            name_center.setText(data2.toString());
            year_center.setText(data3.toString());
            validate_center.setSelected(false);
        }

    }

    private void handleSelectedTeacher(TeacherData teachers) {

        TableColumn<TeacherData, ?> column1 = table_teacher.getColumns().get(0);
        TableColumn<TeacherData, ?> column2 = table_teacher.getColumns().get(1);
        TableColumn<TeacherData, ?> column3 = table_teacher.getColumns().get(2);
        TableColumn<TeacherData, ?> column4 = table_teacher.getColumns().get(3);
        TableColumn<TeacherData, ?> column5 = table_teacher.getColumns().get(4);
        TableColumn<TeacherData, ?> column6 = table_teacher.getColumns().get(5);
        TableColumn<TeacherData, ?> column7 = table_teacher.getColumns().get(6);
        TableColumn<TeacherData, ?> column8 = table_teacher.getColumns().get(7);
        TableColumn<TeacherData, ?> column9 = table_teacher.getColumns().get(8);
        TeacherData selectedTeacher = table_teacher.getSelectionModel().getSelectedItem();

        if (selectedTeacher != null) {
            Object data1 = column1.getCellData(selectedTeacher);
            Object data2 = column2.getCellData(selectedTeacher);
            Object data3 = column3.getCellData(selectedTeacher);
            Object data4 = column4.getCellData(selectedTeacher);
            Object data5 = column5.getCellData(selectedTeacher);
            Object data6 = column6.getCellData(selectedTeacher);
            Object data7 = column7.getCellData(selectedTeacher);
            Object data8 = column8.getCellData(selectedTeacher);
            Object data9 = column9.getCellData(selectedTeacher);


            name_teacher.setText(data2.toString());
            year_teacher.setText(data3.toString());
            experience_teacher.setText(data4.toString());
            department_teacher.setText(data5.toString());
            salary_teacher.setText(data6.toString());
            semester_teacher.setText(data8.toString());
            gender_teacher.setText(data7.toString());
            validate_teacher.setSelected(false);
        }

    }

    private void handleSelectedStudent(StudentData students) {
        TableColumn<StudentData, ?> column1 = table_student.getColumns().get(0);
        TableColumn<StudentData, ?> column2 = table_student.getColumns().get(1);
        TableColumn<StudentData, ?> column3 = table_student.getColumns().get(2);
        TableColumn<StudentData, ?> column4 = table_student.getColumns().get(3);
        TableColumn<StudentData, ?> column5 = table_student.getColumns().get(4);
        TableColumn<StudentData, ?> column6 = table_student.getColumns().get(5);
        TableColumn<StudentData, ?> column7 = table_student.getColumns().get(6);
        TableColumn<StudentData, ?> column8 = table_student.getColumns().get(7);
        TableColumn<StudentData, ?> column9 = table_student.getColumns().get(8);

        StudentData selectedStudent = table_student.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            Object data1 = column1.getCellData(selectedStudent);
            Object data2 = column2.getCellData(selectedStudent);
            Object data3 = column3.getCellData(selectedStudent);
            Object data4 = column4.getCellData(selectedStudent);
            Object data5 = column5.getCellData(selectedStudent);
            Object data6 = column6.getCellData(selectedStudent);
            Object data7 = column7.getCellData(selectedStudent);
            Object data8 = column8.getCellData(selectedStudent);
            Object data9 = column9.getCellData(selectedStudent);
            name_student.setText(data2.toString());
            birthjda_date.setValue(LocalDate.parse(data3.toString()));
            year_student.setText(data4.toString());
            course_student.setText(data5.toString());
            section_student.setText(data6.toString());
            gender_st.setText(data7.toString());
            payment_student.setText("2000");
            validate_student.setSelected(false);
        }

    }
      /*
    void switchForm(ActionEvent event) throws IOException {
        if (event.getSource() == dashboard_btn) {

            dashboard_form.setVisible(true);
            teacher_form.setVisible(false);
            student_form.setVisible(false);
            center_form.setVisible(false);
            int nbStudent=0;
            int nbTeacher=0;
            int nbCenter =2;
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
            nb_of_students.setText(nbStudent+"");
            nb_of_centers.setText(""+nbCenter);
            nb_of_teachers.setText(nbTeacher+"");
            nb_of_income.setText("120000");
        }
        if (event.getSource() == teacher_btn) {


            dashboard_form.setVisible(false);
            teacher_form.setVisible(true);
            student_form.setVisible(false);
            center_form.setVisible(false);

        }
        if (event.getSource() == student_btn) {


            dashboard_form.setVisible(false);
            teacher_form.setVisible(false);
            student_form.setVisible(true);
            center_form.setVisible(false);


        }
        if (event.getSource() == center_btn) {

            dashboard_form.setVisible(false);
            teacher_form.setVisible(false);
            student_form.setVisible(false);
            center_form.setVisible(true);
        }
        if(event.getSource()==logout_btn){
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

    }

     */
}



