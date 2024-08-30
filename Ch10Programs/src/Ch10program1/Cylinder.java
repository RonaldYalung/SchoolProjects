package Ch10program1;

/**
 * //Program ID:  Cylinder.Java Circle Class declaration and implementation
 * @author: Ronald Yalung
 * date: dec 2023
 * Description: Cylinders have the attributes and behaviors of a Circle with some additions, which are the length and the volume
 * 				this program does that.
 *
 */
//Cylinder class declaration.  Inherits from Circle. 
//See the Diagram in the activity to write the code for this class

public class Cylinder extends Circle {
	
		//declare instance variables here
			private double length;
		//Implements methods here
	public Cylinder() {
		super();
		this.length = 0.0;
	}
	public Cylinder(double radius, double length) {
		super(radius);
		this.length = length;
		
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public double calculateVolume() {
		double volume = super.calculateArea() * length;
		return volume;
	}
	public String toString() {
		String result = String.format("\nThe cylinder data is\n" + "        Length: %.2f" + "\n        Volume: %.2f", 
				length, calculateVolume());
		return result;
	}
	


}
