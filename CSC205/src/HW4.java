//Author: Ronald Yalung
/*Brief description: This program takes an array of 
 * integers and a target integer to search for. It 
 * scans the array, counts the occurrences of the 
 * target integer, allocates an array of the right 
 * size, and populates it with the indexes of matching 
 * entries.
 */
public class HW4 {

	public static int[] findMatchingIndexes(int[] arr, int target) {
        int count = 0;

        // Count the number of matches to determine the size of the result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // If no matches, return null
        if (count == 0) {
            return null;
        }

        // Allocate an array of the right size
        int[] resultArray = new int[count];
        int currentIndex = 0;

        // Scan the array again and populate the result array with matching indexes
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                resultArray[currentIndex++] = i;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] searchArray = {101, 103, 101, 104, 105, 101, 107};
        int targetValue = 101;

        int[] result = findMatchingIndexes(searchArray, targetValue);

        if (result != null) {
            for (int i : result) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No matches found.");
        }
    }
}

