import java.util.Scanner;
public class temperature{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed in miles per hour: ");
		double speed = input.nextDouble();
		double temperatureWC = 35.74 + 0.6215* temperature - 35.75* Math.pow(speed, 0.16) + 0.4275*temperature*Math.pow(speed,0.16);
		System.out.println("The wind chill index is " + temperatureWC);
	}
}