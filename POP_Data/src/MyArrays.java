import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArrays {

	// Task 1
	public int addUpNumbers(int num1, int num2, int  num3, int num4, int num5) {
		int total = num1 + num2 + num3 + num4 + num5; //total variable is initialised to allow for better readability of the code
        return total;
	}

	// Task 2
	public int addUpNumbers(int[] numbers) {
		int total = 0;
        for(int number : numbers){ //use a foreach loop to cycle through each element of the array taking in by the method - a normal for loop takes more uneccessary code
			total += number;
		}
        return total;
	}

	// Task 3
	public double averageOfNumbers(int[] numbers) {
		double total = 0;
		double average = 0; //Don't necessarily need two variables but helps with the readability of the code
		for(int number : numbers){
			total += number;
		}
		average = total/numbers.length; //allows for changes to the length of the array input into averageOfNumbers
		return average;
	}

	// Task 4
	public int[] convertToCelsius(int[] fahrenheit) { //Came into the problem of int[] in order to return an array
		int[] celsius = new int[fahrenheit.length];//Even though the length is known its best practise to use this method
		for(int i = 0; i < fahrenheit.length; i++){ //This method is correct it just doesn't do it in the exact way it was expected
			celsius[i] = (fahrenheit[i] - 32) * 5/9; //formula for fahrenheit
		}
		return celsius; //returns the amended array

	}

	// Task 5
	public String[] unitMarks(int[] grades) {
		double total = 0;
		double average = 0; //Again two variables are used here to allow better readability of the code
		String[] unitGrades = new String[grades.length + 1]; // +1 to allow the average to be appended to the array as well
		for(int grade : grades){ //Foreach loop as less code required than a regular for loop
			total += grade;
		}
		average = total/ grades.length;
		unitGrades[0] = "APP:" + grades[0];
		unitGrades[1] = "BSAD:" + grades[1];
		unitGrades[2] = "CF:" + grades[2];
		unitGrades[3] = "DAD:" + grades[3];
		unitGrades[4] = "N&CS:" + grades[4];
		unitGrades[5] = "POP:" + grades[5];
		unitGrades[6] = "Average:" + average;
		return unitGrades;


	}

	// Task 6
	public String andTheWinnerIs(String[] names) {
		Random randomNumberGenerator = new Random(); //Creating a random object
		int winnerIs = randomNumberGenerator.nextInt(names.length); //Generating a random number, using names.length so that the number wont be out of bounds
		return names[winnerIs]; //returns the index of the number generated
	}
}
