import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		//type name = new type (any parameters);
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the temperature? ");
		int temp = scan.nextInt();
		System.out.println("It's " + temp + " degrees.");
		
		//extended conditional
		if (temp <= 70) {
			System.out.println("It's too cold!");
		} else if (temp <= 72) {
			System.out.println("It's a little cold.");
		} else if (temp >= 74) {
			System.out.println("It's too warm!");
		} else { //catch-all or default
			System.out.println("It's comfy.");
		}
		
		int a = 10;
		int b = 15;
		
		//ternary operator (conditional operator)
		int max = (a > b) ? a : b;
//		int max;
//		if (a > b)
//			max = a;
//		else
//			max = b;
		
		System.out.println("The highest is " + max);
	
		System.out.println("What do you want for lunch? ");
		System.out.println("A=Hamburger; B=Taco; C=Salad"); 
		scan.nextLine(); //clear the enter from previous nextInt
		String input = scan.nextLine();
		input = input.toUpperCase();
		input = input.substring(0, 1);
		
		switch(input) {
			case "A":
				if (temp > 74)
					System.out.println("It's too hot for a hamburger");
				else
					System.out.println("Downtown Louie's!");
				break;
			case "B":
				System.out.println("Jose's Tacos");
				break;
			case "C":
			case "D": //C or D will result in 7greens
				System.out.println("Seven Greens");
				break;
			default:
				System.out.println("Broderick Grill");
		}
		
		scan.close();
	}

}
