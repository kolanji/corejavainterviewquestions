package org.stringtestprogram;

public class StringPalindrome {

    public static void main(String[] args) {
        String inputStr = "101";
        String result = reverse(inputStr);

        if (inputStr.equals(result)) {
            System.out.println("Yes "+inputStr+" Palindrome  : " + result);
        } else {
            System.out.println(inputStr + " is not a palindrome  : " + result);
        }
    }

    public static String reverse(String source) {
        String reverse = "";
        if (source == null || source.isEmpty()) {
            return source;
        }
        for (int i = source.length() - 1; i >= 0; i--) {
            //System.out.println("reverse: " + reverse);
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }

}
