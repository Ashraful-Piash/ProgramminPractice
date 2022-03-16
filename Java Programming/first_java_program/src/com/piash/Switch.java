package com.piash;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter a fruit");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Jackfruit" -> System.out.println("National fruit of Bangladesh");
            default -> System.out.println("Please enter a valid fruit");
        }

    }
}
