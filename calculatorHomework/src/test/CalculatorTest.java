import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getMaxWithPositives() {
        Calculator c = new Calculator(1, 2, 3);
        Integer max = c.getMax();
        assertEquals(max, 3);
    }

    @Test
    void getMaxWithNegatives() {
        Calculator c = new Calculator(1, 2, -3);
        Integer max = c.getMax();
        assertEquals(max, 2);
    }

    @Test
    void getMaxWithNull() {
        Calculator c = new Calculator(1, 2, 0);
        Integer max = c.getMax();
        assertEquals(max, 2);
    }

    @Test
    void getMinWithPositives() {
        Calculator c = new Calculator(1, 2, 3);
        Integer min = c.getMin();
        assertEquals(min, 1);
    }

    @Test
    void getMinWithNegatives() {
        Calculator c = new Calculator(1, 2, -3);
        Integer min = c.getMin();
        assertEquals(min, -3);
    }

    @Test
    void getMainithNull() {
        Calculator c = new Calculator(1, 2, 0);
        Integer min = c.getMin();
        assertEquals(min, 0);
    }

    @Test
    void isAEvenWithOdd() {
        Calculator c = new Calculator(1, 2, 3);
        Boolean even = c.isAEven();
        assertFalse(even = false);
    }

    @Test
    void isAEvenWithNull() {
        Calculator c = new Calculator(2, 1, 3);
        Boolean even = c.isAEven();
        assertFalse(even = false);
    }

    @Test
    void isAEven() {
        Calculator c = new Calculator(2, 1, 4);
        Boolean even = c.isAEven();
        assertFalse(even = true);
    }
}