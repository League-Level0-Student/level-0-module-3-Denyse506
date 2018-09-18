//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot

      Robot  robot= new Robot();
   System.out.println(robot);
	
	//3. Ask the user what color they would like the robot to draw
	for (int g = 0; g < 6; g++) {
		
	
	String Color=JOptionPane.showInputDialog("what type color do you want");
	
	//5. Use an if/else statement to set the pen color that the user requested
if(Color.equals("black")) {
	robot.setPenColor(56,46,23);
}
	if (Color.equals("red")){
			robot.setPenColor(70,5,5);}
        //6. If the user doesn’t enter anything, choose a random color
else if(Color.equals("")) {
	robot.setPenColor(58,79,20); 
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

		//4. Set the pen width to 10
	
	    //2. Make the robot draw a shape (this will take more than one line of code)
for(int i=0; i<4;i++) {
	robot.penDown();
	robot.setSpeed(20);
	robot.setPenWidth(10);
	robot.move(100);
	robot.turn(360/4);
}}
	}
}