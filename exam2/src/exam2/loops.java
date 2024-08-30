/*What are loops used for? loops are used to execute a block of code more than once.
*/

package exam2;
import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		//TYPES OF LOOPS:
		//while loop
		int i = 1;
		while(i <= 5) {
			System.out.println("Hello (whille loop) " + i);
			i++;
		}
//-----------------------------------------------------------------------------------------------------------------
		//infinte loops
		/* int i = 1;
		 * while(i <= 5) {
		 * System.out.println("Hello " + i);
		 * }(there's no itertion)
		 */
//----------------------------------------------------------------------------------------------------------------
		//do while loop
		Scanner scnr = new Scanner(System.in);
		int n;
		do {
			System.out.println("enter a number between 1 and 10: ");
			n = scnr.nextInt();
		} while (n < 1 || n > 10);
		
		System.out.println(n + " is between 1 and 10.");
//-----------------------------------------------------------------------------------------------------------------
		//for loop
		/* for (variable; condition; change) {
		 * 		statement
		 * }
		 */
		for(int j = 1; j <= 5; j++) {
			System.out.println("Hello (for loop) " + j);
		}
		
	}

}
