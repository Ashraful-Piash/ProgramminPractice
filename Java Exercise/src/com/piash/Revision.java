package com.piash;

import java.awt.*;
import java.util.Date;

public class Revision {
    public static void main(String[]args){

        int age = 30;
        //int- variable type, age- identifier, == - assignment operator
        // primitive type is used for storing simple values while reference type is used for storing storing complex object
        Date now = new Date();
        //now- is an object.object is an instance of class.
        byte x = 1;
        byte y =x;
         x = 2;

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);

        System.out.println(y);

        System.out.println(now);
        System.out.println("Alhamdulillah");




    }
}
