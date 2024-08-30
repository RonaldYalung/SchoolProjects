//Author: Ronald Yalung
/*Brief Description: This code is a water flow calculator that 
 * computes throughput and horsepower based on user-provided 
 * inputs for total head, pipe diameter, and water velocity.
 */
import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total head (ft): ");
        double h = scanner.nextDouble();
        System.out.print("Enter pipe diameter (in): ");
        double pd = scanner.nextDouble();
        System.out.print("Enter water velocity (ft/sec): ");
        double v = scanner.nextDouble();

        // Calculate results using the subprogram
        WaterResults results = calculateWaterFlow(h, pd, v);

        System.out.println("\nResults:");
        System.out.println("Throughput: " + results.throughput 
        								+ " gallons per minute");
        System.out.println("Horsepower: " + results.horsepower);
    }

	    // Record-like class to store the results
	   public static class WaterResults {
	        double throughput; // gallons per minute
	        double horsepower;
	    }

	   // Subprogram to compute throughput and horsepower
	      public static WaterResults calculateWaterFlow(double h, double pd, double v) {
	        WaterResults results = new WaterResults();

	        // Calculate throughput (gallons per minute)
	        results.throughput = 2.448 * Math.pow(pd, 2) * v;

	        // Calculate horsepower
	        results.horsepower = results.throughput * h;

	        return results;
	    }
	}

