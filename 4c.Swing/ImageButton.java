/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package Swing3;

import javax.swing.*;
import java.awt.event.*;

public class ImageButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Example");

        // Load icons (check if these paths are correct and images exist)
        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\saksh\\OneDrive\\Pictures\\Screenshots\\digital.png");
        ImageIcon hourglassIcon = new ImageIcon("C:\\Users\\saksh\\OneDrive\\Pictures\\Screenshots\\hourglass.png");

        JButton btnDigital = new JButton();
        JButton btnHourglass = new JButton();
        JLabel label = new JLabel("", SwingConstants.CENTER);

        // Set the icons to buttons
        btnDigital.setIcon(digitalIcon);
        btnHourglass.setIcon(hourglassIcon);

        // Set layout and bounds
        btnDigital.setBounds(50, 50, 100, 100);
        btnHourglass.setBounds(200, 50, 100, 100);
        label.setBounds(50, 170, 300, 30);

        frame.setLayout(null);
        frame.add(btnDigital);
        frame.add(btnHourglass);
        frame.add(label);

        // Add action listeners
        btnDigital.addActionListener(e -> label.setText("Digital Clock is pressed"));
        btnHourglass.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
