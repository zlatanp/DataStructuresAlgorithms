package array.questions;

import java.util.Arrays;
import java.util.Collections;

public class BestScore {
    public static void main(String[] args) {
        BestScore main = new BestScore();
        Integer[] intArray = {1, 2, 3, 6, 5, 6};

        var result = main.firstSecond(intArray);
        System.out.println(result);
    }

    /*
        Given and array, write a function to get first, second best scores from the array.
        Array may contain duplicates.
     */
    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first + " " + second;
    }
}