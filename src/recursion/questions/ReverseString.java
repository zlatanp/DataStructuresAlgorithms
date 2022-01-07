package recursion.questions;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString main = new ReverseString();
        var result = main.reverse("Reverse");
        System.out.println(result);
    }

    /*
        Write a recursive function called reverse which accepts a string
        and returns a new string in reverse
     */
    public String reverse(String str) {
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
