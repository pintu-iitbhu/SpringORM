package org.ormtutorial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentDetails")
public class Student {
    @Id
    @Column(name = "studentId")
    private int studentId;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "studentCity")
    private String studentCity;
    @Column(name = "studentStd")
    private int studentStd;

    public Student() {
    }
    public Student(int studentId, String studentName, String studentCity, int studentStd) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentStd = studentStd;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public int getStudentStd() {
        return studentStd;
    }

    public void setStudentStd(int studentStd) {
        this.studentStd = studentStd;
    }
}
