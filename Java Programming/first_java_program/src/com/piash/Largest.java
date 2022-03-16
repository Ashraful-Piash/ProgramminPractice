package com.piash;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");

        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
//    }
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }


}
