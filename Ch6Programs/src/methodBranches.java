import java.util.Scanner;
public class methodBranches {

	   public static int findMenuCost(int menuNum, int numOfPeople) {
	      int menuCost = 0;
	      
	      if (numOfPeople <= 50) {
	         if (menuNum == 1) {
	            menuCost = 55;
	         }
	         else if (menuNum == 2) {
	            menuCost = 75;
	         }
	         else if (menuNum == 3) {
	            menuCost = 85;
	         }
	      }
	      else if (numOfPeople > 50 && numOfPeople <= 140) {
	         if (menuNum == 1) {
	            menuCost = 35;
	         }
	         else if (menuNum == 2) {
	            menuCost = 35;
	         }
	         else if (menuNum == 3) {
	            menuCost = 50;
	         }
	      }
	      else if (numOfPeople >= 140) {
	         if (menuNum == 1) {
	            menuCost = 30;
	         }
	         else if (menuNum == 2) {
	            menuCost = 30;
	         }
	         else if (menuNum == 3) {
	            menuCost = 25;
	         }
	      }
	      else {
	         menuCost = 145;
	      }
	      return menuCost;
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int menuNumber;
	      int guestsNum;

	      menuNumber = scnr.nextInt();
	      guestsNum = scnr.nextInt();
	   
	      System.out.println(findMenuCost(menuNumber, guestsNum));
	   }
	}

