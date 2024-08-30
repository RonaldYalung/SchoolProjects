//Program Name: GeometryCalculator.java
//Author: Ronald Yalung
//Class: CSC 110AB
//Date Written: 9/17/2023                                                                                                                   
//Brief Description: Asks user to choose from the menu (1-4), if output is beyond 4 it outputs a error message. For each choice on the menu it will asks for measurement inputs and will output the area or volume for those inputs. If one of the measurements are below negative it will output an error message. 
//Description of inputs: one, two, three, four, uChoice, r, area, l, w, b, h, take in user input and ouputs it and calculates it to out put the volume or area.
import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int one = 1;
		int two = 2;
		int three = 3;
		int four = 4;
		int uChoice;
		double r;
		double area;
		double l;
		double w;
		double b;
		double h;
		
		System.out.println(one + ". Calculate the area of a circle");
		System.out.println(two + ". Calculate the area of a rectangle");
		System.out.println(three + ". Calculate the area of a triangle");
		System.out.println(four + ". Calculate the volume of a cylinder");
		
		System.out.print("Enter your choice (1-4): ");
		uChoice = scnr.nextInt();
		
		switch(uChoice) {
			case 1:
				System.out.print("Enter circle's radius: ");
				r = scnr.nextDouble();
				if (r >= 0) {
					area = Math.PI * r * r;
					System.out.print("The area is ");
					System.out.printf("%.3f", area);
					System.out.println();
				}
				else {
					System.out.println("Only positive values are accepted for the radius");
				}
				break;
			case 2:
				System.out.print("Enter the rectangle's length: ");
				l = scnr.nextDouble();
				System.out.print("Enter the rectangle's width: ");
				w = scnr.nextDouble();
				if ((l >= 0)&&(w >= 0)) {
					area = w * l;
					System.out.print("The area is ");
					System.out.printf("%.3f", area);
					System.out.println();	
				}
				else {
					System.out.println("Only positive values are accepted for the length and width");
				}
				break;
			case 3:
				System.out.print("Enter the length of the base: ");
				b = scnr.nextDouble();
				System.out.print("Enter the triangle's height: ");
				h = scnr.nextDouble();
				if ((b >= 0)&&(h >= 0)) {
					area = 0.5 * b * h;
					System.out.print("The area is ");
					System.out.printf("%.3f", area);
					System.out.println();	
				}
				else {
					System.out.println("Only positive values are accepted for the base and height");
				}
				break;
			case 4:
				System.out.print("Enter the cylinder's radius: ");
				r = scnr.nextDouble();
				System.out.print("Enter the cylinder’s height: ");
				h = scnr.nextDouble();
				if ((r >= 0)&&(h >= 0)) {
					area = Math.PI * r * r * h;
					System.out.print("The area is ");
					System.out.printf("%.3f", area);
					System.out.println();	
				}
				else {
					System.out.println("Only positive values are accepted for the radius and height");
				}
				break;
				
			default:
				System.out.println("Invalid Choice. You may only enter 1, 2, 3, or 4");
		}
		
		System.out.println("Thanks for using the Geometry Calculator!");
	}
}
//output 1
/*
1. Calculate the area of a circle
2. Calculate the area of a rectangle
3. Calculate the area of a triangle
4. Calculate the volume of a cylinder
Enter your choice (1-4): 1
Enter circle's radius: 3.7
The area is 43.008
Thanks for using the Geometry Calculator! 
 */
//output 2
/*
1. Calculate the area of a circle
2. Calculate the area of a rectangle
3. Calculate the area of a triangle
4. Calculate the volume of a cylinder
Enter your choice (1-4): 2
Enter the rectangle's length: 3.5
Enter the rectangle's width: 2
The area is 7.000
Thanks for using the Geometry Calculator!
*/
//output 3
/*
1. Calculate the area of a circle
2. Calculate the area of a rectangle
3. Calculate the area of a triangle
4. Calculate the volume of a cylinder
Enter your choice (1-4): 3
Enter the length of the base: 2
Enter the triangle's height: 5
The area is 5.000
Thanks for using the Geometry Calculator!
*/
//output 4
/*
1. Calculate the area of a circle
2. Calculate the area of a rectangle
3. Calculate the area of a triangle
4. Calculate the volume of a cylinder
Enter your choice (1-4): 4
Enter the cylinder's radius: 3
Enter the cylinder’s height: 5
The area is 141.372
Thanks for using the Geometry Calculator!
*/
//output 5
/*
1. Calculate the area of a circle
2. Calculate the area of a rectangle
3. Calculate the area of a triangle
4. Calculate the volume of a cylinder
Enter your choice (1-4): 9
Invalid Choice. You may only enter 1, 2, 3, or 4
Thanks for using the Geometry Calculator!
*/
