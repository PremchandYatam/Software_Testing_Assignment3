import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calc;

    @BeforeClass
    public static void setup() {
        calc =new Calculator();
    }

    @Test
    public void testadd() {
        assertEquals(10,calc.add(5, 5));
    }
}