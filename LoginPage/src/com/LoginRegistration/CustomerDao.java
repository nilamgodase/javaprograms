package com.LoginRegistration;

public interface CustomerDao 
{
	public int insertCustomer(Customer c) ;
    public Customer getCustomer(String userId, String password, String re_type_password, String firstname, String lastname, String contact_number,String emailId);
    
}
