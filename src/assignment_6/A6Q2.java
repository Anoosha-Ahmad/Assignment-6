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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        // create a scanner for user input 
        Scanner input = new Scanner(System.in);

        // ask user how many people they will be reading the height of
        System.out.println("How many people are you going to be reading?");
        int people = input.nextInt();

        //create a list of numbers corresponding to the number of students inputed by user
        int heights[] = new int[people];
        System.out.println("Please enter in their heights");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
        }
        //calculate sum of the heights--> for loop
        //accumulator
        int sum = 0;

        //loop to go through each number
        for (int i = 0; i < heights.length; i++) {
            // add whatever number im on to the sum 
            sum += heights[i];
        }

        //calculate average
        int average = sum / heights.length;

        //find what heights are above average in the group
        System.out.print("The heights that are above average are: ");
        for (int i = 0; i < heights.length; i++) {
            if (average < heights[i]) {
                System.out.print(heights[i] + " ");
            }
        }





////e median = 0;
//    double mid=0;
//    if(num_value%2 == 0)
//    {
//    int temp=(num_value/2)-1;
//    for(int i=0;i<num_value;i++)
//    {
//    if(temp==i || (temp+1)==i)
//    {
//    mid=mid+invalue[i];
    }
    }
    

