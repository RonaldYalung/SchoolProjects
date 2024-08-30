package ch10program1;
/**
 * 
 * @author: Ronald Yalung
 * Description:
 *
 */
//Cylinder class declaration.  Inherits from Circle. 
//See the Diagram in the activity to write the code for this class

public class Cylinder extends Circle {
	
		//declare instance variables here
			private double length;
		//Implements methods here
	public Cylinder() {
		length = 0.0;
		radius = 0.0;
	}
	public Cylinder(double radius, double length) {
		length = length;
		radius = radius;
	}
	public void setLength(double length) {
		length = length;
	}
	public double getLength() {
		return length;
	}
	public double calculateVolume() {
		volume = Math.PI * radius * radius * length;
		return volume;
	}
	public String toString() {
		return "Length: " + length + "\nVolume: " + volume;
	}
	


}
