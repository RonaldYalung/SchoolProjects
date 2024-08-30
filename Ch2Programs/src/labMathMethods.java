import java.util.Scanner;

public class labMathMethods {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double x;
	      double y;
	      double z;
	      double a;
	      double b;
	      double c;
	      double d;
	      
	      x = scnr.nextDouble();
	      y = scnr.nextDouble();
	      z = scnr.nextDouble();
	      
	      a = Math.pow(x , z);
	      b = Math.pow(x, Math.pow(y, z));
	      c = Math.abs(y);
	      d = Math.sqrt(Math.pow(x * y, z));
	      
	      System.out.println(a + " " + b + " " + c + " " + d);
	      
	   }
	}


