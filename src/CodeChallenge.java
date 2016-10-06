
//TRIM
//FIND THE FIRST SPACE
//GET RID OF FIRST WORD
//SUBSTRING FROM OR AFTER SPACE TO END OF SENTENCE
//INCREMENT COUNT - OUTSIDE OF THE LOOP I NEED COUNT EQUALS ZERO
//GOT RID OF THE FIRST WORD

//

//write a method called count words 
//takes a string as argument and return
//return the number of words in the string that it got (INT)
// should be a main that calls the method and should be a method

//write header
//write method

//write a main string in the 
//count what is separated by spaces and find out how many words there are and RETURN it as INT
//play with the string and figure out how you want to do it
//substring may help
//don't forget about trim

public class CodeChallenge {

	public static int main(String input) {

		int wordCount = 0;

		if (input.trim().equals("")) {
			return wordCount;
		} else {
			wordCount = 1;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String str = new String("" + ch);
			if (i + 1 != input.length() && str.equals(" ") && !("" + input.charAt(i + 1)).equals(" ")) {
				wordCount++;
			}
		}

		return wordCount;

	}

}
