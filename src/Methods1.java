import java.util.Scanner;

public class Methods1 {
	static Scanner scan; // global

	// method header: describes the method for the JVM
	// 1. visibility modifier: where can the method be called?
	// 2. static (or nothing)
	// 3. return type: what data type of info are we returning?
	// 4. name: unique identifier
	// 5. (in parens): argument list--info that this method needs
	// to do its job

	// method signature: subset of the header
	// you don't specify it separately--the compiler creates it
	// from the header
	// signature = methodName & argument list data types
	// each method must have a unique signature
	public static int multiply(int n1, int n2) {
		int product = n1 * n2;
		return product;
	}

	// an overloaded method is a method in the same class
	// with the same name but a different argument list
	// signature: multiply (int, int, int)
	// signature of above method: multiply (int, int)
	public static int multiply(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}

	public static int multiply(int n1, int n2, int n3, int n4) {
		return n1 * n2 * n3 * n4;
	}

	public static int getNumber(int min, int max) {
		System.out.print("Please enter an integer between " + min + " and " + max + ": ");
		int num = scan.nextInt();
		while (num < min || num > max) {
			System.out.println("You can't follow directions.");
			System.out.print("Please try again: (" + min + "-" + max + ") ");
			num = scan.nextInt();
		}
		return num;
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int a = getNumber(1, 10);// method invocation
		int b = getNumber(-10, 10);

		System.out.println("You entered " + a + " and " + b);
		System.out.println("The product of these numbers is " + multiply(a, b));
		// can't match the signature below
		// System.out.println(multiply(8, 80, 300));
		// System.out.println(multiply(-100, 1000));
		System.out.println("Let's try that again!");
		System.out.println(multiply(getNumber(1, 5), getNumber(20, 40)));

		scan.close();
	}

}
