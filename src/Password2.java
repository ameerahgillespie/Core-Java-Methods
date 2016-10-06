import java.util.Scanner;

//Password2:
//-Uses constants to hold settings
//--Loops back to first password if second doesn't match

//IMPROVEMENTS:
//email: there has to be a . after @, has to have 1+ characters between
// @ and ., has to have 2+ characters after .
//password: must include lowercase, must include a digit,
//  must include a special character !@#$%^*()-_+={}[]:;,.<>/
//  test for not-allowed special characters \?&

public class Password2 {

	public static void main(String[] args) {
		// good use of constants--program settings
		final int MINUSER = 7; // shortest acceptable username
		final int MAXUSER = 50; // longest acceptable username
		final int MINPASS = 8; // shortest password
		final int MAXPASS = 32; // longest pass

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Account Creation");

		String username, pass1, pass2;
		boolean valid;

		do {
			valid = true;
			// loop begins here
			System.out.println("Please enter email: ");
			username = scan.nextLine();

			// trim removes leading/trailing spaces
			// doesn't change the original string
			// therefore if I want to keep it
			username = username.trim();
			// at least 7 char
			if (username.length() < MINUSER) {
				System.out.println("Your email is too short.");
				valid = false;
			} else if (username.length() > MAXUSER) { // at most 50 char
				System.out.println("Your email is too long.");
				valid = false;
			}
			// must contain @ (not as first character)
			if (username.indexOf("@") < 1) {
				System.out.println("Invalid email--no @");
				valid = false;
			}
			// must contain .
			// contains returns a boolean--no need for == true
			if (!username.contains(".")) {
				System.out.println("Invalid email--no .");
				valid = false;
			}
		} while (!valid);
		System.out.println("***" + username + "***");

		// password 2 matches pass 1 loop
		do {
			// password1 is valid
			do {
				valid = true; // this is NOT redundant (2nd pass, for instance)
				System.out.println("Please enter password: ");
				pass1 = scan.nextLine();
				// must have a capital
				// get the lower version
				String lcpass = pass1.toLowerCase();
				// if the lower case version matches the original,
				// there's no upper case
				if (lcpass.equals(pass1)) {
					System.out.println("Sorry, password must contain a capital letter");
					valid = false;
				}
				// at least 8 char, at most 32
				if (pass1.length() < MINPASS) {
					System.out.println("Your password is too short.");
					valid = false;
				} else if (pass1.length() > MAXPASS) {
					System.out.println("Your password is too long.");
					valid = false;
				}
			} while (!valid);

			valid = true;
			System.out.println("Please re-enter password: ");
			pass2 = scan.nextLine();
			// must equal first password
			if (!pass2.equals(pass1)) {
				System.out.println("Your 2 passwords don't match.");
				System.out.println("Please re-enter the original password:");
				pass2 = scan.nextLine();
				if (!pass2.equals(pass1)) {
					System.out.println("Sorry, that's a mismatch again.");
					valid = false;
				}
			}
		} while (!valid);

		System.out.println("Your account has been activated!");
		scan.close();
	}

}
