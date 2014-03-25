/*
 * Name: Ryan Schachte
 * Student ID: 1206017757
 * Lecture Time: T/TH 3:00 PM - 4:15 PM
 * Time Spent: 1 hour
 * Program Description: Program that reads in a sequence of numbers (not necessary integers) from 
 * standard input until 0 is read, and stores them in an array. This is done using iteration (choose for, while, or do while loop). 
 * You may assume that there will not be more than 100 numbers.
 */

import java.util.Scanner;
import java.lang.*;

public class Assignment2 {
	
	
	public static void main (String[]args)
	{
		
		Scanner input = new Scanner(System.in); //Required to capture user input
		
		int count = 0; //Number of numbers added into the array
		int numAdd; // Number to add into the array
		double numbers [] = new double[100]; //Array with 100 slots of memory
		
		ArrayMethods ArrayManipulation = new ArrayMethods();
		
		
		//BEGIN ADDING NUMBERS TO ARRAY HERE
		for (int i = 0 ; i < numbers.length; i++)
		{
			numAdd = input.nextInt();
			if (numAdd != 0)
			{
				numbers[i] = numAdd;
				count++;
			}
			
			else if (numAdd == 0)
			{
				break;
			}
		}
		//END ADDING NUMBERS TO ARRAY HERE
		
		ArrayManipulation.findMin(numbers, count); //Method to find the smallest number in the array
		ArrayManipulation.computePositiveSum(numbers, count); //Finds the total sum of only the positive numbers
		ArrayManipulation.countNegative(numbers, count); //Counts number of negative numbers
		
				
	}
	
}
	
   