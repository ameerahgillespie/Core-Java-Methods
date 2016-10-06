
public class Techno {

	public static void main(String[] args) {		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("Du du du du");
				}
				System.out.println("DOO DOO DO DOOO DO DO DOO DOO DO DOOO");
			}
			System.out.println("The system is down. The system is down.");
		}
		//the previous i went out of scope at the final curly
		// brace of its for loop
		for (int i = 0; i < 3; i++) {
			System.out.println("Thank you!");
		}

	}

}
