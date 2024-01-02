import java.util.Map;
import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

		// Task 1 - Takes two integers into the method and returns which is the highest integer and -1 if they are the same
        // There are three options that can be returned so three selection statements are required
		public int highestOfTwo(int number1, int number2) {
            if (number1 > number2){
                return number1;
            }
            else if (number1 < number2){
                return number2;
            }
			else{    // If the numbers are equal
                return -1;
            }

		}
	
		/* Task 2 - Takes in a integer and returns what grade this integer is equivalent to, returning Invalid mark if the integer input into the method is out of bounds of the parameters

		Uses else if's as each selection needs a different requirements. Could have also used a try catch exception handling
		but is unnecessary for this task
		 */

		public String calculateGrade(int mark) {
            if (mark < 40 && mark >= 0){ //This if statement along with all the rest need >= 0 so Invalid mark can be caught
                return "Fail";
            }
            else if (mark < 50 && mark >= 0){
                return "3rd";
            }
            else if (mark < 60 && mark >= 0){
                return "2ii";
            }
            else if (mark < 70 && mark >= 0){
                return "2i";
            }
            else if (mark <= 100 && mark >= 0){
                return "1st";
            }
            else{
                return "Invalid mark";
            }
		}
		
		/* Task 3 - The method takes in a string variable and returns whether you guessed the same (heads or tails) as the computer

		Maths.round could also have been used to round to 1.0 or 0.0 but would have required more code
		 */
		public String headsOrTails(String headsOrTails) {
            String coinFace = "";
            if (Math.random() < 0.5){ //Maths.random generates a number between 0 and 1 so rounds to the nearest one basically creating a random 1 or 0
                coinFace = "tails";
            }
            else{
                coinFace = "heads";
            }
            System.out.println(coinFace);
            if (headsOrTails.equals(coinFace)){ //.equals is used instead of .equals.IgnoreCase as the tests do not use a mix of case
                return "Correct: you guessed " + headsOrTails + " and I flipped " + coinFace;
            }
            else{
                return "Incorrect: you guessed " + headsOrTails + " and I flipped " + coinFace;
            }

		}
		
		/*Task 4 - This method takes in an integer and loops, adding 1 to the number each time and returns the total

		Could have just used factorial to do this but wouldn't have required a loop which is what is was testing for
		a for loop is used as is the most condensed method to achieve this goal
		 */

		public int sumFromOneToWhat(int endNumber) {
            int total = 0;
            for(int i = 1; i <= endNumber; i++){ //Had to be <= so would loop all the way to the last value endNumber
                total += i;     //sums the integers 1 to endNumber
            }
			return total;
		}
		
		// Task 5 - use a while loop as there is no need to initialize a separate variable to start counting from
		public int sumFromWhatToWhat(int startNumber, int endNumber) {
            int total = 0;
            while (startNumber <= endNumber){
                total += startNumber; //sums the integers from startNumber to endNumber
                startNumber ++; //can use startNumber as a sort of counter
            }
			return total;
		}
}
