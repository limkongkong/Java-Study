import java.util.Scanner;
public class MonetaryUnits{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter an amount, for example, 11.56: ");
	double amount = input.nextDouble();
	
	int remainingAmount = (int)(amount*100);
	
	int numberOfOneDollars = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	String dollarString = "";
	if (numberOfOneDollars > 1){
		dollarString = numberOfOneDollars + " dollars\n";
	}
	else if (numberOfOneDollars == 1){
		dollarString = numberOfOneDollars + " dollar\n";
	}
	
		
      	
	int numberOfQuarters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;
		String quarterString = "";
	if (numberOfQuarters > 1){
		quarterString = numberOfQuarters + " quarters\n";
	}
	else if (numberOfQuarters == 1){
		quarterString = numberOfQuarters + " quarter\n";
	}
	
	int numberOfDimes = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
		String dimString = "";
	if (numberOfDimes > 1){
		dimString = numberOfDimes + " dims\n";
	}
	else if (numberOfDimes == 1){
		dimString = numberOfDimes + " dim\n";
	}
	
	int numberOfNickels = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
		String nickelString = "";
	if (numberOfNickels > 1){
		nickelString = numberOfNickels + " nickels\n";
	}
	else if (numberOfNickels == 1){
		nickelString = numberOfNickels + " nickel\n";
	}
	
	int numberOfPennies = remainingAmount;
		String pennyString = "";
	if (numberOfPennies > 1){
		pennyString = numberOfPennies + " pennies\n";
	}
	else if (numberOfPennies == 1){
		pennyString = numberOfPennies + " penny\n";
	}
	

	System.out.println("your amount " + amount +
	" consists of \n" + dollarString + quarterString + dimString + nickelString + pennyString);
	
}
}