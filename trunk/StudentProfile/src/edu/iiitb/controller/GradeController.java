package edu.iiitb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.iiitb.dao.GradeDAO;
import edu.iiitb.form.GradeForm;
import edu.iiitb.form.LoginForm;

@Controller
public class GradeController {
	
	@RequestMapping(value = "/grade", method = RequestMethod.GET)
	public ModelAndView getGrade() {
		
		GradeForm gradeForm = new GradeForm();
		GradeDAO dao = new GradeDAO();
		gradeForm.setSemList(dao.getSemList());
		gradeForm.setSubList(dao.getSubject("1"));
		gradeForm.setGradeList(dao.getGrades("1", "0"));
		
		System.out.println("Size:"+gradeForm.getSemList().size());
		return new ModelAndView("grade" , "gradeForm", gradeForm);
	}
	@RequestMapping(value = "/getSub.html", method = RequestMethod.POST)
	public ModelAndView getSub(@ModelAttribute("gradeForm") GradeForm gradeForm) {
	
		GradeDAO dao = new GradeDAO();
		System.out.println("selected sem:"+gradeForm.getSelectedSem());
		gradeForm.setSemList(dao.getSemList());
		gradeForm.setSubList(dao.getSubject(gradeForm.getSelectedSem()));
		gradeForm.setGradeList(dao.getGrades(gradeForm.getSelectedSem(), "0"));
		gradeForm.setSelectedSem(gradeForm.getSelectedSem());
		return new ModelAndView("grade" , "gradeForm", gradeForm);
		  
		
	}
	@RequestMapping(value = "/gradeSearch.html", method = RequestMethod.POST)
	public ModelAndView getGrades(@ModelAttribute("gradeForm") GradeForm gradeForm) {
	
		GradeDAO dao = new GradeDAO();
		System.out.println("selected sem:"+gradeForm.getSelectedSem());
		gradeForm.setSemList(dao.getSemList());
		gradeForm.setSubList(dao.getSubject(gradeForm.getSelectedSem()));
		gradeForm.setGradeList(dao.getGrades(gradeForm.getSelectedSem(), gradeForm.getSelectedSub()));
		gradeForm.setSelectedSem(gradeForm.getSelectedSem());
		return new ModelAndView("grade" , "gradeForm", gradeForm);
		  
		
	}
	

}
