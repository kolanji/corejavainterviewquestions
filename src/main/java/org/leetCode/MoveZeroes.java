package org.leetCode;

import java.util.Arrays;

/**
 * iven an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = i; k < n; k++) {
            nums[k] = 0;
        }
        Arrays.stream(nums).forEach(aa-> System.out.println(aa));

    }

    public static void main(String[] args) {
       int [] nums = {0,1,0,3,12};
        MoveZeroes.moveZeroes(nums);
    }
}
