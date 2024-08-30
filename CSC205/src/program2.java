//Author: Ronald Yalung
/*Brief description: This program predicts bank account growth 
 * with compounded interest and a bonus plan. Users input the base 
 * bonus, threshold, initial balance, interest rate, and investment
 * duration. The program calculates the final balance, optionally 
 * displays a period-by-period table, and offers the choice to 
 * perform another calculation or exit.
 */
import java.util.Scanner;

public class program2 {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double baseBonus;
        double threshold;
        double initialAccBalance;
        double annualInterestRate;
        int lengthOfInvestment;
        char again = 'Y';
        String errorMessage;

        do {
            System.out.println("COMPOUND INTEREST CALCULATOR");
            System.out.print("Please specify the bank's base bonus: $");
            baseBonus = getNonNegativeDoubleInput(scnr, "Please enter a positive bank base bonus: $");

            System.out.print("Please specify the threshold: $");
            threshold = getNonNegativeDoubleInput(scnr, "Please enter a positive threshold: $");

            System.out.print("Please specify the initial account balance: $");
            initialAccBalance = getNonNegativeDoubleInput(scnr, "Please enter a positive account balance: $");

            System.out.print("Annual interest rate (0%-100%): %");
            annualInterestRate = getNonNegativeDoubleInput(scnr, "Please enter a positive interest rate(0%-100%): %");

            System.out.print("Specify the length of the investment (in years): ");
            lengthOfInvestment = getNonNegativeIntegerInput(scnr, "Please enter a positive number of years: ");

            computeBalance(baseBonus, threshold, initialAccBalance, annualInterestRate, lengthOfInvestment);

            System.out.println("Do you want to do another calculation (Y or N)?");
            again = scnr.next().charAt(0);
        } while (again == 'Y');

        System.out.println("Thank you for using the compounding interest calculator!");
    }

    public static double computeBalance(double baseBonus, double threshold, double initialBalance,
                                        double annualInterestRate, int years) {
        double balance = initialBalance;
        for (int i = 1; i <= years; i++) {
            double interest = balance * annualInterestRate / 100;
            balance += interest;
            if (balance > threshold && balance <= threshold * 10) {
                balance += baseBonus;
            } else if (balance > threshold * 10 && balance <= threshold * 100) {
                balance += 10 * baseBonus;
            } else if (balance > threshold * 100) {
                balance += 100 * baseBonus;
            }
            System.out.printf("Year %d: Balance $%.2f\n", i, balance);
        }
        return balance;
    }

    public static double getNonNegativeDoubleInput(Scanner scnr, String errorMessage) {
        double input;
        do {
            while (!scnr.hasNextDouble()) {
                System.out.println(errorMessage);
                scnr.next(); // discard invalid input
            }
            input = scnr.nextDouble();
        } while (input < 0);
        return input;
    }

    public static int getNonNegativeIntegerInput(Scanner scnr, String errorMessage) {
        int input;
        do {
            while (!scnr.hasNextInt()) {
                System.out.println(errorMessage);
                scnr.next(); // discard invalid input
            }
            input = scnr.nextInt();
        } while (input < 0);
        return input;
    }
}
	


