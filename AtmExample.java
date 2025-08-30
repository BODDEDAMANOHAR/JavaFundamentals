package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 50000;

        int pin = 1682; // original pin

        System.out.println("Enter your pin :");

        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            return; // exit program
        }

        int choice;

        do {
            System.out.println("\n||--------------------------||");
            System.out.println("||--------- ATM MENU -------||");
            System.out.println("|| 1. Check Balance         ||");
            System.out.println("|| 2. Deposit               ||");
            System.out.println("|| 3. Withdraw              ||");
            System.out.println("|| 4. Exit                  ||");
            System.out.println("||--------------------------||");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your Balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit % 100 != 0) {
                        System.out.println("Enter amount in multiples of 100!");
                    } else if (deposit < 500) {
                        System.out.println("Deposit must be at least 500!");
                    } else {
                        balance += deposit;
                        System.out.println("Deposited " + deposit + " successfully. New balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmt = sc.nextDouble();

                    if (withdrawAmt % 100 != 0) {
                        System.out.println("Enter amount in multiples of 100!");
                    } else if (withdrawAmt < 500) {
                        System.out.println("Withdraw amount must be at least 500!");
                    } else if (withdrawAmt <= balance) {
                        balance -= withdrawAmt;
                        System.out.println("Withdrawn " + withdrawAmt + " successfully. New balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
