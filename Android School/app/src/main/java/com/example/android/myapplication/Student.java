package com.example.android.myapplication;

public class Student {
  private   String StudentName;
    private int StudentAge;
    private int studentGrade;
   private int studentImg;

    public Student(String studentName, int studentAge, int studentGrade, int studentImg) {
        StudentName = studentName;
        StudentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentImg = studentImg;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }
}

