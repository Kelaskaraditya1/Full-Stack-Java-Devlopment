import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest_product {
    public Calculator calculator;
    @Before
    public void setUp() throws Exception
    {
        calculator=new Calculator();
    }
    @Test
    public void product() {
        assertEquals(100,calculator.product(10,10));

    }
}