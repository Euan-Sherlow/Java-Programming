import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * UserInput class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class UserInput {
	//Task 1 - Method reads a name from the user and returns hello + users name

    public String sayHello() {
        Scanner keyboard = new Scanner(System.in); //creating scanner object so we can take inputs from the user
        String name;
        System.out.println("Please enter your name");
        name = keyboard.next();
        keyboard.close(); //closes the scanner
		return "Hello " + name;
	}

	//Task 2 - The method takes in 10 numbers from the user, stores them in an array and returns the array

    public int[] readTenNumbers() {
        Scanner keyboard = new Scanner(System.in); //creating scanner object so we can take inputs from the user
        int[] numbers = new int[10]; //Create an integer array of size 10
        for(int i = 0; i < numbers.length; i++){ //loops around until the numbers array is filled
            System.out.println("Please enter a number");
            numbers[i] = keyboard.nextInt(); //assigns numbers of index i with user input integer
        }
		return numbers;
	}

	//Task 3 - The method takes in 10 String inputs from the user and returns the array which the inputs are added to
	public String[] readTenNames() {
        Scanner keyboard = new Scanner(System.in); //creating scanner object so we can take inputs from the user
        String[] names = new String[10];
        for(int i = 0; i < names.length; i++){ //loops around until the numbers array is filled
            System.out.println("Please enter a name");
            names[i] = keyboard.next(); //assigns numbers of index i with user input String
        }
        return names;
	}
}
