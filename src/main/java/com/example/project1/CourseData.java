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
public class CourseData {
    private static Integer Courseid=1;
    private Integer id;
    private String course;
    private String department;
    private Double price;
    private Date dateInsert;
    private Date dateUpdate;
    private Date dateDelete;
    private String status;

    public CourseData( String course, String department, Double price,
                      Date dateInsert, String status) {
        this.id = Courseid;
        this.course = course;
        this.department = department;
        this.price = price;
        this.dateInsert = dateInsert;
        this.status = status;
        Courseid++;
    }
    public CourseData( int id,String course, String department, Double price,
                       Date dateInsert, String status) {
        this.id = id;
        this.course = course;
        this.department = department;
        this.price = price;
        this.dateInsert = dateInsert;
        this.status = status;

    }

    public Double getPrice(){
        return price;
    }
    
    public Integer getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    public Date getDateInsert() {
        return dateInsert;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public String getStatus() {
        return status;
    }


    public String toString(){
        return this.id+","+this.course+","+this.department+","+this.price+","+this.dateInsert+","+this.status+"\n";
    }
}
