package ro.siit.ConversionOfDegrees;

import java.util.Scanner;

/**
 * The program is converting the number given from they keyboard as degrees Fahrenheit into degrees Celsius.
 */
public class DegreeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your temperature: ");
        float degreesF = sc.nextFloat();
        System.out.println("Your temperature is " + degreesF + " degrees Fahrenheit.");
        System.out.print("Your body temperature in Celsius degrees is " + convertToCelsius(degreesF) + ". ");
        if (convertToCelsius(degreesF) > 37) {
            System.out.println("You are ill!");
        }
    }

    /**
     * Function which converts the degrees Celsius from degrees Fahrenheit
     *
     * @param degreesF input parameter which is the value for the degrees Fahrenheit.
     * @return output value of the degrees Celsius
     */

    public static float convertToCelsius(float degreesF) {
        float degreesC = 1.0f;
        degreesC = ((degreesF - 32) * (5.0f / 9.0f));
        return degreesC;
    }

}

