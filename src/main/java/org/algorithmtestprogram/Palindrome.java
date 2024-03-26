package org.algorithmtestprogram;

public class Palindrome {
    public static void main(String[] args) {
        String springValue = "200";
        int n = springValue.length();
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + springValue.charAt(i);
        }
        // Printing the reversed Number
        System.out.println("Reverse Number = " + rev);
        // Checking Palindrome
        if (springValue.equals(rev))
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}