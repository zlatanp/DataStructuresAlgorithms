package recursion.questions;

public class FirstUppercase {
    public static void main(String[] args) {
        FirstUppercase main = new FirstUppercase();
        var result = main.first("upPercaSe");
        System.out.println(result);
    }

    public static char first(String str) {
        if (str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        } else {
            return first(str.substring(1, str.length()));
        }
    }
}
