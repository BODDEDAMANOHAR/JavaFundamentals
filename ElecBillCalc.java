package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElecBillCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            
            System.out.print("Enter units consumed: ");
            int units = sc.nextInt();

            System.out.print("Are you a senior citizen? (yes/no): ");
            String input = sc.next();
            boolean isSeniorCitizen = input.equalsIgnoreCase("yes");

            double billAmount = 0;

            if (units <= 100) {
                billAmount = units * 1.5;
            } else {
                if (units <= 200) {
                    billAmount = (100 * 1.5) + ((units - 100) * 2);
                } else {
                    if (units <= 300) {
                        billAmount = (100 * 1.5) + (100 * 2) + ((units - 200) * 3);
                    } else {
                        billAmount = (100 * 1.5) + (100 * 2) + (100 * 3) + ((units - 300) * 5);
                    }
                }
            }

            double surCharge = 0;
            if (billAmount > 1000) {
                surCharge = billAmount * 0.1;
            } else {
                surCharge = 0; 
            }

            double discount = 0;
            if (isSeniorCitizen) {
                discount = (billAmount + surCharge) * 0.05;
            } else {
                discount = 0;
            }

            double totalPayable = billAmount + surCharge - discount;

            System.out.println("\n----- Electricity Bill -----");
            System.out.println("Base Bill     : " + billAmount);
            System.out.println("Surcharge     : " + surCharge);
            System.out.println("Discount      : " + discount);
            System.out.println("Total Payable : " + totalPayable);

            System.out.println("--------------------------------------------------");
            System.out.print("\nDo you want to calculate another bill? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("\n------------ Thank you!--------------------------");
    }
}
