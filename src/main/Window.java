package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window implements ActionListener {
	
	JLabel label;
	JFrame frame;
	JPanel panel;

	
	public Window(int WIDTH, int HEIGHT) {
		
		frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		
		label = new JLabel("Japanese Alphabet Tool");
		
		JButton start = new JButton("Start");
		start.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(0,1));
		label.setBounds(WIDTH/2, HEIGHT/8, WIDTH, HEIGHT);
		panel.add(label);
		panel.add(start);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Japanese Alphabet Learning Tool");
		frame.pack();
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
