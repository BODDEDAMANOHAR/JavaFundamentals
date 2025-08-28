package com.codegnan.fundamentals;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		 int year=sc.nextInt();
		 boolean isLeapYear=(year%4==0)&&(year%100!=0)||(year%400==0);
		 String res=isLeapYear?"LeapYear":"Not Leap Year";
		 System.out.println(res);
		 
	}

}
