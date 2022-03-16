package com.piash;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        System.out.print("Enter your cgpa");
//
//        Scanner input = new Scanner(System.in);
//        float cgpa = input.nextFloat();
//        System.out.println("your cgpa is : "+cgpa);
//        int count  = 1;
//        while (count!=5){
//            System.out.println(count);
//            count++;
//
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter temperature into celcius: ");
//
//        float tempC = input.nextFloat();
//        float tempF = (tempC * 9/5)+32;
//
//        System.out.println(tempF);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        if(salary>10000){
            salary += 2000;
        }else if(salary > 20000){
            salary+= 30000;
        }else{
            salary += 1000;
        }
        System.out.println("Your salary is :"+salary);
    }

}
