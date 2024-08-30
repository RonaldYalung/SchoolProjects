import java.util.Scanner;
public class labTraingleArea {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	      
	      Triangle triangle1 = new Triangle();
	      Triangle triangle2 = new Triangle();

	      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
	      double inputBase = scnr.nextDouble();
	      double inputHeight = scnr.nextDouble();
	      
	      triangle1.setBase(inputBase);
	      triangle1.setHeight(inputHeight);
	      
	      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
	      double inputBase2 = scnr.nextDouble();
	      double inputHeight2 = scnr.nextDouble();
	      triangle2.setBase(inputBase2);
	      triangle2.setHeight(inputHeight2);
	      
	      
	      System.out.println("Triangle with smaller area:");
	  
	      	if (triangle1.getArea() < triangle2.getArea()) {
	      		triangle1.printInfo();
	      	}
	      	else if (triangle1.getArea() > triangle2.getArea()) {
	      		triangle2.printInfo();
	      	}
	   
	      
	}

}
