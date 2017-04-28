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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks do you want to enter");
        int number = input.nextInt();

        int[] people = new int[number];

        System.out.println("Please enter in your marks:");
        for (int x = 0; x < people.length; x++) {
            people[x] = input.nextInt();
        }
        int remaining = people.length - 1;
        for (int x = 0; x < (people.length - 1); x++) {
            for (int y = 0; y < (remaining); y++) {
                int temp;
                if (people[y] > people[y + 1]) {
                    temp = people[y + 1];
                    people[y + 1] = people[y];
                    people[y] = temp;

                }
            }
            remaining--;
        }
        // outprint the order in ascending orfer to the user
        System.out.println("In ascending order:");
        for (int x = 0; x < people.length; x++) {
            System.out.println(people[x]);

        }
        if (people.length % 2 == 0){
           int mid = people.length / 2; 
           int mid2 = mid - 1;
           double median = (people [mid] + people[mid2]) / 2;
            
            System.out.println("The median of the students marks are:" + median);
        }
        else {
            int  mid = people.length / 2;
            double median = people [mid];
            System.out.println("The median of the marks" + median);
        }
    
}
}
    





