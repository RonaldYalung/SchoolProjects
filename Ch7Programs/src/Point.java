/**
 * Author: Ronald Yalung
 *Program ID:  Point.java
 *Date : 11/12/2023
 *Brief Description:
         represents a location in the Cartesian plane.
 *
 */
public class Point {

	private double x;
	private double y;
	private static int numPoints;
	
	public Point() {
		x = 0.0;
		y = 0.0;
		++numPoints;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		++numPoints;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public static int getNumPoints() {
		return numPoints;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void shiftX(double x) {
		this.x += x;
	}
	public void shiftY(double y) {
		this.y += y;
	}
	
	public String toString() {
		return String.format("(%.3f, %.3f)", x, y);
	}
}
