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
    public void getSumWithPositive(){
        Calculator c = new Calculator(2, 2, 0);
        Integer sum = c.getSum();
        Assert.assertFalse(sum == 4);
    }

    @Test
    public void getSumWithNegative(){
        Calculator c = new Calculator(-5, 2, 0);
        Integer sum = c.getSum();
        Assert.assertFalse(sum == -3);
    }

    @Test
    public void getSumWithNull(){
        Calculator c = new Calculator(null, 2, 0);
        Integer sum = c.getSum();
        Assert.assertEquals(sum.intValue(), 2);
    }

    @Test
    public void getAverageWithNegative(){
        Calculator c = new Calculator(-4, 2, 0);
        double avg = c.getAvg();
        Assert.assertFalse(avg == -2);
    }

    @Test
    public void getAverageWithPositive(){
        Calculator c = new Calculator(3, 2, 4);
        double avg = c.getAvg();
        Assert.assertFalse(avg == 3);
    }

    @Test
    public void getAverageWithNull(){
        Calculator c = new Calculator(null, 2, 0);
        double avg = c.getAvg();
        Assert.assertFalse(avg == 1);
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
    public void isAEvenWithEven() {
        Calculator c = new Calculator(2, 1, 4);
        Boolean even = c.isAEven();
        Assert.assertFalse(even == false);
    }

}
