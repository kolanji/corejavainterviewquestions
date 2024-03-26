package org.leetCode;

import java.util.Arrays;
/**
 * Working fine
 */

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sq[i] = nums[i] * nums[i];
        }
        Arrays.sort(sq);

        System.out.println(Arrays.toString(sq));
        return sq;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        SquaresOfASortedArray.sortedSquares(nums);
    }
}
