import java.util.Scanner;
public class LinearEquation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a, b, c, d, e, f: ");
	
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	double dinominator = a*d - b*c;
	double x = (e*d - b*f)/ dinominator;
	double y = (a*f - e*c)/ dinominator;
	
	if (dinominator == 0)
		System.out.println("The Equation has no solution");
	else
		System.out.println("x is " + x + " and " + "y is " + y);
	}
}