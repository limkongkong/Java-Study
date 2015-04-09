import java.util.Scanner;
public class ComputeBMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pound: ");
		double weightPound = input.nextDouble();
		double weightKg = weightPound * 0.45359237;
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		double heightMeter = heightInches * 0.0254;
		double BMI = weightKg / Math.pow(heightMeter, 2);
		System.out.println("BMI is " + BMI);
	}
}