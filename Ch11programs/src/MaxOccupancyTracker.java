import java.util.Scanner;
import java.util.InputMismatchException;

public class MaxOccupancyTracker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxNumPeople = 10;
        int totalNumPeople = 0;

        while (totalNumPeople < maxNumPeople) {
        try {
                totalNumPeople += scnr.nextInt();
            System.out.println("Occupancy: " + totalNumPeople);
        } catch (InputMismatchException e) {
            scnr.next();
        }
            System.out.println("We're full!");
    
    }
    }
    }
