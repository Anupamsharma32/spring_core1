package com.example.demo;

public class Student {
    private int id;
    private String studentName;
    private String studentAddress;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Student(){
        super();
    }
    public Student(int id,String studentName,String studentAddress){
        super();
        this.id=id;
        this.studentName=studentName;
        this.studentAddress=studentAddress;

    }



}
