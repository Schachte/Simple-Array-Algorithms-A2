/*
 * Name: Ryan Schachte
 * Student ID: 1206017757
 * Lecture Time: T/TH 3:00 PM - 4:15 PM
 * Time Spent: 1 hour
 * Program Description: Program that reads in a sequence of numbers (not necessary integers) from 
 * standard input until 0 is read, and stores them in an array. This is done using iteration (choose for, while, or do while loop). 
 * You may assume that there will not be more than 100 numbers.
 */

import java.text.*;
public class ArrayMethods {
	
	 public static double findMin(double[] numbers, int count) //count is the count of numbers stored in the array
	 {
		 DecimalFormat formatter = new DecimalFormat("#");
		 double min = numbers[0];
		 
		 for (int i = 1; i < count; i++)
		 {
			 if (numbers[i] <= min && numbers[i] != 0)
			 {
				 min = numbers[i];
			 }
		 }
		 System.out.println("The minimum number is " + formatter.format(min));
		 return min;
		 
	 }

	 public static double computePositiveSum(double[] numbers, int count) //Counts the sum of only the positive values in the array
	 {
		 DecimalFormat formatter = new DecimalFormat("0.00");
		 double positiveSum = 0; //double to store total sum as loop iterates
		 
		 for (int i = 0; i < count; i++)
		 {
			 if (numbers[i] > 0)
			 {
				 positiveSum += numbers[i];
			 }
		 }
		 
		 System.out.println("The sum of the positive numbers is $" + formatter.format(positiveSum));
		 //System.out.print(formatter.format(positiveSum));
		 
		 return positiveSum;
	 }
	 
	 public static int countNegative(double[] numbers, int count) //Counts how many negative numbers exist within the array
	 {
		 int negCount = 0; //Variable to store number of negative numbers
		 
		 for (int i = 0 ; i < count; i++)
		 {
			 if (numbers[i] < 0)
			 {
				 negCount++;
			 }
		 }
		 
		 System.out.println("The total number of negative numbers is " + negCount);
		 return negCount;
	 }
}
