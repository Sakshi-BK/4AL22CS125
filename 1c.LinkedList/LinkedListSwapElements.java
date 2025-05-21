package LinkedList;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwapElements {

	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");  // index 3

	        System.out.println("Before swap: " + colors);

	        // Swap first (0) and third (2) elements
	        Collections.swap(colors, 0, 2);

	        System.out.println("After swapping first and third: " + colors);
	    }
	}



