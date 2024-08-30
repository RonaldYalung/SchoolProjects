import java.util.Scanner;

public class labSeasons {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputMonth;
	    int inputDay;
	
	    inputMonth = scnr.next();
	    inputDay = scnr.nextInt();
	    
	    if ((inputMonth.equals("March") && inputDay >= 20 && inputDay <= 31)) {
	    	System.out.println("Spring");
	    }
	    else if ((inputMonth.equals("April") && inputDay > 0 && inputDay <= 30)) {
	    	System.out.println("Spring");
	    }
	    else if ((inputMonth.equals("May") && inputDay > 0 && inputDay <= 31)) {
	    	System.out.println("Spring");
	    }
	    else if ((inputMonth.equals("June") && inputDay > 0 && inputDay <= 20)) {
	    	System.out.println("Spring");
	    }
	    else if ((inputMonth.equals("June") && inputDay > 20 && inputDay <= 30)) {
	    	System.out.println("Summer");
	    }
	    else if ((inputMonth.equals("July") && inputDay > 0 && inputDay <= 31)) {
	    	System.out.println("Summer");
	    }
	    else if ((inputMonth.equals("August") && inputDay > 0 && inputDay <= 31)) {
	    	System.out.println("Summer");
	    }
	    else if ((inputMonth.equals("September") && inputDay > 0 && inputDay <= 21)) {
	    	System.out.println("Summer");
	    }
	    else if ((inputMonth.equals("September") && inputDay > 21 && inputDay <= 30)) {
	    	System.out.println("Autumn");
	    }
	    else if ((inputMonth.equals("October") && inputDay > 0 && inputDay <= 31)) {
	    	System.out.println("Autumn");
	    }
	    else if ((inputMonth.equals("November") && inputDay > 0 && inputDay <= 30)) {
	    	System.out.println("Autumn");
	    }
	    else if ((inputMonth.equals("December") && inputDay > 0 && inputDay <= 20)) {
	    	System.out.println("Autumn");
	    }
	    else if ((inputMonth.equals("December") && inputDay > 20 && inputDay <= 31)) {
	    	System.out.println("Winter");
	    }
	    else if ((inputMonth.equals("January") && inputDay > 0 && inputDay <= 31)) {
	    	System.out.println("Winter");
	    }
	    else if ((inputMonth.equals("February") && inputDay > 0 && inputDay <= 29)) {
	    	System.out.println("Winter");
	    }
	    else if ((inputMonth.equals("March") && inputDay > 0 && inputDay <= 19)) {
	    	System.out.println("Winter");
	    }
	    else {
	    	System.out.println("Invalid");
	    }
	
	}
}