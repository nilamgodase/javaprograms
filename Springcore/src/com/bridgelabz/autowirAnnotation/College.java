package com.bridgelabz.autowirAnnotation;

public class College {
	 int cld_id;
	 String name;
	 Student student;
	@Override
	public String toString() {
		return "College [cld_id=" + cld_id + ", name=" + name + ", student=" + student + "]";
	}
	public int getCld_id() {
		return cld_id;
	}
	public void setCld_id(int cld_id) {
		this.cld_id = cld_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	 

}
