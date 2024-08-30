import java.util.Scanner;
public class labMaxNum {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int xValue;
		int maxNumber;
		
		xValue = scnr.nextInt();
	      maxNumber = xValue;

	      while (xValue >= 0) {
	         if (xValue > maxNumber) {
	            maxNumber = xValue;
	         }

	         xValue = scnr.nextInt();
	      }
	      System.out.println(maxNumber);
	}

}
