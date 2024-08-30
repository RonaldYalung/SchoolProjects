import java.util.Random;
import java.util.Scanner;
import java.util.*;
/**
 * Program name: StatsArray.java
 * @author: Ronald Yalung
 * Class: CSC110 AB
 * Date: 10/29/2023
 * Description: Makes a random array of number and that are used to represent
 * test scores at random and allows the user to continually make new ones
 */
public class StatsArray {
    
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int SIZE = 10;
		//Declaring scores array
		int[] stats = new int[SIZE];
		char userInput;
		int a = 0;
		int b = 0;
	
		do {
		displayData(stats);
		System.out.println("Total: " + findTotal(stats));
		System.out.println("Average: " + findAvg(stats));
		System.out.println("Average without minimum value: " + findAvgAfterRemovingMin(stats));
		System.out.println("Maximum value: " + findLargest(stats));
		System.out.println("Minimum Value: " + findSmallest(stats));
		findLetterGrade(b, a, stats);
		
		if (isNumberFound(100, stats)) {
			System.out.println("You have a perfect exam score!");
		}
		else {
			System.out.println("Sorry, you DO NOT have a perfect exam score.");
		}
		
		System.out.print("Please enter Y to continue and N to quit: ");
		userInput = scnr.next().toUpperCase().charAt(0);
		
	}while (userInput == 'Y');
		System.out.println("Goodbye!");
		
}  // end of main method

/**
 * This method randomFill fills array with random numbers in the range of 0-100
 * @param data array to be filled with random numbers
 */
	public static void randomFill( int[] data ) {
	    
	   Random rand = new Random();
	   
	    for( int i = 0; i < data.length; ++i ) {
	    
		data[i] = rand.nextInt(101);
		System.out.println("[" + i + "] " + data[i]);
	    }
   }  //end randomFill method
	
	public static int findTotal(int [] data) {
		int Total = 0;
		
		for (int j = 0; j < data.length; ++j) {
			Total = Total + data[j];
		}
		return Total;
	}
	
	 public static double findAvg(int[] data) {
		 double avg = (double) findTotal(data) / data.length;
		 return avg;
	 }
	 
	 public static int findAvgAfterRemovingMin(int[] data) {
		 int secondAvg = (int) findAvg(data) - findSmallest(data);
		 return secondAvg;
	 }
	 
	 public static int findLargest(int [] data) {
		 int maxVal = data[0];
		 
		 for (int k = 0; k < data.length; ++k) {
		 if (data[k] > maxVal) {
			 maxVal = data[k];
		  }
		}
		 return maxVal;
	 }
	 
	 public static int findSmallest(int [] data) {
		 int minVal = Integer.MAX_VALUE;
		 
		 for (int l = 0; l < data.length; ++l) {
			 if (data[l] < minVal) {
				 minVal = data[l];
			 }
		 }
		 return minVal;
	 }
	 
	 public static int findLetterGrade(int lowRange, int highRange, int [] data ) {
		 highRange = 0;
		 lowRange = 0;
		 for (int g = 0; g < data.length; ++g) {
			 if (data[g] >= 90 && data[g] <= 100) {
				 ++highRange; 
			 }
			 else if (data[g] >= 80 && data[g] <= 89) {
				 ++lowRange;
			 }
		 }
		 System.out.println("Number of A's: " + highRange);
		 System.out.println("Number of B's: " + lowRange);
		 return highRange;
	 }
	 
	 public static boolean isNumberFound(int target, int [] data ) {
		 for (int p = 0; p < data.length; ++p) {
			 if (data[p] == target) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void displayData(int[] data) {
		 randomFill(data);
	 }
} //end of StatsArray Class 
//output
/*
[0] 41
[1] 78
[2] 72
[3] 57
[4] 12
[5] 98
[6] 16
[7] 14
[8] 18
[9] 49
Total: 455
Average: 45.5
Average without minimum value: 33
Maximum value: 98
Minimum Value: 12
Number of A's: 1
Number of B's: 0
Sorry, you DO NOT have a perfect exam score.
Please enter Y to continue and N to quit: y
[0] 18
[1] 2
[2] 38
[3] 82
[4] 84
[5] 25
[6] 81
[7] 61
[8] 46
[9] 10
Total: 447
Average: 44.7
Average without minimum value: 42
Maximum value: 84
Minimum Value: 2
Number of A's: 0
Number of B's: 3
Sorry, you DO NOT have a perfect exam score.
Please enter Y to continue and N to quit: n
Goodbye!
 */
