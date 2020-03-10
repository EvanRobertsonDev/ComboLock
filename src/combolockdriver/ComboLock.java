/*
 * Evan Robertson
 * March 10 2020
 * ComboLock.java
 * Generates a combo lock to unlock
 */
package combolockdriver;

/**
 *
 * @author evrob0095
 */
public class ComboLock {
    private int num1;
    private int num2;
    private int num3;
    public ComboLock(){
        num1 = (int)(Math.random() * 60) + 1;
        num2 = (int)(Math.random() * 60) + 1;
        num3 = (int)(Math.random() * 60) + 1;
    }
    public ComboLock(int codeA, int codeB, int codeC) {
        num1 = codeA;
        num2 = codeB;
        num3 = codeC;
    }
    public int getCombo1() {
        return(num1);
    }
    public int getCombo2() {
        return(num2);
    }
    public int getCombo3() {
        return(num3);
    }
}
