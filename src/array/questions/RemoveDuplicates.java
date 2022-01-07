package array.questions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates main = new RemoveDuplicates();
        int[] intArray = {1, 2, 3, 3, 5, 6};

        var result = main.removeDuplicates(intArray);
        System.out.println(Arrays.toString(result));
    }

    /*
        Write a function to find the duplicate number on given integer array.
     */
    public int[] removeDuplicates(int[] arr) {
        int result = removeDuplicates(arr, arr.length);
        System.out.println(result);
        int[] newArray = new int[result];
        for (int i = 0; i < result; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }


    private int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }
}