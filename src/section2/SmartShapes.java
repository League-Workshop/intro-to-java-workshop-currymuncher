package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {

	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot bb8 = new Robot();
		int numSides = 3;
		// 3. Put the robot's pen down
		bb8.penDown();

		// 6. Make the robot move as fast as possible
		bb8.setSpeed(500);

		drawshape(bb8, numSides);
	}

	private static void drawshape(Robot bb8, int numSides) {
		// 5. Use a for loop to repeat everything below 4 times.
		for (int i = 0; i < numSides; i++) {

			// 2. Move your robot 200 pixels
			bb8.move(200);

			// 4. Turn the robot 90 degrees to the right
			bb8.turn(360 / numSides);

			// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides),
			// pentagon (5-sides), decagon (10-sides)).

		}
	}
}
