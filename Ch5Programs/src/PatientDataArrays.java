import java.util.Scanner;

public class PatientDataArrays {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numVals; 
      int i;
      
      numVals = scnr.nextInt();
      int[] patientNums = new int[numVals];
      
		for (i = 0; i < patientNums.length; ++i) {
			patientNums[i] = scnr.nextInt();
		}
		System.out.print("Array contents in reverse: ");

      for (i = patientNums.length - 1; i >= 0; --i) {
         System.out.print(patientNums[i] + " ");
      }
         System.out.println();
   }
}