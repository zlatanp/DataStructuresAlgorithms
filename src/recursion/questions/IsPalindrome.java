package recursion.questions;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome main = new IsPalindrome();
        var result = main.isPalindrome("Reverse");
        System.out.println(result);
    }

    /*
        Write a recursive function called isPalindrome which returns true if the string
        passed to it is a palindrome (reads the same forward and backward).
        Otherwise it returns false.
     */
    public boolean isPalindrome(String s) {
        // if length is 0 or 1 then String is palindrome
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }
}
