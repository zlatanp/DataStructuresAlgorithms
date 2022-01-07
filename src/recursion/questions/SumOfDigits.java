package recursion.questions;

class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits main = new SumOfDigits();
        var result = main.sumofDigits(111);
        System.out.println(result);
    }

    /*
        How to find the sum of digits of a positive integer number using recursion.
     */
    public int sumofDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumofDigits(n / 10);
    }
}
