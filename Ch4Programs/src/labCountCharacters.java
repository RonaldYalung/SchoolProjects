import java.util.Scanner;

public class labCountCharacters {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char c;
		String userIn;
		int i;
		int j = 0;
		
		c = scnr.next().charAt(0);
		userIn = scnr.nextLine();
		
		for(i = 0; i < userIn.length(); ++i) {
			if(userIn.charAt(i) == c) {
				j++;
			}
		}
		if (j == 1) {
			System.out.println(j + " " + c);
			
		}
		else {
			System.out.println(j + " " + c + "'s");
		}
		
	}

}
