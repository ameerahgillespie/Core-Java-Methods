import java.util.Scanner;

public class DataValidation {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		//1 and 20 are ACTUAL PARAMETERS
		int input = getIntInRange (0, 20);
		
		//when you can, PREVENT exceptions
		int input2 = getIntInRange (0, 20);
			
	}

	//int min, int max make up the FORMAL PARAMETERS
	public static int getIntInRange (int min, int max) {
		System.out.print("Please enter an integer between "
				+ min + " and " + max + ": ");
		int num = scan.nextInt();
		while (num < min || num > max) {
			System.out.println("You can't follow directions.");
			System.out.print("Please try again: ("
					+ min + "-" + max + ") " );
			num = scan.nextInt();
		}
		return num;
	}
	
public static double getDouble (){
	//check if scan is initiated
	// if scanner isnt set up
	
	if (scan == null)
	scan = new Scanner (System.in);
	//as long as the next thing the scanner sees is not a double ask the user to re-enter
	//take in and return the double
	while(! scan.hasNextDouble()) {
		System.out.println("Please try again.");
		scan.next();
		

	}
		return scan.nextDouble();
		
	}
  }
