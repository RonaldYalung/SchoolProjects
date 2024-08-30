import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      int valCount;
		      double inputValue;
		      double highestVal = 0.0;
		      int i;

		      valCount = scnr.nextInt();

		      for(i = valCount; i > 0; --i) {
		         inputValue = scnr.nextDouble();
		         System.out.println("Value read: " + inputValue);
		         if(inputValue > highestVal) {
		            highestVal = inputValue;
		         }
		      }
		      System.out.println("Highest: " + highestVal);
		   }
		
}
