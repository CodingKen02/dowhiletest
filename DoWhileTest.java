/*
 * Name: Kennedy Keyes
 * Date: April 2, 2021
 * Name of Program: DoWhileTest.java
 * Description: This program will demonstrate how to use a do...while statement.
 */
package dowhiletest;

/**
 *
 * @author codingken
 */
public class DoWhileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 1;
        
        do {
            System.out.printf("%d  ", counter);
            ++counter;
        } while (counter <= 10);
        
        System.out.println();
    }
}
