package ro.siit.TimeValidation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The program validates if 2 values entered from the keyboard are valid for time ( hours and minutes)
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

    /**
     *
     * @param hour Input value for the hour
     * @param min Input value for the minutes
     * @return true or false
     */

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

