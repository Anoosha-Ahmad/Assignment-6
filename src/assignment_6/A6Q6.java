/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

import java.text.DecimalFormat;
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
        int[] marks = new int[students];

        System.out.println("Please enter in your marks");
        for (int x = 0; x < marks.length; x++) {
            marks[x] = input.nextInt();
        }
        int remaining = marks.length - 1;
        for (int x = 0; x < (marks.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (marks[y] > marks[y + 1]) {
                    temp = marks[y + 1];
                    marks[y + 1] = marks[y];
                    marks[y] = temp;

                }
            }
            remaining--;

        }
        System.out.println("In ascending order:");
        for (int x = 0; x < marks.length; x++) {
            System.out.println(marks[x]);
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double avg = sum/ marks.length;
        
        DecimalFormat round = new DecimalFormat("###.##");
        
        System.out.println(" ");
        System.out.println("The average is " + round.format(avg) + "%");
        
        System.out.println(" ");
        System.out.println(" The lowest mark is" + marks[0] + "%");
        System.out.println(" ");
        System.out.println("The highest mark is " + marks[marks.length-1] + "%");
        
                

    }
    // marks [0]
}
