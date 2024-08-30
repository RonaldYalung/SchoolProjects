import java.util.Scanner;

public class labNumbersReverseArray {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int[] userList = new int[20];   // List of numElement integers specified by the user
	      int numElements;                // Number of integers in user's list
	      int i;// Add more variables as needed
	      int tempVal;  

	      numElements = scnr.nextInt();   // Input begins with number of integers that follow
	      userList = new int[numElements];
	      
	      
	      for (i = 0; i < userList.length; ++i) {
	    	   userList[i] = scnr.nextInt();
	    	}
	      for (i = 0; i < (userList.length / 2); ++i) {
	    	   tempVal = userList[i];                        // Temp for swap
	    	   userList[i] = userList[userList.length - 1 - i]; // First part of swap
	    	   userList[userList.length - 1 - i] = tempVal;     // Swap complete
	    	}
	      
	      for (i = 0; i < userList.length; ++i) {
	         System.out.print(userList[i] + ",");
	      }
	      System.out.println();
	   }
}