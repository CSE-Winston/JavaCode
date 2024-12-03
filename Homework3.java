// Winston Jiang Li
import java.util.Scanner;
import java.util.Random;

public class Homework3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random random = new Random(); // importing random util for it to select for computer.
		// Keeping the variable like the score to be at 0.
		while (true) {
		int playerscore = 0;
		int computerscore = 0;
		
		System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3 !");
		//game loop until someone scores 2 points.
		while (playerscore < 2 && computerscore < 2) {
			System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
			String playerchoice = key.nextLine().toLowerCase();
			int computerchoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissor.
			
			if (playerchoice.equals("rock") || playerchoice.equals("paper") || playerchoice.equals("scissors")) {
				String[] gestures = {"rock", "paper", "scissors"};
				String computerGestures = gestures[computerchoice];
				
				if (playerchoice.equals(computerGestures)) {
					System.out.println(playerchoice + " v " + computerGestures + "! Tie!");
					}
					else if ((playerchoice.equals("rock") && computerGestures.equals("scissors")) || (playerchoice.equals("paper") && computerGestures.equals("rock")) || (playerchoice.equals("scissors") && computerGestures.equals("paper"))){
						System.out.println(playerchoice + " v " + computerGestures + "! Player Wins!");
						playerscore++;
					} else {
						System.out.println(playerchoice + " v " + computerGestures + "! Computer Wins!");
						computerscore++;
					}
			} else {
				// This is to handle any invalid input.
				System.out.println("Not a valid input! Computer Wins!");
				computerscore++;
					}
			System.out.println("Player has won " + playerscore + " times and the computer has won " + computerscore + " times");
		}
		//Determines the winner.
		if (playerscore > computerscore) {
			System.out.println("The Player Wins!");
		} else {
			System.out.println("The Computer WIns!");
				}
		// This is to ask if they want to play again and resets the score to start the loop again.
		System.out.println("Play again? \"Yes\" or \"No\"");
		String PlayAgain = key.nextLine().toLowerCase();
		if (PlayAgain.equals("yes")) {
			playerscore = 0;
			computerscore = 0;
		} else {
			System.out.println("Goodbye!");
		}

		}
	}
}
