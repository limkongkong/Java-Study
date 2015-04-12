import javax.swing.JOptionPane;
public class SortThreeIntegers{
	public static void main(String[] args){
	String numString1 = JOptionPane.showInputDialog(
	"Enter first integer: ");
	int num1 = Integer.parseInt(numString1);
	
	String numString2 = JOptionPane.showInputDialog(
	"Enter second integer: ");
	int num2 = Integer.parseInt(numString2);
	
	String numString3 = JOptionPane.showInputDialog(
	"Enter third integer: ");
	int num3 = Integer.parseInt(numString3);
	
	int test = 0;
    if (num1 > num2){
		test = num1;
		num1 = num2;
		num2 = test;
		} 	
	
	if (num1 > num3){
		test = num1;
		num1 = num3;
        num3 = test;		
	    }
		
	if (num2 > num3){
		test = num2;
		num2 = num3;
		num3 = test;
	}	
	
	String output = num1 + " <= " + num2 + " <= " + num3;
	JOptionPane.showMessageDialog(null, output);
	
	
	}
	
}