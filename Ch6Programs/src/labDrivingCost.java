import java.util.Scanner;
public class labDrivingCost {

	public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
		double costToDrive = (milesDriven / milesPerGallon) * dollarsPerGallon;
		return costToDrive;
	}
	 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double carMPG = scnr.nextDouble();
	      double priceOfGas = scnr.nextDouble();
	      
	      System.out.printf("%.2f", drivingCost(carMPG, priceOfGas, 10));
	      System.out.print(" ");
	      System.out.printf("%.2f", drivingCost(carMPG, priceOfGas, 50));
	      System.out.print(" ");
	      System.out.printf("%.2f", drivingCost(carMPG, priceOfGas, 400));
	   }
}
