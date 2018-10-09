package modulo;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {

			Random randy = new Random();
			int num = randy.nextInt(3);

			String num1 = JOptionPane.showInputDialog("Guess what number");
			int num2 = Integer.parseInt(num1);

			if (num2 == num) {
				JOptionPane.showMessageDialog(null, "correct");

			} else {
				JOptionPane.showMessageDialog(null, "incorrect");
				num1 = JOptionPane.showInputDialog("Guess what number");
				num2 = Integer.parseInt(num1);
				if (num2 == num) {
					JOptionPane.showMessageDialog(null, "correct");

				} else {
					JOptionPane.showMessageDialog(null, "incorrect");

				}
			}
			
	String am =JOptionPane.showInputDialog(null,"Do you want to play again");
	if(am.equals("yes")) {
		i--;
	}
	
		}
	}

}
