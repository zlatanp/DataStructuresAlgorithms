package array.questions;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        MiddleFunction main = new MiddleFunction();
        int[] intArray = {1, 2, 3, 6, 5, 6};

        var result = main.middle(intArray);
        System.out.println(Arrays.toString(result));
    }

    /*
        Write a function called middle that takes a list and returns
        a new list that contains all but the first and last elements.

     */
    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }
}
