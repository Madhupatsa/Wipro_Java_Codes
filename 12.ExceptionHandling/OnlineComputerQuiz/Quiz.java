import java.util.*;
import java.io.*;
public class Quiz {
	static String schoolName[]=new String[] {"Dav","Rsk","Treamais","Candor","Oak","Uav","Bcgs","Bcbs","Baldwain","Nps"};
	static String quizScore[]=new String[] {"86","78","55","6","44","33","82","77","8","99"};
	
	public static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//		System.out.println("enter School name");
//			String name=sc.next();
//		System.out.println("enter Score");
//			String score=sc.next();
//			schoolName[i]=name;
//			quizScore[i]=score;
//		}
		Quiz quiz=new Quiz();
		quiz.quizDetails();
	}
	public void quizDetails() {
		double s=0;
		int max=0;
		int index=0;
		try {
			for(int i=0;i<10;i++) {
				int num=Integer.parseInt(quizScore[i]);
				s=s+num;
				if (num>max) {
					max=num;
					index=i;
				}
			}
			int k=(int)s/10;
			System.out.println("the avg of quiz score is: "+k);
			System.out.println("The highest scorer in the quiz is"+schoolName[index]+" with "+max);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
