package wk5;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class More_buttons_layout {

	public static void main(String[] args) {
		// Container - contains components
				JFrame window = new JFrame("Hello world");
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Create a panel
				JPanel panel = new JPanel();
				
				JButton button0 = new JButton("Button text");
				JButton button1 = new JButton("Button text");
				JButton button2 = new JButton("Button text");
				
				button0.setPreferredSize(new Dimension(300,30));
				button1.setPreferredSize(new Dimension(300,30));
				button2.setPreferredSize(new Dimension(300,30));
				
				panel.add(button0);
				panel.add(button1);
				panel.add(button2);
				
				window.getContentPane().add(panel);
				
				
				window.pack();
//				window.setSize(300,250);
				window.setVisible(true);
	}

}
