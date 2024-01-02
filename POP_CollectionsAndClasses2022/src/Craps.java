
public class Craps {

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

	//Task 1

    //The method rolls both of the dice
	public void shoot() {
        dice1.roll(); //rolls dice object 1
        dice2.roll(); //rolls dice object 2
	}


	//Task 1

    //The method returns the first dice object
	public Dice getDice1() {
		return dice1;
	}


	//Task 1

    //The method returns the second dice object
	public Dice getDice2() {
		return dice2;
	}


	//Task 2

	//The method returns the total of the two dice values
	public int addUpScore() {
		return dice1.getFaceValue() + dice2.getFaceValue();
	}

	//Task 3
 
	//The method decides the outcome of the dice game and outputs the result
	public String decideOutcome(int diceTotal) {
		String outcome;
		if (diceTotal == 7 || diceTotal == 11){
			outcome = "You win";
		}
		else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12){
			outcome = "You lose";
		}
		else{
			outcome = "Throw again";
		}
		return outcome;
	}

	//Task 4 - No UNIT TEST FOR THIS ONE - Check the output

	//The method shows the value of each dice, the total and the outcome
	public String getResults() {
		return  "Dice 1 is " + getDice1() + "\n" +
				"Dice 2 is " + getDice2() + "\n" +
				"Total is: " + addUpScore() + "\n" +
				"Result is " + decideOutcome(addUpScore()) + "\n" +
				"****************";
	}

	//Task 5 - No UNIT TEST FOR THIS ONE - Check the output

	//The method keeps looping until outcome is no longer throw again
	public String playCraps() {
		String outcome = decideOutcome(addUpScore());
		while (outcome.equals("Throw again")){
			shoot();  //This method rolls the dice again
			System.out.println(getResults());
			outcome = decideOutcome(addUpScore());
		}
		return "";
	}


	/*Task 6 Additional tasks - OPTIONAL AND NOT ASSESSED
	Can you add a method that asks the user if they want to play again?
	public ?? playAgain(??){

	}*/
}
