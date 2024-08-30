import java.util.Scanner;

public class labElementsInARangeArray {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] numList = new int [20];
		int i;
		
		int userIn = scnr.nextInt();// Read the number of integers in the list
		
		for (i = 0; i < userIn; ++i) {
			numList[i] = scnr.nextInt();// Read the integers into the array
		}
		
		int lowerB = scnr.nextInt();//gets lower bound integer
		int upperB = scnr.nextInt();//gets upper bound integer
		
		//outputs if the numList is greater than lower bound and if numList is less than upper bound
		for (i = 0; i < userIn; ++i) {
			if(numList[i] >= lowerB && numList[i] <= upperB) {
				System.out.print(numList[i] + ",");
				
			}
		}
		System.out.println();
   }
}
