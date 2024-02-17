package com.example.project1;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdminPageController {

    @FXML
    private AreaChart<?, ?> Center_Chart;

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
    private TableView<?> table_center;

    @FXML
    private TableView<?> table_teacher;

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
    private TableColumn<?, ?> yearcol_center;

    @FXML
    private TableColumn<?, ?> yearcol_student;

    @FXML
    private TableColumn<?, ?> yearexpcol_teacher;

    @FXML
    void deletecenter(ActionEvent event) {

    }

    @FXML
    void deletestudent(ActionEvent event) {

    }

    @FXML
    void deleteteacher(ActionEvent event) {

    }

    @FXML
    void editcenter(ActionEvent event) {

    }

    @FXML
    void editstudent(ActionEvent event) {

    }

    @FXML
    void editteacher(ActionEvent event) {

    }

    @FXML
    void switchForm(ActionEvent event) {
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

    }

}
