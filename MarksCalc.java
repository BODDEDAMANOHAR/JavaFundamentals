package com.codegnan.fundamentals;

import java.util.Scanner;

public class MarksCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Marks :");
			 int marks=sc.nextInt();
			 String grade = (marks >= 90) ? "O Grade" :
	                   (marks >= 80) ? "S Grade" :
	                   (marks >= 70) ? "A Grade" :
	                   (marks >= 60) ? "B Grade" :
	                   (marks >= 50) ? "C Grade" :
	                   (marks >= 40) ? "D Grade" : "Fail";
			 
			 System.out.println("final grade of student is :"+grade);
			
			 
			 System.out.println("--------------------------------------------");
			sc.close();
			

		}
		
		
		 
		 
		

	}

}
