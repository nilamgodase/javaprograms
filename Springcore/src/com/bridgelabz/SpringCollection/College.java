package com.bridgelabz.SpringCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
	String clg_name;
	long phno;
	String location;
	@Override
	public String toString() {
		return "College [clg_name=" + clg_name + ", phno=" + phno + ", location=" + location + ", student1=" + student1
				+ ", student2=" + student2 + ", student3=" + student3 + "]";
	}
	
	private List<Student> student1;
	
	private Set<Student> student2;
	private Map<Integer,String> student3;
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStudent1(List<Student> student1) {
		this.student1 = student1;
	}
	public void setStudent2(Set<Student> student2) {
		this.student2 = student2;
	}
	public void setStudent3(Map<Integer, String> student3) {
		this.student3 = student3;
	}

}
