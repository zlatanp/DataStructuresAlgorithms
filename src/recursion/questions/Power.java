package recursion.questions;

class Power {
    public static void main(String[] args) {
        Power main = new Power();
        var result = main.power(2, -2);
        System.out.println(result);
    }

    /*
        Write a function called power which accepts a base and an exponent.
        The function should return the power of the base to the exponent.
        This function should mimic the functionality of math.pow() - do not worry about negative bases and exponents.
     */
    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * power(base, exp - 1);
    }
}
