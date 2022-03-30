package com.piash;

public class SumOfElementeArray {
    public static void main(String[] args) {
        int a[] = {5,3,7,9,6};
        int sum = 0;
        for(int i =0 ; i<=a.length-1; i ++){
            sum = sum + a[i];

        }
        System.out.println("Sum of array element: " +sum);
    }
}
