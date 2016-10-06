import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("This program will take 10 integers as input.");
		System.out.println("Enter a negative number to quit early");
		System.out.println("Enter 0 to skip the confirmation message");
		
		//to keep a running total, declare variable outside loop
		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Please enter #" + i +": ");
			int n = scan.nextInt();
			
			if (n < 0)
				break; //gets out of the innermost loop
			if (n == 0)
				continue; //start next iteration now
						//skips lines below, inside loop
				
			total += n; //add this into total
			System.out.println(n + " added to loop");
		}
		//break comes out here
		System.out.println("The total is " + total);
		
		scan.close();
	}
}
