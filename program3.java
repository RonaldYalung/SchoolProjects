import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class ConsoleRecord {
    String _name;
    int _year;
    double _launchPrice;
    double _currentPrice;
}
public class program3 {
	private static final int MAX_RECORDS = 100;
    private static final ConsoleRecord[] consoleRecords = new ConsoleRecord[MAX_RECORDS];
    private static int numRecords = 0;
    
    public static void main(String[] args) {
        loadConsoleRecordFromFile("C:\\Users\\ronal\\OneDrive\\Desktop\\CSC110AB-fall2023\\CSC205\\datafile.txt");
        displayMenu();
    }
    
    private static void loadConsoleRecordFromFile(String fileName) {
    	try {
            try (Scanner fileScanner = new Scanner(new File(fileName))) {
                while (numRecords < MAX_RECORDS) {
                    String data = fileScanner.nextLine();
                    String[] parts = data.split(",");
                    ConsoleRecord consoleRecord = new ConsoleRecord();
                    consoleRecord._name = parts[0].trim();
                    consoleRecord._year = Integer.parseInt(parts[1].trim());
                    consoleRecord._launchPrice = Double.parseDouble(parts[2].replace("$", "").trim());
                    consoleRecord._currentPrice = Double.parseDouble(parts[3].replace("$", "").trim());

                    consoleRecords[numRecords] = consoleRecord;
                    numRecords++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            System.exit(1);
        }
    }
    
    private static void displayMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Display all information");
                System.out.println("2. Display a selected console record");
                System.out.println("3. Display average price depreciation per year");
                System.out.println("4. Display a histogram of the distribution of launch prices");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        displayAllConsoleRecords();
                        break;
                    case 2:
                        displaySelectedConsoleRecord();
                        break;
                    case 3:
                        displayAveragePriceDepreciationPerYear();
                        break;
                    case 4:
                        displayLaunchPricesHistogram();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (choice != 5);
        }
    }
    
    private static void displayAllConsoleRecords() {
        System.out.println("All console records:");
        for (int i = 0; i < numRecords; i++) {
            System.out.println("Name: " + consoleRecords[i]._name);
            System.out.println("Year: " + consoleRecords[i]._year);
            System.out.println("Launch Price: $" + consoleRecords[i]._launchPrice);
            System.out.println("Current Price: $" + consoleRecords[i]._currentPrice);
            System.out.println();
        }
    }

    private static void displaySelectedConsoleRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the console: ");
        String name = scanner.nextLine().trim();
        boolean found = false;
        for (int i = 0; i < numRecords; i++) {
            if (consoleRecords[i]._name.equalsIgnoreCase(name)) {
                System.out.println("Name: " + consoleRecords[i]._name);
                System.out.println("Year: " + consoleRecords[i]._year);
                System.out.println("Launch Price: $" + consoleRecords[i]._launchPrice);
                System.out.println("Current Price: $" + consoleRecords[i]._currentPrice);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No information found for the console: " + name);
        }
    }
    
    private static void displayAveragePriceDepreciationPerYear() {
        double totalDepreciation = 0;
        for (int i = 0; i < numRecords; i++) {
            totalDepreciation += consoleRecords[i]._launchPrice - consoleRecords[i]._currentPrice;
        }

        double averageDepreciation = totalDepreciation / numRecords;
        System.out.println("Average price depreciation per year: $" + averageDepreciation);
    }
    private static void displayLaunchPricesHistogram() {
    	int[] priceRanges = new int[10]; 
        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;

        for (int i = 0; i < numRecords; i++) {
            double price = consoleRecords[i]._currentPrice;
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        double rangeSize = (maxPrice - minPrice) / 10;

        for (int i = 0; i < numRecords; i++) {
            int rangeIndex = (int) ((consoleRecords[i]._currentPrice - minPrice) / rangeSize);
            priceRanges[rangeIndex]++;
        }

        System.out.println("Histogram of the distribution of current prices per console:");
        System.out.println("Price Range    |  Frequency");
        System.out.println("---------------------------");
        for (int i = 0; i < priceRanges.length; i++) {
            double startRange = minPrice + i * rangeSize;
            double endRange = minPrice + (i + 1) * rangeSize;
            System.out.printf("$%.2f - $%.2f |  ", startRange, endRange);
            for (int j = 0; j < priceRanges[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }