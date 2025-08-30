package com.codegnan.controlstatements;

import java.util.Scanner;

public class CityWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter your city name: ");
	        String city = sc.next();
	        
	        if(city.equalsIgnoreCase("hyderabad")) {
	        	System.out.println("hello welcome to  hyderabad");
	        }else {
	        	if(city.equalsIgnoreCase("Banglore")) {
		        	System.out.println("hello welcome to  Banglore");
		        }else {
		        	if(city.equalsIgnoreCase("Chennai")) {
			        	System.out.println("hello welcome to  chennai");
			        }else {
			        	System.out.println("Enter Valid city name");
			        }
		        }
	        }
	        
	       
	        
	        

	}

}
