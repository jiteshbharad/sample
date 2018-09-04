package com.test.hibernate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	String name;
	
	@Id
	String rollno;
	float marks;
	
	public Student()
	{
		
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}	
}
