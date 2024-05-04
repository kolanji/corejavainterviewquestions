public class Testallign {
    public class SecondHighest {
        public static void main(String[] args)

        int[] numbers = {2, 4, 6, 3, 6, 5};
        int highest = Integer.MIN_VALUE + 1;
        int sec_highest = Integer.MIN_VALUE;
        for(
        int i :numbers) // b is array of integers

        {
            if (i > highest) // new highest found?
            {
                // highest becomes "second highest"
                sec_highest = highest; // make current highest to second highest
                highest = i; // make current value to highest
            }
            // "i != highest "is to ensure duplicates are not reported as
            // highest & "second highest"
            else if (i > sec_highest && i != highest) // new "second highest" found?
            {

            }
