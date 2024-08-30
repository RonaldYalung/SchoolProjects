import java.util.Scanner;

public class IntegerData {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int inputCount;
      boolean allValid = true;
      
      inputCount = scnr.nextInt();
   
      for(int i = 0; i < inputCount; ++i) {
         if(inputCount < 90 && inputCount > 100) {
            allValid = false;
         }
         else if(inputCount > 90 && inputCount < 100) {
        	 allValid = true;
         }
      }

      if (allValid) {
         System.out.println("All valid value(s)");
      }
      else {
         System.out.println("At least one mismatch");   
      }
   }
}