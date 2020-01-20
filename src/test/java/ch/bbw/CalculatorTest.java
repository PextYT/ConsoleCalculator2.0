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
    @Test
    public void testAdditionPositivNegativIsOk(){
        assertTrue(testee.summe(-3, 4) == 1);
    }
    @Test
    public void testAdditionPositiveNullIsOk(){
        assertTrue(testee.summe(9, 0) == 3);
    }
    @Test
    public void testAdditionMAX_VALUEIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, 6) == Integer.MAX_VALUE+6);
    }
    @Test
    public void testAdditionMIN_VALUEIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, 7) == Integer.MIN_VALUE+7);
    }
    @Test
    public void testAdditionMAX_VALUENegativeIsOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE, -2) == Integer.MAX_VALUE-2);
    }
    @Test
    public void testAditionMIN_VALUEANegativeIsOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE, -8) == Integer.MIN_VALUE-8);
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
