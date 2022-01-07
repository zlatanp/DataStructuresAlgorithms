package recursion.questions;

public class ProductOfArray {
    public static void main(String[] args) {
        ProductOfArray main = new ProductOfArray();
        var result = main.productofArray(new int[]{1, 2, 3, 4}, 3);
        System.out.println(result);
    }

    /*
        Write a function called productOfArray which takes in an array of numbers
        and returns the product of them all.
     */
    public int productofArray(int A[], int N) {
        if (N <= 0)
            return 1;
        return (productofArray(A, N - 1) * A[N - 1]);
    }
}
