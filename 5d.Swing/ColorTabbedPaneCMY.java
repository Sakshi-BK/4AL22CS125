package Swing7;
import javax.swing.*;
import java.awt.*;


public class ColorTabbedPaneCMY {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("CMY Color Tabs");

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create Cyan tab
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        // Create Magenta tab
	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        // Create Yellow tab
	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}



