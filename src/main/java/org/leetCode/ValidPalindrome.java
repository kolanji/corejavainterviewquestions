package org.leetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            if (!(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
                continue;
            } else {
                str.append(ch);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";
        //s = "race a car"
        //s = " "
    }
}
