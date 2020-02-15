package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Disney trivia, I'll be your host, The Computer!");
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String answer1 = JOptionPane.showInputDialog("Question 1: In Peter Pan, Captain Hook had a hook on which one of his hands?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equalsIgnoreCase("Left")) {
			JOptionPane.showMessageDialog(null, "Correct! +100 points");
			userScore = userScore + 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Better luck next time! +0 points. The correct answer was Left");
		}
		String answer2 =JOptionPane.showInputDialog("Question 2:During the battle with Aladdin, what type of animal does Jafar transform himself into?");
		if (answer2.equalsIgnoreCase("Snake")) {
			JOptionPane.showMessageDialog(null, "Correct! +100 points");
			userScore = userScore + 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Better luck next time! +0 points. The correct answer was Snake");
		}
	String answer3 = JOptionPane.showInputDialog("What was the first roller coaster attraction at Walt Disney World, Space Mountain or Big Thunder Mountain?");
		if (answer3.equalsIgnoreCase("Space Mountain")) {
			JOptionPane.showMessageDialog(null, "Correct! +100 points");
			userScore = userScore + 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Better luck next time! +0 points. The correct answer was Space Mountain.");
		}
		String answer4 = JOptionPane.showInputDialog("What was the name of the dragon (god wanna be) in Mulan?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer4.equalsIgnoreCase("Mushu")) {
			JOptionPane.showMessageDialog(null, "Correct! +100 points.");
			userScore = userScore + 100;
	}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! Better luck next time! +0 points. The correct answer was Mushu");
		}
		JOptionPane.showMessageDialog(null, "Thank you for playing! Your score: " + userScore);
}
}
