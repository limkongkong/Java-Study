import java.util.Scanner;
public class SumDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		double number = input.nextDouble();
		int sumDigit = (int)number %10 + (int)number/10 %10 + (int)number /100;
        System.out.println("The sum of the digit is " + sumDigit);		
		}
	}
