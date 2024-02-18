package com.example.project1;

public class CenterData {
    private int id;
    private String name;
    private int year;
    private boolean validated;

    public CenterData(int id, String name, int year, boolean validated) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.validated = validated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

}
