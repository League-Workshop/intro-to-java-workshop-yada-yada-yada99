package section3;

import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello!");
	String answer = JOptionPane.showInputDialog("What's Your Name?");
	JOptionPane.showMessageDialog(null, "Hello "+answer);
	if(answer.equals("JT")){
	JOptionPane.showMessageDialog(null, "Welcome to the secret Database, Master");	
	}
	else {
		JOptionPane.showMessageDialog(null, "Leave now, Intruder, Wrong Password");
	}
	}
}

