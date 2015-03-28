// use the Scanner class for console input

import java.util.Scanner; //scanner is in the java.util package
public class ConsoleInput{
	public static void main (String[] args){	
	Scanner input = new Scanner(System.in); //create a scanner object
	System.out.print("Enter a number for radius: ");
	double radius = input.nextDouble();
	double area = radius * radius * 3.14159;
	System.out.println("The area for the circle of radius " + radius + "is" + area);
	}
}