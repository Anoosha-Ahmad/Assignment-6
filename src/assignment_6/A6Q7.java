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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // input scanner 
        Scanner input = new Scanner(System.in);

        // create an array - the size of the array 
        int[] A = new int[1001];

        // fill the array 
        for (int i = 0; i < A.length; i++) {
            A[i] = i;

        }
        // create a counter 
        int number = 2;

        // 
        while (number <= 7) {

            // replacing any number that is not a prime number by -1 
            //make a counter -- need half of the length of the array
            for (int i = 2; i < (A.length / 2); i++) {
                int multiple = number * i;
                if (multiple < A.length) {
                    

                    //change that spot to negative one 
                    A[multiple] = -1;

                }

            }
            // keep adding one to the number to find the next prime number -- changing the original variable
            number++;
            // 
            while (A[number] == -1) {
                // continously add one 
                number++;

            }

        }
        // re - checking the varibales to se if they are prime 
        for (int i = 2; i < A.length; i++) {
            if (A[i] != -1) {
                System.out.println(A[i]);
            }
        }

    }
}
