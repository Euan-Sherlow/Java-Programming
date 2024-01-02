import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProcessNames {

	//Task 1 - read in all data from a file

    //The method takes in a file and puts all the lines in the file into an array list and returns this array list

	public ArrayList<String> readNames(String filename)  throws Exception {
		ArrayList<String> names = new ArrayList<>();
		Scanner fileScan = new Scanner(new File(filename));
		while (fileScan.hasNext()){
			names.add(fileScan.nextLine());
		}
		return names;
	}


	//Task 2 - sort the data

	//The method takes an array list and returns a sorted array

	public ArrayList<String> sortNames(ArrayList<String> names){
		Collections.sort(names);
		return names;
	}


	//Task3 - find name position

	//The method takes an array list and a name to find and returns the position where the name is found
	public int findNamePosition(ArrayList<String> names, String targetName) {
		int index = -1;

		for (String name : names) {
			if (targetName.equals(name)){
				index = names.indexOf(name);
			}
		}
		return index;
	}



	//Task4 - delete name

	//This method takes in an array list and name to remove from the list, then returns the array list without the name in
	public ArrayList<String> deleteName(ArrayList<String> names, String deleteName){
		names.remove(deleteName);
		return names;
	}


	//Task5 - change name

	//The method takes in an array list, a name, and the name to replace it then returns the amended array list
	//
	public ArrayList<String> changeName(ArrayList<String> names, String name, String replacementName){
		names.set(findNamePosition(names, name), replacementName); //uses previous method to find the index and replaces it with variable replacementName
		return names;
	}


}