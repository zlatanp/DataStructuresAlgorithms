package recursion;

class RecursionFibonacci {
    public static void main(String[] args) {
        RecursionFibonacci main = new RecursionFibonacci();
        var rec = main.fibonacci(10);
        System.out.println(rec);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
