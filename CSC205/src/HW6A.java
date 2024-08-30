//Author: Ronald Yalung
/*Brief Description: This code has four properties
 * which are name, company, price and year. It defines
 *  a record data type for an object, with
 *  one field for each property. It also defines a 
 *  variable of this type and assign the fields
 *  of that variable sample values. 
 */
public class HW6A {

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		
		car.name = "Mustang";
		car.company = "Ford";
		car.price = 475000;
		car.year = 1969;
	}
	
	static class Vehicle {
		public String name;
		public String company;
		public double price;
		public int year;
	}
}
