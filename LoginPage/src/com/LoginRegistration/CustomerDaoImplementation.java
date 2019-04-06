package com.LoginRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CustomerDaoImplementation  implements CustomerDao{
	static Connection con;
	static PreparedStatement ps;


	public int insertCustomer(Customer c) {
		int status=0;
		try {
			
			con=MyProviderImplementation.getConnection();
			System.out.println("hello");
			ps=con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, c.getUserId());
			ps.setString(2,c.getPassword());
			ps.setString(3, c.getRe_type_password());
			ps.setString(4,c.getEmailId());
			ps.setString(5, c.getFirstname());
			ps.setString(6, c.getLastname());
			ps.setString(7, c.getContact_number());
			System.out.println("hello");
			status=ps.executeUpdate();
			System.out.println("Work done");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}


	public Customer getCustomer(String userId, String password, String re_type_password, String firstname, String lastname, String contact_number,String emailId) {
		Customer c=new Customer();
		try {
			con=MyProviderImplementation.getConnection();
			ps=con.prepareStatement("SELECT * FROM customer WHERE userId=? AND password =?");
			ps.setString(1, userId);
			ps.setString(2,password);
			ResultSet resultSet=ps.executeQuery();
			while(resultSet.next())
			{
				c.setUserId(resultSet.getString(1));
				c.setPassword(resultSet.getString(2));
				c.setRe_type_password(resultSet.getString(3));
				c.setEmailId(resultSet.getString(4));
				c.setFirstname(resultSet.getString(5));
				c.setLastname(resultSet.getString(6));
				c.setContact_number(resultSet.getString(7));
				
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return c;
	}
}
