package com.codegnan.controlstatements;

import java.util.Scanner;

public class MobilePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes talked: ");
        int minutes = sc.nextInt();

        if (minutes < 100) {
            System.out.println("Your plan: Basic Plan");
        } else {
            if (minutes < 300) {
                System.out.println("Your plan: Standard Plan");
            } else {
                if (minutes < 500) {
                    System.out.println("Your plan: Premium Plan");
                } else {
                    System.out.println("Your plan: Unlimited Plan");
                }
            }
        }

        sc.close();
    }
}

