package com.piash;

import java.util.Random;

public class GenerateRandomNumberString {
    public static void main(String[] args) {
        Random rand = new Random();
       int rand_int = rand.nextInt(999);
       System.out.println(rand_int);



    }
}
