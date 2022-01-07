package array.questions;

class FindNumber {
    public static void main(String[] args) {
        FindNumber main = new FindNumber();
        int[] intArray = {1, 2, 3, 4, 5, 6};

        main.linearSearch(intArray, 7);
    }

    /*
        Find given integer value in given array of integers.
     */
    public void linearSearch(int[] intArray, int value) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }
}
