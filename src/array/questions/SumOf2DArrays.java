package array.questions;

public class SumOf2DArrays {
    public static void main(String[] args) {
        SumOf2DArrays main = new SumOf2DArrays();
        int[][] intArray = {{1, 2, 3}, {6, 5, 6}};

        var result = main.sumDiagonal(intArray);
        System.out.println(result);
    }

    /*
        Given 2D array calculate the sum of diagonal elements.
     */
    public int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
