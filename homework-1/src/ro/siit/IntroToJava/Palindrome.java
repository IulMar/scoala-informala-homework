package ro.siit.IntroToJava;

import java.util.Scanner;

/**
 * This Program determines if a number entered from keyboard is a palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int number = new Scanner(System.in).nextInt();

        if (checkPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

    }

    /**
     * Boolean function which checks if a number is a palindrome
     * @param number stores the number entered from keyboard
     * @return checks if the number is equal with its reverse
     */
    public static boolean checkPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + (temp % 10);
            temp = temp / 10;
        }
        return number == reverse;

    }
}