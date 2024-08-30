import java.util.Scanner;

public class labNameFormat {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName;
		String middleName;
		String lastName;
		String name;
		
		name = scnr.nextLine(); // .nextLine gets all remaining text on the current input line, up to the next newline character.
		
		
		int firstSpace = name.indexOf(" "); //gets the whitespace in the line and returns the index.
		firstName = name.substring(0, firstSpace); //returns the string from the first letter all the way to the occurrence of the first space.
		
		int secondSpace = name.indexOf(" ", firstSpace + 1); // indexOf returns the index of the first instance of the space to the position of the firstSpace + 1.
		
		if (secondSpace < 0) {
			lastName = name.substring(firstSpace + 1); // substring returns the string from a specified start of index to end of index.
			System.out.println(lastName + ", " + firstName.charAt(0) + ".");
		}
		else {
			middleName = name.substring(firstSpace, secondSpace);
			lastName = name .substring(secondSpace + 1);
			System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(1) + ".");
		}
		
		
	}
}
