import java.util.Scanner;

public class InputLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//common task: doing something a set number of times
		System.out.print("How many times? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Everybody poops!");
		}
		
		//common task: multiplying out
		for (int i = 1; i < Integer.MAX_VALUE
				&& i > 0; i *= 2) {
			System.out.println(i);
		}
		
		//micropattern or template
		//this is a very common chunk of code
		System.out.print("Please enter an integer between 1 and 10: ");
		int num = scan.nextInt();
		while (num < 1 || num > 10) {
			System.out.println("You can't follow directions.");
			System.out.print("Please try again: (1-10) ");
			num = scan.nextInt();
		}
		
		scan.close();
	}
}
