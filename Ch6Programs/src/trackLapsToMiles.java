import java.util.Scanner;

public class trackLapsToMiles {
	   
	   public static double lapsToMiles(double userLaps) {
		   final double oneLap = 0.25;
		   double numOfMiles = userLaps * oneLap;
		   return numOfMiles;
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double numOfLaps = scnr.nextDouble();
	      
	      System.out.printf("%.2f\n", lapsToMiles(numOfLaps));
	   }
	}

