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
public class StudentData {
    private String studentID;
    private String fullName;
    private Date birthDate;
    private String year;
    private String course;
    private String section;
    private String gender;
    private String semester;
    private Double payment;
    private String statusPayment;
    private String image;
    private Date dateInsert;
    private String status;

    private String test;
   private Boolean is_validated;
    public StudentData(String studentID, String fullName,
            Date birthDate, String year, String course, String section,String gender,String semester,
            Double payment, String statusPayment,Date dateInsert, String status) {

        this.studentID = studentID;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.year = year;
        this.course = course;
        this.semester=semester;
        this.section = section;
        this.payment = payment;
        this.statusPayment = statusPayment;
        this.image = image;
        this.dateInsert = dateInsert;
        this.status = status;
        this.is_validated =false;
    }




    public StudentData(String studentID, String fullName,
                       String year, String course, String section,
                       Double payment, String statusPayment,Date dateInsert, String status) {

        this.studentID = studentID;
        this.fullName = fullName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.payment = payment;
        this.statusPayment = statusPayment;
        this.dateInsert = dateInsert;
        this.status = status;
        this.is_validated =false;
    }


    public String getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public String getSection() {
        return section;
    }

    public Double getPayment() {
        return payment;
    }

    public String getStatusPayment() {
        return statusPayment;
    }

    public String getImage() {
        return image;
    }

    public Date getDateInsert() {
        return dateInsert;
    }
    public String getStatus() {
        return status;
    }

    public String toString(){
        return this.studentID+","+this.fullName+","+this.year+","+this.course+","+this.section+","
                +this.payment+","+this.statusPayment+","+this.dateInsert+","+this.status+","+this.is_validated+"\n";
    }
}
