/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

import java.util.Scanner;

/**
 *
 * @author ahmaa1808
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner for user input
        Scanner input = new Scanner (System.in); 
        
        //create a list of two numbers
        int [] number = new int [2];
        
       
        System.out.println("Please enter in two integers: ");
        
         for (int i = 0; i < number.length; i ++){
            number [i] = input.nextInt();
        
             System.out.println("The integers in ascending order are: ");
            if  (number[i] < number[i]) {
                System.out.print(number[i] + number[i] + " ");
        
        
    }
}
    }
}

