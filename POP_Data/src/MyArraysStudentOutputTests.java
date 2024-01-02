import java.util.Arrays;

/**
 * myArraysStudentOutputTest class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the myArrays class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArraysStudentOutputTests {

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        // Task1 test
        System.out.println(myArrays.addUpNumbers(10,20,30,40,50));

        // Task 2 test
        int[] numbers = {10,20,30,40,50};
        System.out.println(myArrays.addUpNumbers(numbers));

        // Task 3 test
        System.out.println(myArrays.averageOfNumbers(numbers));

        // Task 4 test
        System.out.println(Arrays.toString(myArrays.convertToCelsius(numbers)));

        // Task 5 test
        int[] grades = {64,35,40,92,70,25};
        System.out.println(Arrays.toString(myArrays.unitMarks(grades)));


        // Task 6 test
        String[] names = {"Dan", "Bob", "Suzy", "Tim", "Heather"};
        System.out.println(myArrays.andTheWinnerIs(names));
    }
}