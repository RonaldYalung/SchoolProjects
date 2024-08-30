import java.util.Scanner;
public class labSwappingVariables {

	 public static void swapValues(int[] values) {
	        // Check if the array has at least 4 elements
	        if (values.length >= 4) {
	            // Swap elements at indices 0 and 1
	            int temp = values[0];
	            values[0] = values[1];
	            values[1] = temp;

	            // Swap elements at indices 2 and 3
	            temp = values[2];
	            values[2] = values[3];
	            values[3] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);
	        int[] userList = new int[4]; // Create an array with 4 elements

	        // Read four integers from input and store them in the array
	        for (int i = 0; i < 4; i++) {
	            userList[i] = scnr.nextInt();
	        }

	        // Call the swapValues method to swap the values
	        swapValues(userList);

	        // Print the swapped values
	        for (int i = 0; i < 4; i++) {
	            System.out.print(userList[i]);
	            if (i < 3) {
	                System.out.print(" "); // Add space only if it's not the last element
	            }
	        }
	        System.out.println();
	    }

}
