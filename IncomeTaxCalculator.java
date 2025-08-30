package com.codegnan.fundamentals;

import java.util.Scanner;


public class IncomeTaxCalculator {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter your annual income: ");
	        double income = sc.nextDouble();
	        double tax = 0;

	        
	        if (income < 300000) {
	            tax = income * 0.05;
	        } else if (income <= 1000000) {
	            tax = income * 0.10;
	            
	        } else {
	            tax = income * 0.15;   
	        }
	        
	        if (income > 2000000) {
	            tax = tax + (tax * 0.01);  
	        }
	        System.out.println("Income = ₹" + income);
	        System.out.println("Calculated Tax = ₹" + tax);


	        
	        
	        
	
	 }

}
