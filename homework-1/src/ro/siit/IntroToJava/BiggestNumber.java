package ro.siit.IntroToJava;

import java.util.Scanner;

/**
 * This Program calculates the biggest number from 3 values entered from keyboard.
 */
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println(determineBiggest(a, b, c) + " is the biggest number.");
    }

    /**
     * @param a first number entered from keyboard
     * @param b second number entered from keyboard
     * @param c third number entered from keyboard
     * @return the biggest number
     */
    public static int determineBiggest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
