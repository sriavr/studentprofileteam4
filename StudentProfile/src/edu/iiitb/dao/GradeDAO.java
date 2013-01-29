package edu.iiitb.dao;

import java.util.ArrayList;

import edu.iiitb.model.GradeBean;
import edu.iiitb.model.SubjectBean;

public class GradeDAO {
	
	public ArrayList<String> getSemList()
	{
		ArrayList<String> semList = new ArrayList<String>();
		
		/* Database call to get list of semesters from database */
		
		semList.add("1");
		semList.add("2");
		semList.add("3");
		semList.add("4");
		
		return semList;
		
	}
	
	public ArrayList<SubjectBean> getSubject(String sem)
	{
		
		ArrayList<SubjectBean> subjectList = new ArrayList<SubjectBean>();
		
		/*Database call to get the mapping of subjects for a given semester */
		
		//Dummy code need to be removed
		if(sem.equals("1"))
		{	
			SubjectBean subjectBean = new SubjectBean();
			subjectBean.setSubCode("CS101");
			subjectBean.setSubId("1");
			subjectBean.setSubName("Algorithms");
			subjectList.add(subjectBean);
			subjectBean = new SubjectBean();
			subjectBean.setSubCode("SE101");
			subjectBean.setSubId("2");
			subjectBean.setSubName("PAS");
			subjectList.add(subjectBean);
		}
		if(sem.equals("2"))
		{	
			SubjectBean subjectBean = new SubjectBean();
			subjectBean.setSubCode("SE201");
			subjectBean.setSubId("3");
			subjectBean.setSubName("OOAD");
			subjectList.add(subjectBean);
			subjectBean = new SubjectBean();
			subjectBean.setSubCode("DB201");
			subjectBean.setSubId("4");
			subjectBean.setSubName("DM");
			subjectList.add(subjectBean);
		}
		if(sem.equals("3"))
		{	
			SubjectBean subjectBean = new SubjectBean();
			subjectBean.setSubCode("DB301");
			subjectBean.setSubId("5");
			subjectBean.setSubName("Data Model");
			subjectList.add(subjectBean);
			
			subjectBean = new SubjectBean();
			subjectBean.setSubCode("SE301");
			subjectBean.setSubId("6");
			subjectBean.setSubName("DM");
			subjectList.add(subjectBean);
		}
		if(sem.equals("4"))
		{	
			SubjectBean subjectBean = new SubjectBean();
			subjectBean.setSubCode("NC101");
			subjectBean.setSubId("7");
			subjectBean.setSubName("Network");
			subjectList.add(subjectBean);
			
			subjectBean = new SubjectBean();
			subjectBean.setSubCode("SE401");
			subjectBean.setSubId("8");
			subjectBean.setSubName("DP");
			subjectList.add(subjectBean);
		}
		//end of dummy
		
		return subjectList;
	}
	
	
	public ArrayList<GradeBean> getGrades(String sem,String subId)
	{
		
		ArrayList<GradeBean> gradeList = new ArrayList<GradeBean>();
		if(subId.equals("0"))
		{
			//Get the grade list of all the subjects in the semester
			
			
			//Dummy code need to be removed.Replace with DB code
			
			GradeBean gradeBean = new GradeBean();
			
			gradeBean.setGrade("A");
			gradeBean.setResult("Pass");
			gradeBean.setSemName(sem);
			gradeBean.setSubId("1");
			gradeBean.setSubCode("CS101");
			gradeBean.setSubject("Algorithms");
			
			gradeList.add(gradeBean);
			gradeBean = new GradeBean();
			gradeBean.setGrade("A");
			gradeBean.setResult("Pass");
			gradeBean.setSemName(sem);
			gradeBean.setSubId("1");
			gradeBean.setSubCode("SE101");
			gradeBean.setSubject("PAS");
			gradeList.add(gradeBean);
			
			
		}	
		else
		{
			//DB call to get the grades of the sub and semester
			
			
			//Dummy code need to be replaced with Database code
			
            GradeBean gradeBean = new GradeBean();
			
			gradeBean.setGrade("A");
			gradeBean.setResult("Pass");
			gradeBean.setSemName(sem);
			gradeBean.setSubId("1");
			gradeBean.setSubCode("CS101");
			gradeBean.setSubject("Algorithms");
			
			gradeList.add(gradeBean);
			gradeBean = new GradeBean();
			gradeBean.setGrade("A");
			gradeBean.setResult("Pass");
			gradeBean.setSemName(sem);
			gradeBean.setSubId("1");
			gradeBean.setSubCode("SE101");
			gradeBean.setSubject("PAS");
			gradeList.add(gradeBean);
		
		}
		
		return gradeList;
	}
	
	

}
