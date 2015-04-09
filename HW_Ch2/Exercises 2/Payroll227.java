import javax.swing.JOptionPane;
public class Payroll227{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog(
		"Enter employee's name: ");
		
		String hourString = JOptionPane.showInputDialog(
		"Enter number of hours worked in a week: ");
		double hour =  Double.parseDouble(hourString);
		
		String payRateString = JOptionPane.showInputDialog(
		"Enter hourly pay rate: ");
		double payRate = Double.parseDouble(payRateString);
		
		String federalTaxRateString = JOptionPane.showInputDialog(
		"Enter federal tax withholding rate: ");
		double federalTaxRate = Double.parseDouble(federalTaxRateString);
		
		String stateTaxRateString = JOptionPane.showInputDialog(
		"Enter state tax withholding rate: ");
		double stateTaxRate = Double.parseDouble(stateTaxRateString);
		
		double grossPay = hour * payRate;
		double federalWithholding = grossPay * federalTaxRate/100;
		double stateWithholding = grossPay * stateTaxRate/100;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = grossPay-totalDeduction;
		
		String output = "Employee Name: " + name +
         		      "\n Hours worked: " + hour + 
					  "\n pay Rate: " + payRate + 
					  "\n Gross pay: " + grossPay + 
					  "\n Deduction: " + 
					  "\n Federal Withholding: " + federalWithholding + 
					  "\n State Withholding: " + stateWithholding + 
					  "\n Total Deduction: " + totalDeduction + 
					  "\n Net Pay: " + netPay;
		JOptionPane.showMessageDialog(null, output);
		
	}
}