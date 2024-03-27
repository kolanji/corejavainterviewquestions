package org.leetCode;

public class Validpolindrome {
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

    }
}
