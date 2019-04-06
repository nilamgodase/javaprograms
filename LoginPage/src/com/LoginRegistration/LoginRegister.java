package com.LoginRegistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao cd= new CustomerDaoImplementation();
//		 Connection con ;
//		 PreparedStatement ps;
		String userId=request.getParameter("num");
		String password=request.getParameter("password");
		String re_type_password=request.getParameter("Re-Type-Password");
		String emailId=request.getParameter("EmailId");
		String firstname=request.getParameter("name1");
		String lastname=request.getParameter("name2");
		String contact_number=request.getParameter("ContactNumber");
		String submitType=request.getParameter("submit");
	//cd.insertCustomer(userId, password,re_type_password,emailId,firstname,lastname,contact_number);
		Customer c= cd.getCustomer(userId, password,re_type_password,emailId,firstname,lastname,contact_number);
		if(submitType.equals("Login") && c!=null && c.getEmailId()!=null)
		{
			System.out.println("hey wssp");
			request.setAttribute("message", c.getUserId());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
//		else if(submitType.equals("Login") && c.getUserId()==null || c.getPassword()==null)
//		{
//			System.out.println("data not found");
//			request.setAttribute("message2", "Please login again");
//			request.getRequestDispatcher("Login.jsp").forward(request, response);
//			
//		}
		else if(submitType.equals("Register"))
		{
			System.out.println("jfbhuisag");
			c.setUserId(userId);
			c.setPassword(password);
			c.setRe_type_password(re_type_password);
			c.setEmailId(emailId);
			c.setFirstname(firstname);
			c.setLastname(lastname);
			c.setContact_number(contact_number);
		
			cd.insertCustomer(c);
			System.out.println("Registration done");
		    request.setAttribute("successmessage", "Registration done,please login to continue");
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}
		else
		{
			
			request.setAttribute("message", "Data not found,Click on register");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}

