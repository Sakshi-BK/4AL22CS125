package Swing4;
import javax.swing.*;
import java.awt.event.*;

public class CountryList {
	
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country Selector");

	        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
	                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selected = countryList.getSelectedValuesList();
	                System.out.println("Selected countries:");
	                for (String country : selected) {
	                    System.out.println(country);
	                }
	            }
	        });

	        frame.add(scrollPane);
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


