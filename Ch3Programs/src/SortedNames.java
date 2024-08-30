//Program Name: SortedNames.java
//Author: Ronald Yalung
//Class: CSC 110AB
//Date Written: 9/23/2023                                                                                                                   
//Brief Description: the program asks the user for three first names and the order in which to display the names. The program then displays the names either in sorted order (alphabetical) or reverse sorted order.
//					 After the program reads the three names, it will ask the user if he/she wants the names displayed in reverse alphabetical order. The user must answer either “yes” or “No” in either upper or lower case. Otherwise, an error message is displayed and the names are not sorted.
//Description of inputs: firstName, secondName, thirdName take in a string name. order takes in a string word, if the word is "yes" the program will put the names in reverse alphabetical order, if the word is "no" the program will put the names in alphabetical order,  if the words are neither yes or no the program will output"You answered neither yes nor No". 

import java.util.Scanner;

public class SortedNames {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName;
		String secondName;
		String thirdName;
		String order;
		
		System.out.println("The program will ask for three first names");
		System.out.println("and the order in which they should be displayed");
		System.out.println("then the names will be displayed in the order requested");	
		
		System.out.print("Enter the first name: ");
		firstName = scnr.next();
		System.out.print("Enter the second name: ");
		secondName = scnr.next();
		System.out.print("Enter the third name: ");
		thirdName = scnr.next();
		System.out.println("Do you want the names in reverse alphabetical order? (Yes or No )");
		order = scnr.next();
		
		if (order.equalsIgnoreCase("yes")) {
			
			if ((firstName.compareTo(secondName) < 0) && (secondName.compareTo(thirdName) < 0)) {
		         System.out.println(thirdName);
		         System.out.println(secondName);
		         System.out.println(firstName);
		      }
			else if ((secondName.compareTo(firstName) < 0) && (firstName.compareTo(thirdName) < 0)) {
		         System.out.println(thirdName);
		         System.out.println(firstName);
		         System.out.println(secondName);
		      }
			else if (firstName.compareTo(secondName) > 0 && firstName.compareTo(thirdName) > 0 && thirdName.compareTo(secondName) < 0){
				 System.out.println(firstName);
			      System.out.println(secondName);
			      System.out.println(thirdName);
			
			 }
			else if ((secondName.compareTo(firstName) < 0) && (thirdName.compareTo(firstName) < 0)) {
		    	  System.out.println(firstName);
			      System.out.println(thirdName);
			      System.out.println(secondName);
		      }
			 else if ((secondName.compareTo(firstName) > 0) && (thirdName.compareTo(firstName) > 0) && (thirdName.compareTo(secondName) < 0)) {
		    	  System.out.println(secondName);
			      System.out.println(thirdName);
			      System.out.println(firstName);
		      }
			 else if ((firstName.compareTo(secondName) < 0) && (thirdName.compareTo(secondName) < 0) && (thirdName.compareTo(firstName) < 0)) {
		    	  System.out.println(secondName);
			      System.out.println(firstName);
			      System.out.println(thirdName);
		      }
		}
		else if (order.equalsIgnoreCase("no")) {
			
			if ((firstName.compareTo(secondName) < 0) && (secondName.compareTo(thirdName) < 0)) {
		         System.out.println(firstName);
		         System.out.println(secondName);
		         System.out.println(thirdName);
		      }
		      else if ((secondName.compareTo(firstName) < 0) && (firstName.compareTo(thirdName) < 0)) {
		         System.out.println(secondName);
		         System.out.println(firstName);
		         System.out.println(thirdName);
		      }
		      else if ((firstName.compareTo(secondName) > 0) && (secondName.compareTo(thirdName) > 0)) {
		    	  System.out.println(thirdName);
			      System.out.println(secondName);
			      System.out.println(firstName);
		      }
		      else if ((secondName.compareTo(firstName) < 0) && (thirdName.compareTo(firstName) < 0)) {
		    	  System.out.println(secondName);
			      System.out.println(thirdName);
			      System.out.println(firstName);
		      }
		      else if ((secondName.compareTo(firstName) > 0) && (thirdName.compareTo(firstName) > 0) && (thirdName.compareTo(secondName) < 0)) {
		    	  System.out.println(firstName);
			      System.out.println(thirdName);
			      System.out.println(secondName);
		      }
		      else if ((firstName.compareTo(secondName) < 0) && (thirdName.compareTo(secondName) < 0) && (thirdName.compareTo(firstName) < 0)) {
		    	  System.out.println(thirdName);
			      System.out.println(firstName);
			      System.out.println(secondName);
		      }
		}
		else {
			System.out.println("You answered neither yes nor No");
		}
		
		System.out.println("Done sorting and displaying");
	}
}
//output 1
/*
The program will ask for three first names
and the order in which they should be displayed
then the names will be displayed in the order requested
Enter the first name: andy
Enter the second name: james
Enter the third name: betty
Do you want the names in reverse alphabetical order? (Yes or No )
yes
james
betty
andy
Done sorting and displaying
*/
//output 2
/*
The program will ask for three first names
and the order in which they should be displayed
then the names will be displayed in the order requested
Enter the first name: Andy
Enter the second name: James
Enter the third name: Betty
Do you want the names in reverse alphabetical order? (Yes or No ) no
Andy
Betty
James
Done sorting and displaying
*/
//output 3
/*
The program will ask for three first names
and the order in which they should be displayed
then the names will be displayed in the order requested
Enter the first name: Andy
Enter the second name: James
Enter the third name: Betty
Do you want the names in reverse alphabetical order? (Yes or No ) what
You answered neither yes nor No
Done sorting and displaying
*/
