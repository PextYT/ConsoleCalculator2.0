package ch.bbw;
/**
 *
 * @Author Merlin Stocker
 * @Date Januar 2020
 *
 */

public class Calculator {
    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }
    public int subtraktion(int value1, int value2) {
        return value1 - value2;
    }
    public int division(int value1, int value2){
        return value1 / value2;
    }
    protected int protectedMethod(int value1, int value2){
        return value1 + value2;
    }
    private int privateMethod(int value1, int value2){
        return value1 + value2;
    }
}
