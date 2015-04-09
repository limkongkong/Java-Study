import java.util.Scanner;
public class CompoundValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		
		double monthlyInterestRate = 0.05/12;
		double accountValue = savingAmount * Math.pow(1+ monthlyInterestRate, 0.5*12);
		System.out.println("After the sixth month, the account value is " + accountValue);
	}
}