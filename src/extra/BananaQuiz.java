//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		 String input =JOptionPane.showInputDialog("do you like bananas");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (input.equals("no")) {
		System.out.println("end of quiz");
			
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
if (input.equals("yes")) {
	System.out.println("Your hobby is much better than bananas!");
}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
if (input.equals("")) {
	System.out.println("you are bannana");
}
	}

}
