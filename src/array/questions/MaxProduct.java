package array.questions;

class MaxProduct {
    public static void main(String[] args) {
        MaxProduct main = new MaxProduct();
        int[] intArray = {10, 60, 30, 40, 50};

        String pairs = main.maxProduct(intArray);
        System.out.println(pairs);
    }

    /*
        How to find maximum product of two integers in the array
        where all elements are positive.
     */
    public String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}

  
