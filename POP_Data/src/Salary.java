import java.text.DecimalFormat;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

	// Task 1
  	public int salaryIncrease(int salary) {
  		  return salary + 200;
	}

	// Task 2
	public double salaryIncrease(double salary) {
		return salary + 200.5;
	}

	// Task 3:
	public double salaryIncrease(double salary, double percentIncrease) {
          return salary * (percentIncrease/100 + 1);
	}

	// Task 4
	public double calculatePay(double salary) {
		final double tax = salary * 15/100; //use of final keyword to make sure the variable tax can't be changed at another instance
		final double pension = salary * 13/100;
		double monthSalary = salary - tax - pension;
		monthSalary /= 12;
		return monthSalary;
	}

	// Task 5 - this one is more of a challenge - you can come back to it later
	public String formatCurrency(double currency) {
		  String pattern = "###,###,##0.00"; //Molds the format
		DecimalFormat decimalFormat = new DecimalFormat(pattern); //creates the object allowing for format change
        return "£" + decimalFormat.format(currency);
	}
}
