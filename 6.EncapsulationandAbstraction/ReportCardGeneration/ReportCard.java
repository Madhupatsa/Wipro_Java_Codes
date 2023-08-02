package com;
import java.util.*;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Anil");
		Marks mark1=new Marks(80,80,97);
		Student student2=new Student("Kumar");
		Marks mark2=new Marks(98,89,97);
		Student student3=new Student("Ravi");
		Marks mark3=new Marks(40,60,35);
		Marks[] marks=new Marks[] {mark1,mark2,mark3};
		Student[] student=new Student[] {student1,student2,student3};
		//System.out.println(marks[0].maths);

		for(int i=0;i<marks.length;i++) {
			MarksImpl obj=new MarksImpl(student[i],marks[i]);
			obj.calculateAvg(student[i], marks[i]);
			//System.out.println(obj.pStudents);
		}
		MarksImpl obj1=new MarksImpl();
		Collections.sort(obj1.avg);
		Collections.reverse(obj1.avg);
		System.out.println("Top scorer student is:");
		System.out.println(obj1.pStudents.get(obj1.avg.get(0)));
		System.out.println("Marks Report details are:");
		System.out.format("%10s %13s %10s","Student Name","Total Marks","Grade\n");
		//System.out.println(obj1.pStudents);
		for(int i=0;i<obj1.avg.size();i++) {
			obj1.getGrade(obj1.avg.get(i));
			System.out.format("%10s %13s %10s %s",obj1.pStudents.get(obj1.avg.get(i)),3*obj1.avg.get(i),obj1.getGrade(obj1.avg.get(i)),"\n");
		}
		//System.out.println();
		if (obj1.fStudents.size()==0) {
			System.out.println("All students are passed");
		}
		else {
			System.out.println("The students who are going to ratake the exam are:");
			for(int i=0;i<obj1.fStudents.size();i++) {
				System.out.println(obj1.fStudents.get(i));
			}
		}
	}

}
