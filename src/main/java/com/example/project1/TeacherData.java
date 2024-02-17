/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project1;

import java.sql.Date;

/**
 *
 * @author WINDOWS 10
 */
public class TeacherData {

    private Integer id;
    private String teacherID;
    private String fullName;
    private String gender;
    private String yearExperience;
    private String experience;
    private String department;
    private Double salary;
    private Date dateInsert;
    private String status;

    private Boolean is_validated ;
    public TeacherData(String teacherID, String fullName, String gender,
                       String yearExperience, String experience, String department, Double salary, Date dateInsert,  String status) {
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.gender = gender;
        this.yearExperience = yearExperience;
        this.experience = experience;
        this.department = department;
        this.salary = salary;
        this.dateInsert = dateInsert;
        this.status = status;
        this.is_validated =false;
    }

    public TeacherData(Integer id, String teacherID, String fullName,
                       String gender, Double salary, Date dateInsert, String status) {
        this.id = id;
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.gender = gender;
        this.salary = salary;
        this.dateInsert = dateInsert;
        this.status = status;
        this.is_validated =false;
    }

    public TeacherData(Integer id, String teacherID, String fullName,
                       String gender, String yearExperience, Date dateInsert) {
        this.id = id;
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.gender = gender;
        this.yearExperience = yearExperience;
        this.dateInsert = dateInsert;
        this.is_validated =false;
    }

    public Integer getId() {
        return id;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getYearExperience() {
        return yearExperience;
    }

    public String getExperience() {
        return experience;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
    public Date getDateInsert() {
        return dateInsert;
    }

    public String getStatus() {
        return status;
    }

    public String toString(){
        return this.teacherID+","+this.fullName+","+this.gender+","+this.yearExperience+","+this.experience+","+this.department+","+this.salary+","+this.dateInsert+","+this.status+","+  this.is_validated +"\n";
    }
}
