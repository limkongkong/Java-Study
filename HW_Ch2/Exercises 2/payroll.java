import java.util.Scanner;
public class payroll{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hour = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = hour * payRate;
		double federalWithholding = grossPay*federalTaxRate/100;
		double stateWithholding = grossPay*stateTaxRate/100;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = grossPay-totalDeduction;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hour);
		System.out.println("pay Rate: " + payRate);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deduction: "+"\n Federal Withholding: " + federalWithholding +"\n State Withholding: " +stateWithholding+"\n Total Deduction: "+ totalDeduction + "\n Net Pay: " + netPay);
	}
}