/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combolockdriver;
import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type '1' to randomly generate a lock");
        System.out.println("Type '2' to create a lock with a custom code");
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            ComboLock lock = new ComboLock();
            System.out.println("The code for the lock is: " + lock.getCombo1() + " " + lock.getCombo2() + " " + lock.getCombo3());
            System.out.println("Enter the first number for your lock");
            int codeA = Integer.parseInt(input.nextLine());
            System.out.println("Enter the second number for your lock");
            int codeB = Integer.parseInt(input.nextLine());
            System.out.println("Enter the third number for your lock");
            int codeC = Integer.parseInt(input.nextLine());
            if (codeA == lock.getCombo1() && codeB == lock.getCombo2() && codeC == lock.getCombo3()) {
                System.out.println("That is correct");
            }
            else {
                System.out.println("Wrong");
            }
        }
        else if (choice == 2) {
            System.out.println("Enter the first number");
            int codeA = Integer.parseInt(input.nextLine());
            System.out.println("Enter second number");
            int codeB = Integer.parseInt(input.nextLine());
            System.out.println("Third number");
            int codeC = Integer.parseInt(input.nextLine());
            ComboLock lock = new ComboLock(codeA, codeB, codeC);
            System.out.println("Enter the first number for your lock");
            codeA = Integer.parseInt(input.nextLine());
            System.out.println("Enter the second number for your lock");
            codeB = Integer.parseInt(input.nextLine());
            System.out.println("Enter the third number for your lock");
            codeC = Integer.parseInt(input.nextLine());
            if (codeA == lock.getCombo1() && codeB == lock.getCombo2() && codeC == lock.getCombo3()) {
                System.out.println("That is correct");
            }
            else {
                System.out.println("Wrong");
            }
        }
        else {
            System.out.println("Fake number you boomer");
        }
        
        
        
        
    }
    
}
