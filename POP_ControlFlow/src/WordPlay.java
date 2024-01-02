import java.util.Random;
/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {
	
	/*Task1 - This code takes in two string variables into the method and returns which string cames before which in the alphabet

	Checks whether the words are the same with the first if statement and the nested if statement in the else checks
	for the alphabetical order of the words
	 */
	public String whatComesFirst(String word1, String word2) {
		if (word2.equalsIgnoreCase(word1)){
			return word1.toLowerCase() + " is the same as " + word2.toLowerCase(); //both need to be put to the lowercase to signify they are both the same word
		}
		else{
			if (word1.toLowerCase().charAt(0) < word2.toLowerCase().charAt(0)){ //Gets the ascii value of the first character of both of the words and compares them
				return word1 + " comes before " + word2 + " in the alphabet"; //It's also needed to put both words to lowercase here as uppercase characters have higher values than lowercase characters in ascii
			}
			else{
				return word2 + " comes before " + word1 + " in the alphabet";
			}
		}

	}
	
	//Task 2 - Takes a string variable and returns this string backwards
	// even though the tasks suggests you use a loop this is not the most efficient way to do it especially if you had multiple strings to reverse
	public String backwardsString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	//Task 3 - The method takes two string arrays and appends one to other and returns the appended string array
	public String[] addressBook(String[] names, String[] phoneNumbers) {
		for (int i = 0; i < names.length; i++){ //for loop needed to access the same element from both arrays
			names[i] += " " + phoneNumbers[i]; //appends the names array with phone numbers plus a space
		}
		return names; //return the appended array
	}
	
	//Task 4 - The method takes in a string (the guess) and returns the computers guess and whether they won or not
	public String rockPaperScissors(String guess) {
		Random randomNum = new Random();
		String[] gameOptions = {"rock", "paper", "scissors"}; // A string of all the possible options to allow one to be selected bases on a random number generated
		int randomGeneratedNum = randomNum.nextInt(3); //Generates a random number between 0 and 3
		String computerGuess = gameOptions[randomGeneratedNum]; //Assigns the computers guess to a string variable so it can be used in the following if statements
		if (guess.equals(computerGuess)){		//This first if is to check whether the guesses are the same or not
			return "USER:" + guess + " vs COMP:" + computerGuess + " it is a draw";
		}
		else if (guess.equals("rock") && computerGuess.equals("scissors")){ // rest of the if conditions ar to check the different variations of anwsers
			return "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
		}
		else if (guess.equals("rock") && computerGuess.equals("paper")){
			return "USER:" + guess + " vs COMP:" + computerGuess + " COMPUTER wins";
		}
		else if (guess.equals("scissors") && computerGuess.equals("rock")){
			return "USER:" + guess + " vs COMP:" + computerGuess + " COMPUTER wins";
		}
		else if (guess.equals("scissors") && computerGuess.equals("paper")){
			return "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
		}
		else if (guess.equals("paper") && computerGuess.equals("scissors")){
			return "USER:" + guess + " vs COMP:" + computerGuess + " COMPUTER wins";
		}
		else{
			return "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
		}
	}
}
