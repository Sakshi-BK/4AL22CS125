package Swing6;


	import javax.swing.*;
	import java.awt.event.*;
	import java.util.*;

	public class CountryCapitalList {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country-Capital Viewer");

	        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France",
	                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

	        Map<String, String> capitals = new HashMap<>();
	        capitals.put("USA", "Washington, D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "No single capital (multiple countries)");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selected = countryList.getSelectedValuesList();
	                System.out.println("Selected countries and their capitals:");
	                for (String country : selected) {
	                    System.out.println(country + " -> " + capitals.get(country));
	                }
	            }
	        });

	        frame.add(scrollPane);
	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}



