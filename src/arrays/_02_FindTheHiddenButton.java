/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton[] button;
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String number = JOptionPane.showInputDialog("Enter A Positive Number");
		int buttons = Integer.parseInt(number);
		button = new JButton[buttons];

		for (int i = 0; i < button.length; i++) {
			button = new JButton[];
		}
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		// 11. set the JFrame to visible.

		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3

		// 14. Set the text of the JButton located at hiddenButton the read "ME"

		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch

		// 16. Set the text of the JButton located at hiddenButton to be blank.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.

		// 18. else tell them to try again
	}
}
