import java.util.Scanner;
public class NumberOfYear{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of minutes: ");
	long totalMinutes = input.nextLong();
	
	long totalHour = totalMinutes / 60;
	long totalDay = totalHour / 24;
	long totalYear = totalDay / 365;
	
	System.out.println(totalMinutes + " minutes is approximately " + totalYear + " and " + totalDay);
	
	}
	
}