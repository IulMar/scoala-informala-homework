package ro.siit.MaxCalculation;

import java.util.Scanner;
import java.util.Arrays;

/**
 * The program returns the maximum of three values entered from the keyboard
 */

class CalculateTheMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim = 3;
        int numbers[] = new int[dim];
        System.out.println("Please enter 3 elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The entered numbers are: " + Arrays.toString(numbers));
        System.out.println("Maximum value is:" + getMax(numbers, dim));

    }

    /**
     * Function which returns the maximum from an array
     * @param numbersSequence input parameter - the array
     * @param length input parameter - length of the array
     * @return returns the max value from the array
     */

    public static int getMax(int[] numbersSequence, int length) {
        int max = numbersSequence[0];
        for (int i = 1; i < numbersSequence.length; i++) {
            if (numbersSequence[i] > max) {
                max = numbersSequence[i];
            }
        }
        return max;
    }

}

