package com.LoginRegistration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyProviderImplementation {
public	static Connection con=null;
public	static String url="jdbc:mysql://localhost:3306/LoginRegistration";
public	static String user="root";
public	static String password="";
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected to db");
			System.out.println("data: "+user + "," + password);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Server connected");

		} catch (Exception e) {
			System.out.println(e);
	
		}
		return con;
	}

}
