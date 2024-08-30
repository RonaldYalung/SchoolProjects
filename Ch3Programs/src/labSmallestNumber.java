import java.util.Scanner;

public class labSmallestNumber {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int num1;
	      int num2;
	      int num3;
	      
	      num1 = scnr.nextInt();
	      num2 = scnr.nextInt();
	      num3 = scnr.nextInt();
	      
	      if (num1 <= num2 && num1 <= num3) {
	    	  System.out.println(num1);
	      }
	      else if (num2 <= num1 && num2 <= num3) {
	    	  System.out.println(num2);
	      }
	      else {
	    	  System.out.println(num3);
	      }
	      
  }
}