/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package Swing2;
import javax.swing.*;
import java.awt.event.*;
public class CountryButton {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button");
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");
        JLabel label = new JLabel("", SwingConstants.CENTER);

        btnIndia.setBounds(50, 50, 100, 40);
        btnSrilanka.setBounds(200, 50, 100, 40);
        label.setBounds(50, 120, 250, 40);

        frame.setLayout(null);
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        btnIndia.addActionListener(e -> label.setText("India is pressed"));
        btnSrilanka.addActionListener(e -> label.setText("Srilanka is pressed"));

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


