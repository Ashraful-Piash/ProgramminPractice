package com.piash;

public class CountCharacterOccurances {
    public static void main(String[] args) {
        String s = "Java programming java oops";
        int totalCount = s.length();
        int totalCount_afterRemove = s.replace("a","").length();
        int count = totalCount - totalCount_afterRemove;
        System.out.println("Number occurances of a is: " +count);

    }
}
