package wk5;
import javax.swing.*;

public class Main {
	
	public static void main(String args[]) {
		// Container - contains components
		JFrame window = new JFrame("Hello world");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a label
		JLabel label = new JLabel("I am a Swing label");
		window.getContentPane().add(label);
		window.pack();
		window.setSize(300,250);
		window.setVisible(true);
		
	}

	
}
