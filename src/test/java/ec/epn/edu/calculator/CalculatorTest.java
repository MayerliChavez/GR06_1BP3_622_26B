package ec.epn.edu.calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    
  Calculator c = null;

    @Before
    public void setUp() {
        c = new Calculator();
        System.out.println("Setup()");
    }
  
    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
        System.out.println("Test 1");
    }
  
    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals(2, c.subtraction(4, 2));
        System.out.println("Test 2");
    }
}
