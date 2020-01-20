package ch.bbw;

import static org.junit.Assert.assertTrue;

//import com.dp4j.TestPrivates;
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

    //SUMME TESTS
    @Test
    public void testSummeZweiPositiveIsOk(){
        assertTrue(testee.summe(10, 25) == 35);
    }
    @Test
    public void testSummeZweiNegativeIsOk(){
        assertTrue(testee.summe(-10, -25) == -35);
    }

    //SUBTRAKTION TESTS
    @Test
    public void testSubtractionZweiPositiveOk(){
        assertTrue(testee.subtraktion(25, 10) == 15);
    }
    @Test
    public void testSubtractionZweiNegativeIsOk(){
        //Added single Test in Method
        assertTrue(testee.subtraktion(-10, -25) == 15);
    }

    //DIVISION TESTS
    @Test(expected=ArithmeticException.class)
    public void testExpectedExcpetionDivision(){
        assertTrue(testee.division(2, 0) ==0);
    }
    @Test
    public void testUnexpectedExceptionDivision() throws ArithmeticException{
        assertTrue(testee.division(5, 0) ==6);
    }

    //PROTECTED AND PRIVATE METHOD TEST
    @Test
    public void testProtectedMethod(){
        assertTrue(testee.protectedMethod(3, 4) == 7);
    }
    /*
    DOESNT WORK I DONT KNOW WHY, I TRIED ADD Dp4j IN POM.XML
    AND IMPORTED IT ERROR:
    Error:java: java.lang.NoSuchFieldError: booleanType

    @Test
    @TestPrivates
    public void testPrivateMethod() {
        assertTrue(testee.privateMethod(2, 2)== 4);
    }

     */
}
