import java.util.Scanner;

public class simpleStatisticsLab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      int product;
      int average;
      int totalAverage;
      double dProduct;
      double dtAverage;
      double dAverage;
     
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      product = num1 * num2 * num3 * num4;
      average = num1 + num2 + num3 + num4;
      totalAverage = average / 4;
      dProduct = (double) product;
      dAverage = (double) average;
      dtAverage = (double) dAverage;
      
      System.out.print(product + " "); 
      System.out.println(totalAverage);
      System.out.print(dProduct + " "); 
      System.out.println(dtAverage);
      
      //System.out.printf("%.3f", dProduct); 
      //System.out.print(" ");
      //System.out.printf("%.3f", dAverage);
      //System.out.println();
   
   }
}
