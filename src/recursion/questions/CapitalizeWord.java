package recursion.questions;

public class CapitalizeWord {
    public static void main(String[] args) {
        CapitalizeWord main = new CapitalizeWord();
        var result = main.capitalizeWord("upPercaSe");
        System.out.println(result);
    }

    /*
        Implement a function that capitalizes each word in String.
     */
    public static String capitalizeWord(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length() - 1);
        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if ((str.substring(str.length() - 2, str.length() - 1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
    }
}
