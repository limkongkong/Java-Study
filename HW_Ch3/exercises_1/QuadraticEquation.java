import java.util.Scanner;
public class QuadraticEquation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a, b, c: ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	
	double discriminant = b*b - 4*a*c;
	double r1 = (-b + Math.pow(discriminant, 0.5)) / 2*a;
	double r2 = (-b - Math.pow(discriminant, 0.5)) / 2*a;
	
	if (discriminant > 0)
		System.out.println("The roots are " + r1 + " and " + r2);
	if (discriminant ==0)
		System.out.println("The root is " + r1);
	if (discriminant < 0)
		System.out.println("The equation has no real roots");
	}
}