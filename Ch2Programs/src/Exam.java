//Program Name: Exam.java
//Author: Ronald Yalung
//Class:  CSC 110AB
//Date Written: 9/8/2023                                                                                                                
/*Brief Description: The program prompts the user to input three integers as the test scores. At first it will ask "Enter test 1 score:",
 * 					 Then "Enter test 2 score:", after that it will ask "Enter test 3 score:". Once you have inputed all 3 test scores
 * 					 it will calculate the average of those 3 test scores, using the "average" formula, it will also be changes into a double.
 * 					 Finally it will output "The average of the 3 scores is (average)".
*/
/*Description of inputs: "Enter test 1 score: " will take in an input from scr1. "Enter test 2 score: " will take in an input from scr2.
						"Enter test 3 score: " will take in an input from scr3. All of these are int data types until it is calculated for avg.
*/
/*Description of outputs: output 1 will output "Enter test 1 score: (scnr1)" newline, output 2 will output "Enter test 2 score: (scnr2)" newline,
 * 						  output 3 will output "Enter test 3 score: (scnr3)" newline,  output 4 will output "The average of the 3 scores is (avgExamScr)" newline. 
 */

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int scr1;
		int scr2;
		int scr3;
		double avgExamScr;
		
		System.out.print("Enter test 1 score: ");
		scr1 = scnr.nextInt();
		System.out.println();
		System.out.print("Enter test 2 score: ");
		scr2 = scnr.nextInt();
		System.out.println();
		System.out.print("Enter test 3 score: ");
		scr3 = scnr.nextInt();
		System.out.println();
		
		avgExamScr = (double) (scr1 + scr2 + scr3) / 3;
		
		System.out.println("The average of the 3 scores is " + avgExamScr);
	}
}
//Output
/*
Enter test 1 score: 90

Enter test 2 score: 91

Enter test 3 score: 100

The average of the 3 scores is 93.66666666666667
*/