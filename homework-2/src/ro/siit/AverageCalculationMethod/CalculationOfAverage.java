package ro.siit.AverageCalculationMethod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The program calculates the average of the numbers in an array given from the keyboard.
 */
public class CalculationOfAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of values for the array: ");
        int dimension = sc.nextInt();
        int sequence[] = new int[dimension];
        System.out.println("Start entering elements: ");
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = sc.nextInt();
            System.out.println("Average is: " + calculateAverage(sequence, i));
        }
    }

    /**
     * Function which calculates the average after each number from the array
     * @param array Input array
     * @param dim input dimension of the array
     * @return average of the numbers in the array
     */
    public static float calculateAverage(int[] array, int dim) {
        float avg = 0;
        for (int j = 0; j <= dim; j++) {
            avg = (avg + array[j]);

        }
        avg = avg / (dim + 1);
        return avg;
    }

}
