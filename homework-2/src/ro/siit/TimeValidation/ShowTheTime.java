package ro.siit.TimeValidation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * write a program that asks the user what time it is, by printing on the console "What time is it?".Then the user must enter two numbers – one for hours and one for minutes.
 * If the input data represents a valid time, the program must output the message " The time is hh:mm now.", where hh respectively means the hours, and mm – the minutes.
 * If the entered hours or minutes are not valid, the program must print the message " Incorrect time!". The validation must be implemented in a separate method.
 */
public class ShowTheTime {
    public static void main(String[] args) {
        System.out.println("What is the time?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for hour: ");
        int hour = sc.nextInt();
        System.out.println("Enter value for minutes: ");
        int minutes = sc.nextInt();
        if (defineTime(hour, minutes) == true) {
            System.out.println("The time is " + hour + ":" + minutes);
        } else {
            if (defineTime(hour, minutes) == false) {
                System.out.println("Incorrect time!");
            }
        }
    }

    public static boolean defineTime(int hour, int min) {
        boolean time;
        if ((hour < 25 && hour > 0) && (min < 60 && min > 0)) {
            time = true;
        } else {
            time = false;
        }
        return time;
    }
}

