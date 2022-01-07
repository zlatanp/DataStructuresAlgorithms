package recursion.questions;

class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary main = new DecimalToBinary();
        var result = main.decimalToBinary(5);
        System.out.println(result);
    }

    /*
        How to convert a number from Decimal to Binary using recursion.
     */
    public int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
