package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitti {
public static void main(String[] args) {
	Robot zane = new Robot();
		zane.setSpeed(100);
		zane.turn(-90);
		zane.move(400);
	zane.penDown();
	zane.turn(120);	
	zane.move(200);
	zane.turn(120);
	zane.move(200);
	zane.turn(180);
	zane.move(100);
	zane.turn(-60);
	zane.move(100);
	zane.penUp();
	zane.turn(180);
	zane.move(230);
	zane.turn(-90);
	zane.move(100);
	zane.penDown();
}
}
