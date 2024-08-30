//Program Name: PenniesForPay.java
//Author: Ronald Yalung
//Class: CSC 110AB
//Date Written:10/8/2023
/*Brief description: The program ask the user to input how many days did the employee work, then it will calculate the pay for each day and get the total of it.
					 It will prompt the user if they want to repeat another calculation by asking to input 'Y' or 'N'. If the user inputs a number that is not between 
					 the numbers 1 & 31, it will say an error message and ask you to repeat the number of days.
Description of inputs: "userDays" take in the number of days and "again" takes in a character 'Y' or 'N'.
*/
import java.util.Scanner;

public class PenniesForPay {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userDays;
		double pay;
		char again = 'Y';
		
		do {
		System.out.print("How many days did the employee work this month? ");
		userDays = scnr.nextInt();
		
		if(userDays >= 1 && userDays <= 31) {
			double total = 0.0;
			System.out.println("Day     pay");
			System.out.println("-------------");
			for(int i = 1; i <= userDays; ++i) {
			      
				pay = Math.pow(2, i - 1) / 100.0;
                System.out.printf("%2d      %.2f%n", i, pay);
                total += Math.pow(2, i - 1) / 100.0;
					}
				System.out.println("-------------");
				System.out.print("total   ");
				System.out.printf("$%.2f\n", total);
				
				System.out.println("Do you want to do it again: Enter Y for yes and N for no: ");
				again = scnr.next().charAt(0);
				}
		else {
			System.out.println("The number of days must be between 1 and 31.");
			System.out.println("Please re-enter the days worked.");
			}
		}while(again == 'Y');
		System.out.println("Goodbye!");
	}
}
//Example output1 1:
/*
How many days did the employee work this month? 3
Day     pay
-------------
 1      0.01
 2      0.02
 3      0.04
-------------
total   $0.07
Do you want to do it again: Enter Y for yes and N for no: 
Y
How many days did the employee work this month? 8
Day     pay
-------------
 1      0.01
 2      0.02
 3      0.04
 4      0.08
 5      0.16
 6      0.32
 7      0.64
 8      1.28
-------------
total   $2.55
Do you want to do it again: Enter Y for yes and N for no: 
N
Goodbye!
 */
//Example output 2:
/*
How many days did the employee work this month? -2
The number of days must be between 1 and 31.
Please re-enter the days worked.
How many days did the employee work this month? -3
The number of days must be between 1 and 31.
Please re-enter the days worked.
How many days did the employee work this month? 45
The number of days must be between 1 and 31.
Please re-enter the days worked.
How many days did the employee work this month? 2
Day     pay
-------------
 1      0.01
 2      0.02
-------------
total   $0.03
Do you want to do it again: Enter Y for yes and N for no: 
 */


