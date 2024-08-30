import java.util.Scanner;

public class LabRGB {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

	        // Input values for red, green, and blue
	        int red = scnr.nextInt();
	        int green = scnr.nextInt();
	        int blue = scnr.nextInt();

	        // Find the smallest value among red, green, and blue
	        int min = Math.min(Math.min(red, green), blue);

	        // Subtract the smallest value from all three to remove the gray
	        red -= min;
	        green -= min;
	        blue -= min;

	        // Print the resulting values
	        System.out.println(red + " " + green + " " + blue);
		
		
	}
}
