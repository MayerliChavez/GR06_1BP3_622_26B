package ec.epn.edu.calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
    }
}
