package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
		Robot[] rob = new Robot[5];
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot(100 + 175 * i, 500);
		}
		boolean hasWon = false;
		while (hasWon == false)
			for (int i = 0; i < rob.length; i++) {
				rob[i].setSpeed(5);
				Random rand = new Random();
				int x = rand.nextInt(50);
				rob[i].move(x);
				if (rob[i].getY() <= 0) {
					hasWon = true;
					String winner = "Robot " + i + " Won!";
					JOptionPane.showMessageDialog(null, winner);
					break;
				}
			}
	}
	// 9. make the robots race around a circular track.
}
