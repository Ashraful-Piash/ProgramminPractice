package com.piash;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd Number:");
        int c = sc.nextInt();

        if(a>b && b>c){
            System.out.println(a+ " is the largest Number");
        }else if(b>a && b>c){
            System.out.println(b+ " is the largest Number");
        }else{
            System.out.println(c+ " is the largest number");
        }



    }
}
