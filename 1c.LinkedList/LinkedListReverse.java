/*2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListReverse {
	
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);
	        System.out.println("Reverse order:");

	        Iterator<String> iterator = colors.descendingIterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


