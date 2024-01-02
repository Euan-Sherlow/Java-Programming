import java.util.Random;

public class Dice {

    private int faceValue;

    //Task 1

    //The method generates a random number between 1 and 6 and assigns it to the global variable faceValue
	public void roll() {
        Random randomNum = new Random();
		this.faceValue = randomNum.nextInt(6) + 1;
	}


	// Task 1 - second bit

    //The Method returns faceValue
	public int getFaceValue() {
        return this.faceValue;
	}


	//Task 2

    //The method returns a string value of faceValue
    //The method returns a string value of faceValue
	public String toString() {
		return this.faceValue + "";
	}

}
