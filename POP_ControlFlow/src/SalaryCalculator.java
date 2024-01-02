/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

	//Task 1 - The method takes in the salary and returns the salary after the tax they pay depending on the bracket they are in
	public double salaryTax(double grossSalary) { //the task needs a double as an input
		double netSalary;						//netSalary is a variable declared so as to improve the readability of the code and not constantlu changing one variable
        if (grossSalary >= 45000){
			netSalary = grossSalary - (grossSalary/100 * 50); //could do this calculation differently but this better shows that 50 percent is being calculated
			return netSalary;
		}
		else if (grossSalary >= 30000){
			netSalary = grossSalary - (grossSalary/100 * 30);
			return netSalary;
		}
		else{
			netSalary = grossSalary - (grossSalary/100 * 15);
			return netSalary;
		}
	}

	/*Task 2 - Use of a switch statement makes the code easier to read and understand as its cleaner and less syntax
	Also the use of return; in each case statement means that break; is not needed and that two case statements can have one outcome

	 */
	public double calculateNI(double grossSalary, char nInsuranceBand) { //use char instead of String
		double netSalary;
		switch (nInsuranceBand){   //initialize switch statement
			case 'a': //allows for both upper case and lower case inputs
			case 'A':
				netSalary = grossSalary - (grossSalary/100 * 12);
				return netSalary; //no need for a break; now
			case 'b':
			case 'B':
				netSalary = grossSalary - (grossSalary/100 * 5.85);
				return netSalary;
			case 'c':
			case 'C':
				netSalary = grossSalary - (grossSalary/100 * 2);
				return netSalary;
			default:    // need this so signify the end of the switch statement and returns the input salary if no valid insurance bad put in
				return grossSalary;
		}
	}
	
	//Task 3 - The method takes in an array of salaries and returns all the salaries added together

	// for each loop is fine here to loop through the array
	public double salaryTotal(double[] salaries) {
		double total = 0;
		for (double salary : salaries){
			total += salary;
		}
		return total;
	}

	// Task 4 - essentially the same as task 3
	public double salaryAverage(double[] salaries) {
		double total = 0;
		for (double salary : salaries){
			total += salary;
		}
		return total / salaries.length;
	}


	//Task 5 - use a for loop to cycle through and amend each element from the array taken in by the method
	public double[] salaryIncrease(double[] salaries) { //taking in and returning a array of type double
		for (int i = 0; i < salaries.length; i++){
			salaries[i] += (salaries[i] / 100) * 5; //add the 5% increase
		}
		return salaries;
	}
}
