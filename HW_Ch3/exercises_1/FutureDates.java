import java.util.Scanner;
public class FutureDates{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter today's day: ");
	int today = input.nextInt();
	System.out.print("Enter the number of days elapsed since today: ");
	int dayElapsed = input.nextInt();
	
	int futureDay = (today + dayElapsed) % 7;
	String a="";
	String b="";
	switch(today){
		case 0: a="Sunday"; break;
		case 1: a="Monday"; break;
		case 2: a="Tuesday"; break;
		case 3: a="Wednesday"; break;
		case 4: a="Thursday"; break;
		case 5: a="Friday"; break;
		case 6: a="Saturday"; 
	}
	
	switch(futureDay){
		case 0: b="Sunday"; break;
		case 1: b="Monday"; break;
		case 2: b="Tuesday"; break;
		case 3: b="Wednesday"; break;
		case 4: b="Thursday"; break;
		case 5: b="Friday"; break;
		case 6: b="Saturday"; 	
	}
	
	System.out.println("Today is " + a + " and " + "the future day is " + b);
	}
}