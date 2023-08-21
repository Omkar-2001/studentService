package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student 
{
	@Id
String studentId;
String studentName;
long marks;
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student(String studentId, String studentName, long marks) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.marks = marks;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public long getMarks() {
	return marks;
}
public void setMarks(long marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
}

}
