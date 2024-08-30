package Ch10program1;

//Program ID: Tester.java
//Author : Ronald Yalung
//Date : Nov 2009
//Brief Description:
//   this is to test Circle and Cylinder classes.


public class Tester {
	
	public static void main (String arg []) {
		
	    // Define a Circle object.  Calls the default constructor. 
		Circle circle = new Circle();
		
		System.out.println(circle.toString());
		System.out.println("CIRCLE1");
		System.out.println("-------");
		//set the radius of Circle object to 1.0
		circle.setRadius(1.0);
		
		//Call Circle object's toString and display information
		System.out.println(circle.toString());
		System.out.println("CYLINDER1");
		System.out.println("---------");
		//Define a Cylinder object. use overloaded constructor radius is assigned to 14, length to 25  
		circle.setRadius(0.0);
		System.out.println(circle.toString());
		Cylinder cylinder = new Cylinder(14, 25);
		System.out.println(cylinder.toString());
		//other code to show Cylinder object cylinder1 invoking different methods
		Cylinder cylinder1 = new Cylinder(5, 10);
		
		//code to show Cylinder object invoking toString method. 
		System.out.println("CYLINDER2");
		System.out.println("---------");
		circle.setRadius(5);
		System.out.println(circle.toString());
		System.out.println(cylinder1.toString());
	}

}
