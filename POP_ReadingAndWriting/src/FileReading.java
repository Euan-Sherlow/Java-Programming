import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * FileReading class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class FileReading {

	//Task 1 - The method takes in a file and concatenates the two pieces of data in this file and returns this

    public String readName1(String filename) throws Exception {
        File file = new File(filename); //Creates file object
        Scanner fileScan = new Scanner(file); //Creates scanner using file object
        String name = fileScan.next() + " " + fileScan.next(); //Reads two lines of the file
        fileScan.close();
        return name;
	}

	//Task 2 - The method takes in a file, but makes sure the filename is valid, if not throws up an error message to the user

    public String readName2(String filename) {
        File file = new File(filename); //Creates file object
        String name;
        try{
            Scanner fileScan = new Scanner(file); //Creates scanner using file object
            name = fileScan.next() + " " + fileScan.next(); //Reads two lines of the file
            fileScan.close();
            return name;
        }
        catch (FileNotFoundException e){
            name = "Invalid filename";
            return name;
        }
	}

	//Task 3 - The method takes in a filename, reads 10 names from the file and then stores them in an array which is then returned

    public String[] readNames(String filename) throws Exception {
        File file = new File(filename); //Creates file object
        Scanner fileScan = new Scanner(file); //Creates scanner using file object
        String[] names = new String[10]; //Creates a new String array to store the names read from the file
        for (int i = 0; i < names.length; i++){
            names[i] = fileScan.nextLine();  //Need to use nextLine here as it is reading from a file
        }
        fileScan.close();
		return names;
	}

	//Task 4 - The method takes up to 20 numbers from a file and returns the array they are stored in
	public int[] readNumbers1(String filename) throws Exception {
        File file = new File(filename); //Creates file object
        Scanner fileScan = new Scanner(file); //Creates scanner using file object
        int[] names = new int[20]; //Creates a new String array to store the names read from the file
        int count = 0;

        while (fileScan.hasNextInt()){
            names[count] = fileScan.nextInt(); //Adds the line in the file to the array
            count ++;
        }
        fileScan.close();
		return names;
	}

	//Task5 - The method takes in a file and iterates through it, only taking in the integer values and adding it to an array
	public int[] readNumbers2(String filename) throws Exception {
        File file = new File(filename); //Creates file object
        Scanner fileScan = new Scanner(file); //Creates scanner using file object
        int[] names = new int[20]; //Creates a new String array to store the names read from the file
        int count = 0;

        while (fileScan.hasNextLine()){ //While there are still lines in the file to be read this loops around
            if (!fileScan.hasNextInt()){ //If the next line in the file is not an integer
                fileScan.nextLine(); //Gets rid of the next line in the file - so don't iterate the count variable
            }
            else{
                names[count] = fileScan.nextInt(); //Adds the line in the file to the array
                count ++;
            }
        }
        fileScan.close();
        return names;
	}

	//Task 6 - The method takes in a file and reads all the names into an array and returns this array
	public String[] readAddressBook(String filename) throws Exception {
        File file = new File(filename); //Creates file object
        Scanner fileScan = new Scanner(file); //Creates scanner using file object
        String[] names = new String[5]; //Creates a new String array to store the names read from the file
        for (int i = 0; i < names.length; i++){
            names[i] = fileScan.nextLine() + ": " + fileScan.nextLine();
        }
        fileScan.close();
		return names;
	}
}
