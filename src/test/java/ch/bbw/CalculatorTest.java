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
    public void testAdditionZweiPositiveIsOk(){
        assertTrue(testee.summe(10, 25) == 35);
    }
    @Test
    public void testAdditionZweiNegativeIsOk(){
        assertTrue(testee.summe(-10, -25) == -35);
    }
    @Test
    public void testAdditionPositivNegativIsOk(){
        assertTrue(testee.summe(-3, 4) == 1);
    }
    @Test
    public void testAdditionPositiveNullIsOk(){
        assertTrue(testee.summe(9, 0) == 9);
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
    @Test
    public void testSubtractionPositiveAndNegativeIsOk(){
        assertTrue(testee.subtraktion(-5, 4) ==-9);
    }
    @Test
    public void testSubtractionPositiveNullIsOk(){
        assertTrue(testee.subtraktion(7, 0) ==7);
    }
    @Test
    public void testSubtractionMAX_VALUEIsOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE, 56) == Integer.MAX_VALUE-56);
    }
    @Test
    public void testSubtractionMIN_VALUEIsOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE, 23) == Integer.MIN_VALUE-23);
    }
    @Test
    public void testSubtractionMAX_VALUENegativeIsOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE, -12) == Integer.MAX_VALUE+12);
    }
    @Test
    public void testSubtractionMIN_VALUEAndNegativeIsOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE, -78) == Integer.MIN_VALUE+78);
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
    @Test
    public void testDivisionTwoPositiveIsOk(){
        assertTrue(testee.division(45, 5) ==9);
    }
    @Test
    public void testSubtractionTwoNegativeIsOk(){
        assertTrue(testee.division(-36, -9) ==4);
    }
    @Test
    public void testDivisionTwoPositiveAndNegativeIsOk(){
        assertTrue(testee.division(12, -6) == -2);
    }
    @Test
    public void testDivisionMAX_VALUEAndPositiveIsOk(){
        assertTrue(testee.division(Integer.MAX_VALUE, 4) ==Integer.MAX_VALUE/4);
    }
    @Test
    public void testDivisionMIN_VALUEAndPositive(){
        assertTrue(testee.division(Integer.MIN_VALUE, 2) ==Integer.MIN_VALUE/2);
    }
    @Test
    public void testDivisionMAX_VALUEAndNegativeIsOk(){
        assertTrue(testee.division(Integer.MAX_VALUE, -3) == Integer.MAX_VALUE/-3);
    }

    //PROTECTED AND PRIVATE METHOD TEST
    @Test
    public void testProtectedMethod(){
        assertTrue(testee.protectedMethod(3, 4) == 7);
    }
    /*
    //DOESNT WORK I DONT KNOW WHY, I TRIED ADD Dp4j IN POM.XML
    //AND IMPORTED IT
    //ERROR:
    //Error:java: java.lang.NoSuchFieldError: booleanType

    @Test
    @TestPrivates
    public void testPrivateMethod() {
        assertTrue(testee.privateMethod(2, 2)== 4);
    }

     */
}
