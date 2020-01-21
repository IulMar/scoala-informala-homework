public class CalculatorMainClass {
    public static void main(String[] args) {
        Calculator c = new Calculator(null, 5, 4);
        Integer maxim = c.getMax();
        Integer minim = c.getMin();
        Double avg = c.getAvg();
        Integer suma = c.getSum();
        Boolean numberEven = c.isAEven();
        Boolean numberPositive = c.areAllPositive();
        if ((maxim == null) || (minim == null)) {
            System.out.println("You've entered a null number!");
        } else {
            System.out.println("The maximum value is: " + maxim);

            System.out.println("The minimum value is: " + minim);
        }
        System.out.println("The sum of the values is: " + suma);

        System.out.println("The average value is: " + avg);

        if (numberPositive == true) {
            System.out.println("The numbers are positive.");
        } else {
            System.out.println("Not all the numbers are positive.");
        }
        if (numberEven == true) {
            System.out.println("'a' is even.");
        } else {
            System.out.println("'a' is odd.");
        }


    }
}
