/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

	// Task 1
	public String upperCaseName(String name) {
		return name.toUpperCase();
	}

	// Task 2

	public String fullName(String firstName, String secondName) {
		String fullName = firstName + " " + secondName; //another variable is used so as to help with the readability of tbe code
		return fullName;
	}

	// Task 3

	public int letterCount(String name) {
		return name.length();
	}

	// Task 4
	public boolean theSameName(String name1, String name2) {
		return name1.equalsIgnoreCase(name2); //.equalsIgnoreCase was needed instead of just .equals
	}

	// Task 5
	public String properCaseName(String name) {
		return name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase(); //substring used to specify what characters to apply to uppercase and lowercase
	}
}
