import java.util.Scanner;
public class CalculateInvestment{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
	    double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		double accumulatedValue = investmentAmount*Math.pow(1+monthlyInterestRate, years*12);
	System.out.println("Accumulated value is " + accumulatedValue);	
		
	}
}