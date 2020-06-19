package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing_tutore implements KeyListener {
	char currentLetter;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
public void run() {
	currentLetter = generateRandomLetter();
	frame.setTitle("Does anybody even read titles for the frames?");
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	label.setText(String.valueOf(currentLetter));
	label.setVisible(true);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.pack();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("The key pressed is: " + e.getKeyChar());
	if (currentLetter==e.getKeyChar()) {
		panel.setBackground(Color.green);
		System.out.println("correct");
	}
	else {
		panel.setBackground(Color.red);
	}
	currentLetter = generateRandomLetter();	
	label.setText(String.valueOf(currentLetter));
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
