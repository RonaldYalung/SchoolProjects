import java.util.Scanner;

public class OddIntegers 
{
   public static void main(String [] args) 
   {
      Scanner scnr = new Scanner(System.in);
      int numVals;
      boolean allOdd = false;
      
      numVals = scnr.nextInt();
      
      for (int i = 0; i <= numVals; i++)
      {
    	  if ((numVals % 2) != 0)
    		  allOdd = true;
      }
      if (allOdd) {
          System.out.println("All match");
       }
       else {
          System.out.println("Not all match");
   }
}
}