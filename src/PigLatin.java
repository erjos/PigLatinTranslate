import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		//app prompts user for a word
	
		String original = "";
		int space = 0;
		char vowel= 'x';
		int iVowel = 0;
		System.out.println("Welcome to the Pig Latin Translator!");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line to be translated: ");
		original = input.nextLine();
		//convert to lowercase
		
		original = original.toLowerCase();
		
		//get words
		//potential way using arrays: String[] split = original.split(" ");
		
		int index = original.indexOf(" ", 0);
		
		String word1 = original.substring(0, index);
		
		System.out.println(word1);
		
		//if the word starts with a vowel, add "way" to the ending
		char letter1 = word1.charAt(0);
		
		System.out.println(letter1);
		
		if (letter1 == 'a' || letter1 == 'e' || letter1 == 'i' || letter1 == 'o' || letter1 == 'u') {
			System.out.println(word1 + "way");
		} //if it starts with a consonant, convert to pig latin for consonants
		else {
			//find the first vowel in this word
				
				for (iVowel = 0; iVowel <= word1.length(); iVowel++ ){
					if ( word1.charAt(iVowel) == 'a' || word1.charAt(iVowel) == 'e' || word1.charAt(iVowel) == 'i' || word1.charAt(iVowel) == 'o' || word1.charAt(iVowel) == 'u'){
						vowel = word1.charAt(iVowel);
						System.out.println(vowel); // this is the char
						System.out.println(iVowel); // this is the index of that char
						break; // might be able to avoid using a break if I use a while and set the condition to while (!== 'a', etc.)
						}
					
		}
				word1 = word1.substring(iVowel, word1.length());
				System.out.println(word1 + letter1 + "ay");
		
		
		
		//app translates the text to Pig Latin and displays the result
				//app asks the user if he or she wants to translate another word
		/*
		for (int i= space; i <= original.length(); i++){
			//why do I need this if statement to keep this from looping infinitely
			//if((original.indexOf(" ", i) >=0)){
			space = original.indexOf(" ", i);
			System.out.println(space);
			//i = original.indexOf(" ", i);
			//}
		}
		*/
		//things we need to do:
		//Remove the first consonant of every word, and in certain cases two (th, ch)
		//if the first letter is a vowel, leave it
		//if you removed a consonant (or two), append them to the end of the word with an "ay" on the end
		// note: will need to identify individual words
		// note: look through the string methods for ideas
		
		//idea: maybe we'll create a method that searches for the index of blank spaces in the string to identify words
		//
	}
	}
}
