package edu.iiitb.form;

import java.util.ArrayList;

import edu.iiitb.model.GradeBean;
import edu.iiitb.model.SubjectBean;

public class GradeForm {
	
	ArrayList<String> semList = new ArrayList<String>();
	String selectedSem;
	String selectedSub;
	public String getSelectedSem() {
		return selectedSem;
	}
	public void setSelectedSem(String selectedSem) {
		this.selectedSem = selectedSem;
	}
	public String getSelectedSub() {
		return selectedSub;
	}
	public void setSelectedSub(String selectedSub) {
		this.selectedSub = selectedSub;
	}
	public ArrayList<String> getSemList() {
		return semList;
	}
	public void setSemList(ArrayList<String> semList) {
		this.semList = semList;
	}
	public ArrayList<SubjectBean> getSubList() {
		return subList;
	}
	public void setSubList(ArrayList<SubjectBean> subList) {
		this.subList = subList;
	}
	public ArrayList<GradeBean> getGradeList() {
		return gradeList;
	}
	public void setGradeList(ArrayList<GradeBean> gradeList) {
		this.gradeList = gradeList;
	}
	ArrayList<SubjectBean> subList = new ArrayList<SubjectBean>();
	ArrayList<GradeBean> gradeList = new ArrayList<GradeBean>();
	
	
	

}
