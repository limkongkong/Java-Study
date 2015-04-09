import java.util.Scanner;
public class CurrentTime{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    System.out.print("Enter the time zone offset to GMT: ");
	long timeZone = input.nextLong();
	
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24 + timeZone;
	
	if (currentHour<0){
			System.out.println("The current time is " + (currentHour +24) + ":" + currentMinute + ":" + currentSecond + "GMT");	
		}
		else{System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
			
		}
	}
}