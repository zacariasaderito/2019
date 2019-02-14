package as.as.mavin;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void multi(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(9,calculator.multi(3,3));
    }

    @Test
    public void sum()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(7, calculator.sum(3,4));
    }

}
