package com.company;

public class Palindrome {

    public static boolean palindrome(String value) {
        StringBuilder sB = new StringBuilder(value);
        sB.reverse();
        String rev = sB.toString();
        if (value.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kupu-kupu"));

    }


}
