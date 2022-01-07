package array.questions;

class IsUnique {
    public static void main(String[] args) {
        IsUnique main = new IsUnique();
        int[] intArray = {1, 2, 3, 6, 5, 6};

        boolean result = main.isUnique(intArray);
        System.out.println(result);
    }

    /*
        Write a program to check if an array is unique or not.
     */
    public boolean isUnique(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
