//Program Name: Triangles.java
//Author: Ronald Yalung
//Class: CSC 110AB
//Date Written: 9/16/2023                                                                                                                   
//Brief Description: Asks the user for number inputs for each length side of a triangle. Outputs the perimeter of the triangle and what kind of triangle it is.
//					If one side of the triangle is a bigger number than the sum of the two other sides, the program will output "The side lengths provided cannot form a triangle.".
//Description of inputs: side1, side2, and side3 are int data types and takes in the user input. Perimeter is also a int data type and takes in the sum of all three sides.  

/*Description of outputs: 
System.out.print("Please enter the first side length: "); - "
System.out.print("Please enter the second side length: "); - asks for the input of the user for all three sides.
System.out.print("Please enter the third side length: "); - "

System.out.println("Perimeter: " + perimeter); - outputs the perimeter of the triangle.
System.out.println("This triangle is Equilateral."); - "
System.out.println("This triangle is Isoceles."); - outputs what kind of triangle it is.
System.out.println("This triangle is Scalene."); - "

System.out.println("The side lengths provided cannot form a triangle."); - outputs if one of the sides is greater than both sides.
System.out.println("Goodbye"); - outputs goodbye.
*/
import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int side1;
		int side2;
		int side3;
		int perimeter;
		
		System.out.print("Please enter the first side length: ");
		side1 = scnr.nextInt();
		System.out.print("Please enter the second side length: ");
		side2 = scnr.nextInt();
		System.out.print("Please enter the third side length: ");
		side3 = scnr.nextInt();
		
		if ((side1 + side2 > side3)&&(side1 + side3 > side2)&&(side2 + side3 > side1)) {
				
				perimeter = side1 + side2 + side3;
				System.out.println("Perimeter: " + perimeter);
				
			if ((side1 == side2)&&(side2 == side3)&&(side3 == side1)) {
				System.out.println("This triangle is Equilateral.");
			}
			else if ((side1 == side2)||(side2 == side3)||(side3 == side1)) {
				System.out.println("This triangle is Isoceles.");
			}
			else {
				System.out.println("This triangle is Scalene.");
			}	
		}
		else {
			System.out.println("The side lengths provided cannot form a triangle.");
		}
		
		System.out.println("Goodbye");
		
	}
}
//Output 1
/*
Please enter the first side length: 2
Please enter the second side length: 2
Please enter the third side length: 2
Perimeter: 6
This triangle is Equilateral.
Goodbye
 */
//Output2
/*
Please enter the first side length: 2
Please enter the second side length: 2
Please enter the third side length: 1
Perimeter: 5
This triangle is Isoceles.
Goodbye
 */
//Output3
/*
Please enter the first side length: 3
Please enter the second side length: 4
Please enter the third side length: 5
Perimeter: 12
This triangle is Scalene.
Goodbye
*/
//Output4
/*
Please enter the first side length: 1
Please enter the second side length: 3
Please enter the third side length: 5
The side lengths provided cannot form a triangle.
Goodbye
*/

