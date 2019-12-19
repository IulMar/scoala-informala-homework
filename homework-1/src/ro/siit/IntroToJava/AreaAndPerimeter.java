package ro.siit.IntroToJava;

import java.util.Scanner;

/**
 * This Program calculates the area and the perimeter of a rectangle for the width and length entered from keyboard
 */
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int w = sc.nextInt();
        if (l < 0 || w < 0) {
            System.out.println("Please enter positive values for the length and width!");
        } else {

            System.out.println("The area is: " + calculateArea(l, w));
            System.out.println("The perimeter is: " + calculatePerimeter(l, w));
        }
    }

    /**
     * Function which calculates the area of a rectangle
     *
     * @param l length of the rectangle
     * @param w width of the rectangle
     * @return value of the area
     */
    public static int calculateArea(int l, int w) {
        int area = 1;
        area = l * w;
        return area;
    }

    /**
     * Function which calculates the perimeter of a rectangle
     *
     * @param l length of the rectangle
     * @param w width of the rectangle
     * @return value of the perimeter
     */
    public static int calculatePerimeter(int l, int w) {
        int perimeter = 1;
        perimeter = 2 * (l + w);
        return perimeter;
    }
}
