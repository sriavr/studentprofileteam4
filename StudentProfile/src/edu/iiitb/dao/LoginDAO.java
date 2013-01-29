package edu.iiitb.dao;

public class LoginDAO {

	public boolean checkLogin(String username,String password)
	{
		if(username.equals("admin") && password.equals("admin"))
			return true;
		
		else
		    return false;  
		
		
	}
	
}
