import java.util.Scanner;

public class labUsingSentinel {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x;
		double avg;
		int max;
		int xSum;
		int xValues;
		
		xSum = 0;
		xValues = 0;
		max = xValues;
		
		x = scnr.nextInt();
		
		while (x >= 0) { // Get values until 0 (or less)
			xSum = xSum + x;
			xValues = xValues + 1;
			 if (x > max) {
	                max = x; // Update max if a larger number is encountered
	            }
			 if (xValues > max) { //gets max value
		            max = xValues;
		         }
	         x = scnr.nextInt();
	      }
		
            avg = (double) xSum / xValues;
            System.out.printf("%d %.2f\n", max, avg);

	}

}
