package array.questions;

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        TwoSum main = new TwoSum();
        int[] intArray = {2, 7, 13, 15};

        int[] result = main.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }

    /*
        Write a program to find all pairs of integers whose sum is equal to a given number.
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
