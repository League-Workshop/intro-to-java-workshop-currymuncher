package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE]
		
		Robot bb8 = new Robot();
		bb8.setPenColor(Color.cyan);
		bb8.setPenWidth(5);
		bb8.setSpeed(500);
	
for(int i=0; 1<4; i++) {
	bb8.penDown();
	bb8.move(100);
    bb8.turn(90);
    bb8.penDown();
    bb8.move(100);
		} 
	  
	}
}
