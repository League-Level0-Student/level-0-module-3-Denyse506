package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class OR {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {

		r2d2.penDown();
		
		
String shape=JOptionPane.showInputDialog("What do you want to draw Square,Triangle,Cricle");
		

if(shape.equals("square")) {
drawSquare(100);}
 
else if(shape.equals("triangle")) {
        drawTriangle(100);}
else if (shape.equals("cricle"))  {   
drawCricle(100);}
	}
	

	static void drawSquare(int size) {
		for (int i = 0; i < 4; i++) {
			r2d2.move(size);
			r2d2.turn(90);
		}
	}

	static void drawTriangle(int size) {
		for (int n = 0; n < 3; n++) {
			r2d2.move(130);
			r2d2.turn(360 / 3);
		}
	}

	static void drawCricle(int size) {
		for (int n = 0; n < 3; n++) {
			r2d2.move(130);
			r2d2.turn(360 / 3);
		}
	}
}
