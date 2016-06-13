import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		// app prompts user for a word

		// figured out that this app will only run correctly as long as the
		// String ends with a space, which is bad
		// edit logic to add a space to the end of the original string
		// or fix the way the program runs to be able to collect the last word
		// without a string issue -
		// also will loop continuously if there is a word that starts with a
		// vowel

		String original = "";
		String word = "";
		int index = 0;
		int startingPoint = 0;
		int space = 0;
		char vowel = 'x';
		int iVowel = 0;
		String restart = "";

		do{
		System.out.println("Welcome to the Pig Latin Translator!");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line to be translated: ");
		original = input.nextLine();
		// convert to lowercase

		original = original.toLowerCase();

		// get words
		// potential way using arrays: String[] split = original.split(" ");

		// look through the original string for blank spaces and store that
		// number in the variable index
		// starts at 0, but will need to change 0 so that this moves to the
		// number of that index after it sets it
		// start the loop here

		do {
			// write if else so that if the indexOf the first space returns
			// anything less than zero
			// the substring runs according to the length of the original

			if (original.indexOf(" ", startingPoint) >= 0) {
				index = original.indexOf(" ", startingPoint);
			} else {

				index = original.length();

			}

			// takes a substring from the startingPoint(0, but set to the
			// new index after the loop to that index
			// need to change 0 to be need to create another variable for
			// the zero, because we need index at this point to be the new
			// number

			word = original.substring(startingPoint, index);

			// if the word starts with a vowel, add "way" to the ending
			// tells us the character at the starting point for the word

			char letter1 = word.charAt(0);

			// if that first letter is a vowel print the word with 'way' on
			// the end
			if (letter1 == 'a' || letter1 == 'e' || letter1 == 'i' || letter1 == 'o' || letter1 == 'u') {
				System.out.print(word + "ay ");

				startingPoint = index + 1;
			} // if it starts with a consonant, convert to pig latin for
				// consonants
			else {
				// find the first vowel in this word

				for (iVowel = 0; iVowel <= word.length(); iVowel++) {
					if (word.charAt(iVowel) == 'a' || word.charAt(iVowel) == 'e' || word.charAt(iVowel) == 'i'
							|| word.charAt(iVowel) == 'o' || word.charAt(iVowel) == 'u' || word.charAt(iVowel) == 'y') {
						vowel = word.charAt(iVowel);

						break; // might be able to avoid using a break if I
								// use a while and set the condition to
								// while (!== 'a', etc.)
					}

				}

				String startword = word.substring(0, iVowel);

				word = word.substring(iVowel, word.length());

				System.out.print(word + startword + "ay ");

				startingPoint = index + 1;
			}

		} while (startingPoint <= (original.length() - word.length()));
		System.out.println();
		System.out.println("Would you like to transalte another? (Y/N)");
		
		restart = input.nextLine();
		
		startingPoint = 0;
		
		//in the greater "do while" loop, I need to consider that the starting point should be reset to zero
		
	} while(restart.equalsIgnoreCase("y"));
	}
}
