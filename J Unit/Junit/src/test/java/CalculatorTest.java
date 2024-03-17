import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    public Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }
    @Test
    public void divide() {
        int ans=calculator.divide(10,5);
        assertEquals(ans,2);
    }
}