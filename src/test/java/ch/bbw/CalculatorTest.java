package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOk(){
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }
}
