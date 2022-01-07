package recursion;

class RecursionFactorial {
    public static void main(String[] args) {
        RecursionFactorial main = new RecursionFactorial();
        var rec = main.factorial(5);
        System.out.println(rec);
    }

    public int factorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
