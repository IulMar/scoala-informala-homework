public class Calculator {
    private Integer a, b, c;

    public Calculator() {
    }

    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getMax() {

        if ((a > b) && (a > c) && (a != null) && (b != null) && (c != null)){
            return a;
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public Integer getMin() {
        if ((a < b) && (a < c) && (a != null) && (b != null) && (c != null)){
            return a;
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public Integer getSum() {
        Integer sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double getAvg() {
        Integer average = 1;
        for (int i = 0; i < 3; i++) {
            average = getSum() + i;
        }
        return average;
    }

    public boolean areAllPositive() {
        boolean positive = false;
        if ((a > 0) && (b > 0) && (c > 0) && (a != null) && (b != null) && (c != null))
            positive = true;
        else {
            positive = false;
        }
        return positive;
    }

    public boolean isAEven() {
        boolean even = false;
        if ((a % 2 == 0) && (a != null))
            even = true;
        else {
            even = false;
        }
        return even;
    }
}

