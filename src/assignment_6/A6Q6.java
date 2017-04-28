/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ahmaa1808
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create scanner for user input
        Scanner input = new Scanner(System.in);
        
        // ask how mnay students are in the class to determine the size of the array
     System.out.println("How many students in the class?");
     int students = input.nextInt();
     
     // the size of the array 
     int [] marks = new int [ students ]; 
     
       System.out.println("Please enter in your marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
     
       
     // marks [0]
        
     
        System.out.println("The students mark from lowest to hightest are :" + marks);
            
    
    }
}
    
