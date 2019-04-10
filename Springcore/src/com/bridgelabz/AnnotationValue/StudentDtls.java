package com.bridgelabz.AnnotationValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("file:/home/admin1/Documents/workspace-sts-3.9.8.RELEASE/Springcore/springValue1.xml");
		Student stu=(Student)con.getBean("stude");
		stu.displayStudentInfo();
		Teacher tea=(Teacher)con.getBean("teacher");
		tea.displayTeacherInfo();

	}

}
