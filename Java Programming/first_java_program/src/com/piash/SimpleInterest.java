package com.piash;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter p");
        int P = input.nextInt();
        System.out.print("enter t");
        int T = input.nextInt();
        System.out.print("enter r");
        float R = input.nextFloat();
        float Rate = R/100;

        float A = P*(1+Rate*T);

         System.out.println(A);
    }
}
