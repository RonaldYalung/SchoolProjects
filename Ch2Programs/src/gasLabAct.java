//2.27: LAB: Driving costs

import java.util.Scanner;

public class gasLabAct {
   public static void main(String[] args) {
	         Scanner scnr = new Scanner(System.in);
	         float carGasMileage;
	         float gasCost;
	         
	         carGasMileage = scnr.nextFloat();
	         
	         gasCost = scnr.nextFloat();
	         
	              
	         float mile20 = 20 * gasCost / carGasMileage;
	         float mile75 = 75 * gasCost / carGasMileage;
	         float mile500 = 500 * gasCost / carGasMileage;
	         
	         System.out.printf("%.2f", mile20);
	         System.out.print(" ");
	         System.out.printf("%.2f", mile75);
	         System.out.print(" ");
	         System.out.printf("%.2f", mile500);
	         System.out.println();
	         
	         
   }
}
