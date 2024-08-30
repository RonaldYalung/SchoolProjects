import java.util.Scanner;

public class labIncrement5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int firstNum;
		int secondNum;
		
		firstNum = scnr.nextInt();
		secondNum = scnr.nextInt();
		
		for(i = firstNum; i <= secondNum; i = i + 5) {
				System.out.print(i + " ");
			}
		if (firstNum > secondNum){
			System.out.print("Second integer can't be less than the first.");
		}
		System.out.println();
	}

}


