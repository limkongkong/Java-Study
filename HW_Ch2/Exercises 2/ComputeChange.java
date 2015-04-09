import java.util.Scanner;
public class ComputeChange{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer amount, for example, 1156: ");
	
	int amount = input.nextInt();
	int numberOfDollars = (int)amount/100;
	int numberOfCents = (int)amount %100;
	
	System.out.println("Your amount " + amount + "consists of \n" + 
	                   "\t" + numberOfDollars + " dollars\n" +
					   "\t" + numberOfCents + " cents");
	
	}
}