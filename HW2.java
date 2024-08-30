import java.util.Scanner;

public class HW2 {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius;
		double totalVolume = 0;
		int n = 0;
		
		System.out.println("Please enter the number of spheres: ");
		n = scnr.nextInt();
			
		for(int i = 1; i <= n; i++) {
			System.out.println("Please enter the radius for sphere " + i + ": ");
			radius = scnr.nextDouble(); 
			while (radius <= 0) {
				System.out.println("Please enter a positive number for the radius.");
				radius = scnr.nextDouble(); 
			}
				totalVolume += (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		}
		
		System.out.println("Total Volume: " + totalVolume);
		
		
	}

}
