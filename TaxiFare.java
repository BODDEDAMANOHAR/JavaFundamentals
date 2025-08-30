package com.codegnan.fundamentals;
import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled in km: ");
        int km = sc.nextInt();

        double fare;

        if (km <= 2) {
            fare = 50;
        } else if (km <= 10) {
            fare = 50 + (km - 2) * 15;
        } else {
            fare = 50 + (8 * 15) + (km - 10) * 10;
        }

        if (km > 20) {
            fare = fare - (fare * 5 / 100); // 5% discount
        }

        System.out.println("Total fare = ₹" + fare);
        
        sc.close();
    }
}

