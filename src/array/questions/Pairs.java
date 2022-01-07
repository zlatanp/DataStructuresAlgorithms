package array.questions;

public class Pairs {
    public static void main(String[] args) {
        Pairs main = new Pairs();
        int[] intArray = {1, 2, 3, 3, 5, 6};

        var result = main.pairSum(intArray, 7);
        System.out.println(result);
    }

    /*
        Write a function to find all pairs of an integer array
        whose sum is equal to a given number
     */
    public String pairSum(int[] myArray, int sum) {
        String result = "";
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == sum) {
                    result += myArray[i] + ":" + myArray[j] + " ";
                }
            }
        }
        return result;
    }
}