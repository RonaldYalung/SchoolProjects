import java.util.Scanner; 

public class labBelowAmtArray{

	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int[] userValues = new int[20];   // List of integers from input
	      int numIntegers = scnr.nextInt(); // Read the number of integers in the list
	      
	      for (int i = 0; i < numIntegers; i++) {
	         userValues[i] = scnr.nextInt(); // Read the integers into the array
	      }
	      
	      int threshold = scnr.nextInt(); // Read the threshold value
	      
	      // Output integers less than or equal to the threshold value
	      for (int i = 0; i < numIntegers; i++) {
	         if (userValues[i] <= threshold) {
	            System.out.print(userValues[i]);
	            if (i < numIntegers) {
	               System.out.print(",");
	            }
	      }
	         System.out.println();
	   }
	}
}

