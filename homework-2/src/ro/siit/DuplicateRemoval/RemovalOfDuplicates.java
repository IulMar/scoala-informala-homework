package ro.siit.DuplicateRemoval;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  The program removes the duplicates from an array given from the keyboard. The length of the array is also given from the keyboard.
 */

public class RemovalOfDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of values for the array: ");
        int dimension = sc.nextInt();
        int sequence[] = new int[dimension];
        System.out.println("Please enter " + dimension + " elements: ");
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = sc.nextInt();
        }
        System.out.println("The entered array is:  " + Arrays.toString(sequence));
        Arrays.sort(sequence, 0, dimension);
        //System.out.println("Sorted array: "  + Arrays.toString(sequence));
        int newLength = removeDuplicates(sequence);

        // System.out.println("Length of array after removing duplicates = " + newLength);
        System.out.println();
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(sequence[i] + " ");
        }

    }

    /**
     * function which removes duplicates from a sorted array
     * @param numbersSequence Input is the sorted array
     * @return the array without the duplicates
     */
    public static int removeDuplicates(int[] numbersSequence) {
        int n = numbersSequence.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && numbersSequence[i] == numbersSequence[i + 1]) {
                continue;
            }
            numbersSequence[j++] = numbersSequence[i];
        }
        return j;
    }
}
