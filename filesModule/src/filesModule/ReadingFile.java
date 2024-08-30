/*Files Activity 1 : Reading from a text file.                                                      
Program Name : ReadingFile.java
Author : Ronald Yalung
Date :10/13/2023
Class : CSC110AB

Brief Description : This program outputs the data from StudentData.txt then gets the sum of those data and also calculates the double */
package filesModule;

import java.io.*;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException{ {
		
	String fileName = "C:\\Users\\ronal\\filesModule\\StudentData.txt";
	File file = new File(fileName);
	Scanner inFile = new Scanner(file);
	
	double sum = 0;
	double average = 0;
	int numScores = 0;
	
	while(inFile.hasNextDouble()) {
		double score = inFile.nextDouble();
		System.out.println(score);
		sum = sum + score;
		numScores++;
	}
	System.out.println("Sum = " + sum);
	
	average = sum / numScores;
	
	System.out.print("Average = ");
	System.out.printf("%.2f", average);
	
	inFile.close();
		}
	}
}
/*
 * Answer the following questions in you source file file as comments:
 * What happens if the data in StudentData.txt is separated by spaces on a single line instead of a new Line? Use the notepad to edit the StudentData.txt.
 * A: Nothing happens, the output is still the same.
 * What happens if the data in StudentData.txt is separated by tabs?
 * A: Nothing happens, the output is still the same.
 * What happens if the data in StudentData.txt is separated by commas?
 * A: An error happens, the program doesn't run and the output is nothing Ex: Sum = 0.0 Average = NaN
*/
