package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener {
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	
}
void makeButtons(){
JFrame frame = new JFrame();
frame.add(panel);
panel.add(button1);
panel.add(button2);
frame.setTitle("The best frame in the history of frames");
button1.setText("A very good joke");
button2.setText("The best punchline for the very good joke");
button1.addActionListener(this);
button2.addActionListener(this);
frame.setVisible(true);
frame.pack();
panel.add(button3);
button3.setText("I wonder what this does?");
button3.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button1) {
		System.out.println("Button 1 says hi!");
		JOptionPane.showMessageDialog(null, "Press the punchline because there is no preperation for it!");
	}
	if (e.getSource()==button2) {
		System.out.println("Button 2 says hi!");
		JOptionPane.showMessageDialog(null, "There is no punchline, there is no joke either, this is a robbery and you just got scammed.");
	}
	if (e.getSource()==button3) {
JOptionPane.showMessageDialog(null, "You found a secret button and achieved...");

JOptionPane.showMessageDialog(null, "Nothing!");
	}
}
}

