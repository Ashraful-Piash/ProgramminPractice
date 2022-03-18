package com.piash;

public class Method1 {
    static void myMethod(String fname , int age){
        System.out.println(fname + " is " + age);
    }


    public static void main(String[] args) {
        myMethod ("Liam" , 8);
        myMethod ("Jenny", 9);
        myMethod ("Anja", 31);
    }
}
