package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Suprise implements ActionListener{


private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
void run() {
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
button1.setText("Treat");
button2.setText("Trick");
button3.setText("Third");
frame.setVisible(true);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
frame.pack();
}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == button1) {
		showPictureFromTheInternet("https://i.ytimg.com/vi/I6nR0PD5CyM/hqdefault.jpg");
	}
	if (buttonPressed == button2) {
		showPictureFromTheInternet("http://www.jasonstaples.com/wp-content/uploads/2011/01/monty-python-spanish-inquisition1.jpg");
	}
	if (buttonPressed == button3) {
showPictureFromTheInternet("http://www.todayifoundout.com/wp-content/uploads/2017/11/rick-astley.png");	
}
	}

}

