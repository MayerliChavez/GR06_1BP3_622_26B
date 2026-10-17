package ec.epn.edu.calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals(2, c.subtraction(4, 2));
    }

}
