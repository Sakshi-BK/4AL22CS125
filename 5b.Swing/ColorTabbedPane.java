package Swing5;

	import javax.swing.*;
	import java.awt.*;

	public class ColorTabbedPane {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Color Tabs");

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        tabbedPane.addTab("Red", redPanel);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        tabbedPane.addTab("Blue", bluePanel);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        tabbedPane.addTab("Green", greenPanel);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


