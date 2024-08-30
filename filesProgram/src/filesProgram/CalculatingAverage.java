//Program Name: CalculatingAverage.java
//Author: Ronald Yalung
//Class: CSC 110AB
//Date Written: 10/15/2023
/*Brief description: Gets the data from scores.txt and makes a report on it calculating the average for each name.
 * 					 This program also puts the result of the exam report into another text file called CSExamReport.txt making it have the same format that is outputted onto the console.
Description of inputs: fName and lName gets the first and last name of each student and num1-num5 gets each exam score that they have.
*/
package filesProgram;
import java.util.Scanner;
import java.io.*;
public class CalculatingAverage {

	public static void main(String[] args) throws FileNotFoundException { {
		//writing to file
		PrintWriter outFile = new PrintWriter("CSExamReport.txt");
		
		//reading from file
		String fileName = "C:\\Users\\ronal\\OneDrive\\Desktop\\CSC110AB-fall2023\\filesProgram\\scores.txt\\";
		File file = new File(fileName);
		Scanner inFile = new Scanner(file);
		
		//header for reading file and writing file
		System.out.println("Computer Scientist Exam Report");
		System.out.println("--------------------------------");
		outFile.println("Computer Scientist Exam Report");
		outFile.println("--------------------------------");
		
		//variable declarations
		String fName;
		String lName;
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		double average;
		int count = 0;
		double sum = 0;
		
		while (inFile.hasNext()) {
			fName = inFile.next();
			lName = inFile.next();
			
			 num1 = inFile.nextDouble();
		     num2 = inFile.nextDouble();
			 num3 = inFile.nextDouble(); 
			 num4 = inFile.nextDouble();
			 num5 = inFile.nextDouble();
			
			 sum = num1 + num2 + num3 + num4 + num5;
			 average = sum / 5;
			 
			 //outputs to console
			 System.out.print(fName + " " + lName + " has an exam average of ");
			 System.out.printf("%.2f", average);
			 System.out.println();
			 
			 //writes into file CSExamReport.txt
			 outFile.print(fName + " " + lName + " has an exam average of ");
			 outFile.printf("%.2f", average);
			 outFile.println();
			 	 
			 ++count;
		}
		inFile.close();
		
		//closing statement for writing file
		outFile.println();
		outFile.println("There were " + count + " student records in the file.");
		
		outFile.close();
		
		//closing statement for reading file
		System.out.println();
		System.out.println("There were " + count + " student records in the file.");
		
		System.out.println();
		System.out.println("All files are closed and a report is written. Goodbye!");
		}
	}
}
//console output
/*
Computer Scientist Exam Report
--------------------------------
Grace Hopper has an exam average of 82.02
Alan Kay has an exam average of 83.04
John Backus has an exam average of 92.12
Sergey Brin has an exam average of 85.50
Dennis Ritchie has an exam average of 98.98
Brian Kernighan has an exam average of 97.40

There were 6 student records in the file.

All files are closed and a report is written. Goodbye!

*/

//CSExamReport.txt output
/*
 Computer Scientist Exam Report
--------------------------------
Grace Hopper has an exam average of 82.02
Alan Kay has an exam average of 83.04
John Backus has an exam average of 92.12
Sergey Brin has an exam average of 85.50
Dennis Ritchie has an exam average of 98.98
Brian Kernighan has an exam average of 97.40

There were 6 student records in the file.
*/
