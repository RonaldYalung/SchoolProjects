import java.util.*;
import java.util.Random;
import java.util.Scanner;
/**
 * Program name: StatsArray.java
 * @author: Ronald Yalung
 * Class: CSC110AB
 * Date: 10/22/2023
 * Description: Makes a random array of number and that are used to represent
 * test scores at random and allows the user to continually make new ones
 */
public class StatsArray {

	public static void main(String[] args) {
		//declarations
		Scanner scnr = new Scanner(System.in);
		final int SIZE = 10;
		int[] scores = new int[SIZE];
		Random rand = new Random();
		int i;
		double avg;
		int numA = 0;
		int minVal = Integer.MAX_VALUE;
		int maxVal = scores[0];
		int sumVal = 0;
		
		System.out.println("Exam Scores");
		System.out.println("-----------");
		
		for (i = 0; i < scores.length; ++i) {
			
			//generates random number range 0-100
			int r = rand.nextInt(101);
			System.out.println("[" + i + "] "+ r);
			
			//finds min value in array
			if (r < minVal) {
				minVal = r;
			}
			
			//finds max value in array
			if (r > maxVal) {
				maxVal = r;
			}
			
			//sum of all values
			 sumVal = sumVal + r;
			 
			//Checks how many A's there are
			 if (r >= 90 && r <= 100) {
				 numA += 1;
			}
		}
		//gets the average
		 avg = (double) sumVal / scores.length;
		 
		System.out.println("The minimum value : " + minVal);
		System.out.println("The maximum value : " + maxVal);
		System.out.println("The total is      : " + sumVal);
		System.out.println("The average is    : " + avg);
		System.out.println("Number of A's     : " + numA);
		System.out.println("Goodbye!");
		
		}
	}
//example output
/*
Exam Scores
-----------
[0] 50
[1] 72
[2] 63
[3] 67
[4] 76
[5] 38
[6] 80
[7] 96
[8] 86
[9] 17
The minimum value : 17
The maximum value : 96
The total is      : 645
The average is    : 64.5
Number of A's     : 1
Goodbye!
*/