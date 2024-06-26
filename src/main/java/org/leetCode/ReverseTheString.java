package org.leetCode;

/**
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 */
public class ReverseTheString {

        public static String reverseWords(String s) {
            char []ch =s.toCharArray();
            int left=0, right =0;
            while(right<ch.length){
                if(ch[right]==' '){
                    reverse(ch,left,right-1);
                    left = right+1;
                }
                right++;
            }
            reverse(ch,left,right-1);
            return new String(ch);
        }

        // reverse algorithm
        private static void reverse(char[]arr, int left, int right)
        {
            while(left < right){
                char temp = arr[left];
                arr[left++]=arr[right];
                arr[right--]=temp;

            }

        }

    public static void main(String[] args) {
        String st= "Let's take LeetCode contest";
        String ref= reverseWords(st);
        System.out.println("Revers of word:"+ref);
    }
}
