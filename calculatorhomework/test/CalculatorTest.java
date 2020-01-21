import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void getMaxWithPositives() {
        Calculator c = new Calculator(1, 2, 3);
        Integer max = c.getMax();
        Assert.assertEquals(max.intValue(), 3);
    }

    @Test
    public void getMaxWithNegatives() {
        Calculator c = new Calculator(1, 2, -3);
        Integer max = c.getMax();
        Assert.assertEquals(max.intValue(), 2);
    }

    @Test
    public void getMaxWithNull() {
        Calculator c = new Calculator(1, 2, null);
        Integer max = c.getMax();
        Assert.assertEquals(max.intValue(), 2);
    }

    @Test
    public void getMinWithPositives() {
        Calculator c = new Calculator(1, 2, 3);
        Integer min = c.getMin();
        Assert.assertEquals(min.intValue(), 1);
    }

    @Test
    public void getMinWithNegatives() {
        Calculator c = new Calculator(1, 2, -3);
        Integer min = c.getMin();
        Assert.assertEquals(min.intValue(), -3);
    }

    @Test
    public void getMinWithNull() {
        Calculator c = new Calculator(null, 2, 0);
        Integer min = c.getMin();
        Assert.assertEquals(min.intValue(), 0);
    }

    @Test
    public void isAEvenWithOdd() {
        Calculator c = new Calculator(1, 2, 3);
        Boolean even = c.isAEven();
        Assert.assertFalse(even == true);
    }

    @Test
    public void isAEvenWithNull() {
        Calculator c = new Calculator(null, 1, 3);
        Boolean even = c.isAEven();
        Assert.assertFalse(even == true);
    }

    @Test
    public void isAEven() {
        Calculator c = new Calculator(2, 1, 4);
        Boolean even = c.isAEven();
        Assert.assertFalse(even == false);
    }

}
