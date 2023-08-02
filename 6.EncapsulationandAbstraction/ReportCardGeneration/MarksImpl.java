package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MarksImpl {
	Student student;
	Marks marks;
	String a1;
	public static ArrayList<String> fStudents=new ArrayList<>();
	public static  ArrayList<Double> avg=new ArrayList<Double>();
	public static HashMap<Double,String> pStudents=new HashMap<Double,String>();
	MarksImpl(){
		
	}
	MarksImpl(Student student,Marks marks){
		this.student=student;
		this.marks=marks;
	}
	public void calculateAvg(Student student,Marks marks) {
		if (marks.maths<40 || marks.physics<40 || marks.chemistry<40) {
			this.fail(student);
		}
		else {
			double avgMarks=(marks.maths+marks.physics+marks.chemistry)/3;
			avg.add(avgMarks);
			pStudents.put(avgMarks,student.studentName);
		}
	}
	public void fail(Student student) {
		fStudents.add(student.studentName);
	}
	public String getGrade(double a) {
		if(a>=85 && a<100) {
			a1="A";
		}
		else if(a>=70 && a<85) {
			a1="B";
		}
		else if(a>55 && a<70) {
			a1="C";
		}
		else {
			a1="D";
		}
		return a1;
	}
	
}
