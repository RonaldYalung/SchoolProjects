/**
 * Author: Ronald Yalung
 *Program ID:  Person.java
 *Date : 11/4/2023
 *Brief Description:
         initializes all variables, get the first name and second name, gets the birth year of both people and calculates age and returns it all.
 *
 */
public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
		name = "unknown";
		birthYear = 0;
	}
	
	public Person(String pName, int bYear) {
		name = pName;
		birthYear = bYear;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public void setBirthYear(int aBirthYear) {
		birthYear = aBirthYear;
	}
	
	public int calculateAge(int currentYr) {
		int age = currentYr - birthYear;
		return age;
	}
	
	public String toString() {
		return "Name: " + name + "\nBirth Year: " + birthYear;
	}
	
}

//output
/*
Enter the current year: 
2022

Person # 1
Enter a name please: Minnie Mouse
Enter a birth year : 1928

The state of person1:
Name: Minnie Mouse
Birth Year: 1928
	age: 94

Person # 2
Enter a name please: Mickey Mouse
Enter a birth year : 1928

The state of person2:
Name: Mickey Mouse
Birth Year: 1928
	age: 94
The name of person1: Minnie Mouse
The name of person2: Mickey Mouse
*/