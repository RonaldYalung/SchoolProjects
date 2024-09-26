// Author: Ronald Yalung
import java.util.Scanner;

public class BinaryArithmeticCalculator {

    // Method to subtract two binary numbers represented as strings
    public static String subtractBinary(String a, String b) {
        // Normalize the lengths of the binary strings by padding with leading zeros
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        
        // Convert the second binary number to its two's complement
        String bComplement = twoComplement(b);

        // Add the first number and the two's complement of the second number
        String result = addBinary(a, bComplement);
        
        // If result is negative (detected by extra bit or two's complement), adjust it
        if (result.length() > maxLength) {
            result = result.substring(result.length() - maxLength);  // Trim overflow bits
        }
        
        // Check if the result is negative by checking the sign bit (leftmost bit)
        if (result.charAt(0) == '1') {
            // Result is negative, convert from two's complement to its negative form
            result = "-" + twoComplement(result);
        } else {
            // Result is positive, remove any leading zeros
            result = result.replaceFirst("^0+(?!$)", "");
        }

        return result;
    }

    // Method to get the two's complement of a binary number
    public static String twoComplement(String binary) {
        StringBuilder complement = new StringBuilder();

        // Step 1: Flip all the bits (1's complement)
        for (char bit : binary.toCharArray()) {
            complement.append(bit == '0' ? '1' : '0');
        }

        // Step 2: Add 1 to the result (2's complement)
        return addBinary(complement.toString(), "1");
    }

    // Method to add two binary numbers represented as strings
    public static String addBinary(String a, String b) {
        // Normalize the lengths of the binary strings by padding with leading zeros
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        
        StringBuilder result = new StringBuilder();  // To store the result of the addition
        int carry = 0;  // Initialize carry to zero
        
        // iterates through the binary strings from right to left (LSB to MSB)
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';  // Convert the character '0' or '1' to its integer equivalent
            int bitB = b.charAt(i) - '0';
            
            // Add the bits and the carry
            int sum = bitA + bitB + carry;
            carry = sum / 2;  // Carry will be 1 if sum is 2 or 3
            result.append(sum % 2);  // Append the result bit to the result string
        }
        
        // If there is a carry left, append it to the result
        if (carry == 1) {
            result.append(carry);
        }

        // The result is built in reverse order, so reverse it back
        return result.reverse().toString();
    }

    // Main method to get user input and perform subtraction
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BINARY ARITHMETIC CALCULATOR");
        System.out.println("Pick an operation: \n"
        					+ "1. Addition\n"
        					+ "2. Subtraction");
        System.out.print("Number: ");
        int op = scanner.nextInt();
        
        if (op == 1) {
        // Ask the user for the first binary number
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.next().trim();

        // Ask the user for the second binary number
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.next().trim();
        
        //perform the addition
        String sum = addBinary(binary1, binary2);
        
        System.out.println("sum = " + sum);
        }
        
        
        if (op == 2) {
            // Ask the user for the first binary number
            System.out.print("Enter the first binary number: ");
            String binary1 = scanner.next().trim();
            
            // Ask the user for the second binary number
            System.out.print("Enter the second binary number: ");
            String binary2 = scanner.next().trim();
            
            // Perform the subtraction
            String difference = subtractBinary(binary1, binary2);
            
         // Display the result
            System.out.println("Difference = " + difference);
            }
        
        scanner.close();
    }
}
