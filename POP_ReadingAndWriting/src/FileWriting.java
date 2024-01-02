import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
/**
 * FileWriting class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class FileWriting {

	//Task 1 - The method takes in a name, splits it into each individual name then writes it to a file
	public String writeYourName(String name) throws Exception {
        String filename = "mynamefile.txt";
        String[] splitName = name.split(" "); //splits the name at the whitespace into an array
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename))); //Creating an object to allow writing to a file
        for (String separateNames : splitName){
            out.println(separateNames);
        }
        out.close();   //closes the file
		return filename;
	}
	
	// Task 2 - Method takes up to 20 random, whole 4 digit numbers, which are then written to a file
	public String writeRandomNumbers(int numberOfRandomNumbers) throws Exception {
        String filename = "randomNumbersFile.txt";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename))); //Creating an object to allow writing to a file
        Random randomNumbers = new Random();
        for (int i = 0; i < numberOfRandomNumbers; i++){
            int number = 1000 + randomNumbers.nextInt(8999);
            out.println(number);

        }
        out.close();
		return filename;
	}

}
