public class CalculatorMainClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator(null, 3, 4);
        Integer maxim = calc.getMax();
        Integer minim = calc.getMin();
        Double avg = calc.getAvg();
        Integer suma = calc.getSum();
        Boolean numberEven = calc.isAEven();
        Boolean numberPositive = calc.areAllPositive();
        System.out.println("Maximul dintre numere este: " + maxim);

        System.out.println("Minimul dintre numere este: " + minim);

        System.out.println("Average dintre numere este: " + avg);

        System.out.println("Suma numerelelo ester: " + suma);

        if (numberPositive = true) {
            System.out.println("Numerele introduse sunt positive.");
        } else {
            System.out.println("Nu toate numerele introduse sunt positive.");
        }
        if (numberEven = true) {
            System.out.println("a este numar par.");
        } else {
            System.out.println("a nu este numar par.");
        }


    }
}
