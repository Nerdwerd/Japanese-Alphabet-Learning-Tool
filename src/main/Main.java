package main;

import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[]args) {
		
		Startup();
		
	}
	
	public static void Startup() { //Sets up the Window
		JFrame window = new JFrame("Learning Japanese Alphabet Practice Tool");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		window.add(panel);
		window.setSize(1000,1000);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}


