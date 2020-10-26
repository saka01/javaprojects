import java.awt.Point;
import java.util.ArrayList;

public class RobotTester
{

public static void main(String[] args)
{
// Create a new Robot object with the initial position of (5,5) and
// initial direction to the East (1).
Robot robot = new Robot(new Point(5, 5), 1);
robot.move(); // 6, 5, 1
robot.turnRight(); // 6, 5, 2
robot.move(); // 6, 6, 2
robot.move(); // 6, 7, 2
robot.turnRight(); // 6, 7, 3
robot.move(); // 5, 7, 3
robot.move(); // 4, 7, 3
robot.turnLeft(); // 4, 7, 2
robot.move(); // 4, 8, 2

Point location = robot.getLocation();
System.out.println("Location: " + location.x + ", " + location.y);
System.out.println("Expected: 4, 8");
System.out.println("Direction: " + robot.getDirection());
System.out.println("Expected: S\n");
System.out.println("Movement History: ");
for(String i: robot.getMovementHistory())
System.out.println(i);
}
}