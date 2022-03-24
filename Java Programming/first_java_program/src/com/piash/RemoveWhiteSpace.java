package com.piash;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = " Java       programming  selenium automation    ";

        str = str.replaceAll("\\s", "");
        System.out.println("After removing the white spaces: "+str);
    }
}
