package edu.iiitb.controller;


import java.util.List;

import edu.iiitb.dao.LoginDAO;
import edu.iiitb.form.LoginForm;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	
	
    String errorMessage="";
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView get() {
		
		LoginForm loginForm = new LoginForm();
		loginForm.setUsername("");
		loginForm.setPassword("");
		
		return new ModelAndView("login" , "loginForm", loginForm);
	}
	
	@RequestMapping(value = "/loginsave", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("loginForm") LoginForm loginForm) {
		
		System.out.println(loginForm.getUsername());
		System.out.println(loginForm.getPassword());
		
		LoginDAO dao = new LoginDAO();
		if(dao.checkLogin(loginForm.getUsername(), loginForm.getPassword()))
		{	
			errorMessage="Success";
			return new ModelAndView("home", "loginForm", loginForm);
		}
		else
		{
			errorMessage = "faliure";
			return new ModelAndView("login", "loginForm", loginForm);
			
		}  	
	}
	
}
