package com.example.UpdateDemo;

public class Student {
    private int studentId;
    private String studentName;
    private String grade;

    public Student(String studentName, String grade, int studentId) {
        this.studentName = studentName;
        this.grade = grade;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
