package com.codegnan.controlstatements;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks :");
		int marks=sc.nextInt();
		
		if(marks>=90) {
			System.out.println("O grade");
		}else {
			if(marks>=80) {
				System.out.println("s grade");

			}else {
				if(marks>=70) {
					System.out.println("A grade");

				}else {
					if(marks>=60) {
						System.out.println(" Bgrade");

					}else {
						if(marks>=50) {
							System.out.println("c grade");

						}else {
							if(marks>35) {
								System.out.println("d grade");

							}else {
								System.out.println("F grade");

							}sc.close();
						}
					}
				}
			}
		}

	}
	

}
