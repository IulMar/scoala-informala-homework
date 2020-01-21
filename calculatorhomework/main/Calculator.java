public class Calculator {
    private Integer a, b, c;

    /**
     * The program is used for basic mathematical operations like sum, average, get min and max values between 3 values
     */
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

    /**
     * Function which gets the minimum between 3 numbers
     *
     * @return the minimum value
     */
    public Integer getMin() {
        // initializing min
        int min;
        if (a != null) {
            min = a;
        } else { // a = null
            if (b != null) {
                min = b;
            } else { // b=null
                if (c != null) {
                    return null;
                } else {
                    min = c;
                    return min;
                }
            }
        }
//checking min
        if (a != null) {
            if (min > a)
                min = a;
        }
        if (b != null) {
            if (min > b)
                min = b;
        }
        if (c != null) {
            if (min > c)
                min = c;
        }
        return min;
    }


    /**
     * Function which gets the maximum between 3 numbers
     *
     * @return the maximum value
     */
    public Integer getMax() {
        // initializing max
        int max;
        if (a != null) {
            max = a;
        } else { // a = null
            if (b != null) {
                max = b;
            } else { // b=null
                if (c != null) {
                    return null;
                } else {
                    max = c;
                    return max;
                }
            }
        }
//checking max
        if (a != null) {
            if (max < a)
                max = a;
        }
        if (b != null) {
            if (max < b)
                max = b;
        }
        if (c != null) {
            if (max < c)
                max = c;
        }
        return max;
    }

    /**
     * Function which calculates the sum of 3 numbers
     *
     * @return the value of the sum
     */
    public Integer getSum() {
        Integer sum = 0;
        if ((a != null) && (b != null) && (c != null)) {
            sum = sum + a + b + c;
        }
        if (a != null) {
            sum = sum + a;
        }
        if (b != null) {
            sum = sum + b;
        }
        if (c != null) {
            sum = sum + c;
        }
        return sum;
    }

    /**
     * Function which calculates the average between 3 numbers
     *
     * @return the average value
     */
    public double getAvg() {
        float average = 1;
        average = (float)getSum() / 3;
        return average;
    }

    /**
     * Function which checks is the numbers are positive
     *
     * @return true if the numbers are positive and false if not all the numbers are positive
     */
    public boolean areAllPositive() {
        boolean positive = false;
        if ((a != null) && (b != null) && (c != null))
            if ((a > 0) && (b > 0) && (c > 0))
                positive = true;
            else {
                positive = false;
            }
        return positive;
    }

    /**
     * Function which checks if 'a' is even
     *
     * @return true if 'a' is even and false if 'a' is odd
     */
    public boolean isAEven() {
        boolean even = false;
        if ((a != null) && (a % 2 == 0))
            even = true;
        else {
            even = false;
        }
        return even;
    }

}
