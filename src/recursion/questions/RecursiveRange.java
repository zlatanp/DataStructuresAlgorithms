package recursion.questions;

public class RecursiveRange {
    public static void main(String[] args) {
        RecursiveRange main = new RecursiveRange();
        var result = main.recursiveRange(2);
        System.out.println(result);
    }

    public int recursiveRange(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }
}
