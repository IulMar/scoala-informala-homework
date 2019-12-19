package ro.siit.IntroToJava;

import java.util.Scanner;

/**
 * This Program displays the sequence between two numbers entered from keyboard
 */
public class DisplayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("From which number do you want to start the sequence? ");
        int a = sc.nextInt();
        System.out.println("At which number should the sequence stop? ");
        int b = sc.nextInt();
        System.out.println("Sequence from " + a + " to " + b + " is: ");
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }

    }
}
