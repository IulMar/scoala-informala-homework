package ro.siit.IntroToJava;

/**
 * This Program calculates the sum of the first n=100 numbers
 */

public class SumOfNumbers {
    public static void main(String... args) {
        System.out.println("Some of the first 100 numbers is: " + calculateSum(100));
    }

    /**
     * Function which calculates the Sum of n numbers
     *
     * @param n number of values for which the sum will be calculated
     * @return the sum of the n numbers
     */
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}