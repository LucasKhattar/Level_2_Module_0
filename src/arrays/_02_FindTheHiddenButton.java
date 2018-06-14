/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		JOptionPane.showMessageDialog(null, "Click on the button that says 'ME' to win");
		String number = JOptionPane.showInputDialog("Enter A Positive Number");
		int numOfButtons = Integer.parseInt(number);
		button = new JButton[numOfButtons];

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		Random rand = new Random();
		hiddenButton = rand.nextInt(numOfButtons);
		button[hiddenButton].setText("ME");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		button[hiddenButton].setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (e.getSource().equals(button[hiddenButton])) {
			JOptionPane.showMessageDialog(null, "You Win!");
		} else {
			JOptionPane.showMessageDialog(null, "Too Bad You Lost");
			button[hiddenButton].setOpaque(true);
			button[hiddenButton].setBackground(Color.GREEN);
		}
	}
}
