package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    Calculator testee;

    @Before
    public void setup() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk(){
        assertTrue(testee.summe(10, 25) == 35);
    }
    @Test
    public void testSubtractionZweiPositiveOk(){
        assertTrue(testee.subtraktion(25, 10) == 15);
    }
    @Test
    public void testSummeZweiNegativeIsOk(){
        assertTrue(testee.summe(-10, -25) == -35);
    }
    @Test
    public void testSubtractionZweiNegativeIsOk(){
        //Added single Test in Method
        assertTrue(testee.subtraktion(-10, -25) == 15);
    }
    @Test(expected=ArithmeticException.class)
    public void testExpectedExcpetionDivision(){
        assertTrue(testee.division(2, 0) ==0);
    }
}
