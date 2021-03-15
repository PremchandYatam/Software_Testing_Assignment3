import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrateTest {
    private static Calculator calc;

    @BeforeClass
    public static void setup() {
        calc= new Calculator();
    }
    @Test
    public void testadd() {
        assertEquals(8,calc.add(3, 5));
    }
    @Test
    public void testsub() {
        assertEquals(5,calc.sub(7, 2));
    }
    @Test
    public void testsub1() {
        assertEquals(4,calc.sub(8, 4));
    }

}