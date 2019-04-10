package com.bridgelabz.autowirAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	String sname;
	int st_id;
	int marks;
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", st_id=" + st_id + ", marks=" + marks + "]";
	}
	public String getSname() {
		return sname;
	}
	@Autowired
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getSt_id() {
		return st_id;
	}
	@Autowired
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public int getMarks() {
		return marks;
	}
	@Autowired
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
