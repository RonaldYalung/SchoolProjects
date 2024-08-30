/*Files Activity 1 : Writing to a text file  STARTING CODE
Program Name : WritingToFiles.java
Author : Ronald Yalung
Date :10/12/2023
Class : CSC110AB

Brief Description : This program writes 5 floating-point numbers to a file */
package filesModule;
import java.io.*;
import java.util.Scanner;

public class WritingToFile {

	public static void main(String[] args) throws IOException{
		//declare needed Variables. score is already declared
		Scanner scan = new Scanner(System.in);
		double score;	
		int count = 1;//to keep track of the number of exam scores//Initialize the count variable to 1
		//Define/declare a PrintWriter object reference outFile and 
		//create a PrintWriter object by passing file name StudentData.txt
				//to the constructor
		PrintWriter outFile = new PrintWriter("StudentData.txt");

	    //Start a while loop that iterates 5 times. Use the count variable to control the loop
		while (count <= 5) {
			System.out.println("Enter exam " + count + " scores: ");//prompt the user for the exam score
			score = scan.nextDouble();//read the exam score in the score variable
			
			outFile.println(score);//now write the score in the opened file
			count++;
		}
		//write a message back to the user
				System.out.println("Your numbers have been written to the StudentData.txt file.\n");
				
			    //Close the output file
				outFile.close();
				
			    System.out.println("Goodbye\n");
	}

}
/*Please answers the questions below as comments 
Save file with your answers and then upload to Canvas

   1.	Where is StudentData.txt located?
   		* Is located in the filesModule.

   2.	What happens to data that is StudentData.txt when you run your
         program again with different exam values?
       * The program overrides the file and adds another file to "StudentData.txt" with the new values.
*/

