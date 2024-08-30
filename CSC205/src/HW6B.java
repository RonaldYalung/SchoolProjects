//Author: Ronald Yalung
/*Brief Description: this program scans a given array of these 
 * records, given the number of dogs, and computes and returns
 *  the number of those dogs over a given age.
 */
public class HW6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Dog { 
		public String name; 
		public int age; 
		public double weight; 
		}
	
	public static int numOfDogs (Dog[] dogs, int numberOfDogs, int targetAge) {
        int count = 0;
        for (int i = 0; i <= numberOfDogs; i++) {
            if (dogs[i].age > targetAge) {
                count++;
            }
        }
        return count;
    }
	
}
