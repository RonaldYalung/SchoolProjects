
import java.util.Scanner;

/**
 * Author: Ronald Yalung
 *Program ID:  PersonTester.java
 *Date : 11/4/2023
 *Brief Description:
         Tester program that test Person object and its methods
         Person class definition can be found in Person.java
 *
 */


public class PersonTester {

	public static void main(String[] args) {
		
		String pName;
		int pBirthYear;
		int currentYear;
        int count = 1;
        
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);


		System.out.println( "Enter the current year: ");
		currentYear = scan.nextInt();
		scan.nextLine(); //reads the dangling newline 
		
		    // Input for first Person Object
			System.out.println( "\nPerson # 1" );
			System.out.print( "Enter a name please: ");
			pName = scan.nextLine(); //allows you to enter multiple words 
			
			System.out.print( "Enter a birth year : ");
			pBirthYear = scan.nextInt();
			scan.nextLine(); //reads the dangling newline character
			
			//create a Person1 object
			Person person1 = new Person(pName, pBirthYear); 
			
			System.out.println( "\nThe state of person1:" );
			//calling toString to display the sate of the person1 object
			System.out.println(person1.toString()); 
			System.out.println("\tage: " + person1.calculateAge(currentYear));
			
           //Inputs needed to create second person object
			System.out.println( "\nPerson # 2");
			System.out.print( "Enter a name please: ");
			pName = scan.nextLine(); //allows you to enter multiple words 
			
			System.out.print( "Enter a birth year : ");
			pBirthYear = scan.nextInt();
			//create another Person object 
			Person person2 = new Person(pName, pBirthYear); 
			System.out.println( "\nThe state of person2:" );
			//calling toString to display the sate of the person2 object
			System.out.println(person2.toString());
			System.out.println("\tage: " + person2.calculateAge(currentYear));
		    //Just displaying the names of the objects
			System.out.println("The name of person1: " + person1.getName());
			System.out.println("The name of person2: " + person2.getName());
			
	}

}
