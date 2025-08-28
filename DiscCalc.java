package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount :");
		double purchaseAmount=sc.nextDouble();
		double discount=(purchaseAmount>=100)?0.2 
				:(purchaseAmount>=50)?0.1:0.0;
		double disAmt=purchaseAmount*discount;
		double remAmt=purchaseAmount-disAmt;
		double perDis=discount*100;
		System.out.println("Amoint after Applying "+perDis +"% discount :"+remAmt);
		System.out.println("disc applied :"+disAmt);
		
		sc.close();

		
		
		
		
		
		

	}

}
