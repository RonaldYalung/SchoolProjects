package Ch10program1;

//Inheritance Activity.  Circle is the superclass
//Program ID:  Circle.Java Circle Class declaration and implementation
//Author : Ronald Yalung
//Date : Nov 2009
//Brief Description:
//   This file contains the complete Circle class declaration and implementation. 
//   
//To be used with Tester.java and subclass Cylinder.java

public class Circle {
	
	protected double radius;
				

	//*************************************************************
	// This method is a constructor for the class.  Gets called
	// when a Circle object is created. Initializes all member variables
	//***************************************************************
	public Circle ()
	{
		radius = 0.0;
		
	}


	//****************************************************************
	// This method is a constructor for the class that accepts 1 argument
	// for radius.  Gets called
	// when a Circle object is created. Initializes all member variables
	//***************************************************************
	 public Circle(double radius)
	{
		this.radius = radius;
		
	}

	//*****************************************************************                     *
	// This method copies the argument passed into the parameter to *
	// the private member variable radius.                            *
	//*****************************************************************
	public void setRadius(double r)
	{   
		radius = r; 
	}
	 
	//*****************************************************************                    *
	// This method returns the value of the private member          *
	// variable radius.                                               *
	//*****************************************************************
	public double getRadius()
	{
		return radius; 
	}

	//*****************************************************************
	// This method calculates and returns the diameter of a circle
	// object.  It does not need any parameters because it already has                                          *
	// access to the member variable radius.                                                               *
	//*****************************************************************
	public double calculateDiameter()
	{   
		return radius * 2.0; 
	}


	//*****************************************************************
	// This method calculates and returns the circumference of a circle
	// object.  It does not need any parameters because it already has                                          *
	// access to the member variable radius.                                                               *
	//*****************************************************************
	public double calculateCircumference()
	{ 
		return radius * 2.0 * 3.1416; 
	}



	//*****************************************************************
	// This method calculates and returns the Circle object's area. *
	// It does not need any parameters because it already has access  *
	// to the member variable radius.                                 *
	//*****************************************************************
	public double calculateArea()
	{  
		return 3.1416 * Math.pow(radius, 2); 
	}

	//*****************************************************************
	// This methods displays all of the data associated with a Circle
	// object
	//*****************************************************************
	public String toString ()
	{
		// Output results
		
		String result = String.format("\nThe circle  data is\n" +
	            "        Radius: %.2f\n" +
	            "      Diameter: %.2f\n" +
	            " Circumference: %.2f\n" +
	            "          Area: %.2f",
	            radius,
	            calculateDiameter(),
	            calculateCircumference(),
	            calculateArea());
		
		return result;
	}
}
