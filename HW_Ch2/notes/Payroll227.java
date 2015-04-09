import javax.swing.JOptionPane;
public class Payroll277{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog(
		"Enter employee's name: ");
		
		String hour = JOptionPane.showInputDialog(
		"Enter number of hours worked in a week: ");
		double hour =  Double.parseDouble(hourString);
		
		String payRate = JOptionPane.showInputDialog(
		"Enter hourly pay rate: ");
		double payRate = Double.parseDouble(payRateStrinh);
		
		String federalTaxRate = JOptionPane.showInputDialog(
		"Enter federal tax withholding rate: ");
		double federalTaxRate = Double.parseDouble(federalTaxRateString);
		
		String stateTaxRate = JOptionPane.showInputDialog(
		"Enter state tax withholding rate: ");
		double stateTaxRate = Double.parseDouble(stateTaxRateString);
		
		
	}
}