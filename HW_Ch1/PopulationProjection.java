/*1.11*/

public class PopulationProjection{
	public static void main(String[] args){
		System.out.println("population for next year");
		System.out.println(312032486 + (365 * 24 * 60 * 60.0 / 7) - (365 * 24 * 60 * 60.0 / 13) + (365 * 24 * 60 * 60.0 / 45));
	}
}

/*how about next four years? without using the data from last step? can we do a loop?*/