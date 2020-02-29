package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot rob = new Robot ("batman");
rob.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.
rob.setSpeed(100);
		// 12. Set the robot speed to 100
for (int i = 0; i < 200; i++) {
	rob.setPenColor(Color.orange);
	rob.turn(360/8);
	rob.move(64);
	rob.turn(-40);
	rob.move(flameSize);
	rob.turn(170);
	rob.move(flameSize);
	rob.setPenColor(Color.BLACK);
	rob.turn(64);
	rob.move(baseSize);
}
		// 13. Use a for loop to repeat all of the code below 25 times

			// 2. Turn the robot 1/8 of a circle
		
			// 3. Move the robot 64 pixels

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			
			// 5. Move the robot the distance in the variable flameSize
			
			// 6. Turn the robot 170 degrees
			
			// 7. Move the robot the distance in the variable flameSize (again)
			
			// 8. Turn the robot 64 degrees to the right
			
			// 9. Move the robot the distance in the variable baseSize
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}


