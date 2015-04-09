import java.util.Scanner;
public class ComputeLoan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter annual interest rate, e.g., 7.25% ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("enter number of years as an integer, e.g., 5: ");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = loanAmount * monthlyPaymentRate/ (1-1/Math.pow(1+monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("the monthly payment is $" + (int)(monthlyPayment * 100)/100.0);
		System.out.println("the total payment is $" + (int)(totalPayment * 100)/100.0);
		
		
	}
}