/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListStartFromSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);

	        // Start from index 1 (second element)
	        ListIterator<String> iterator = colors.listIterator(1);
	        System.out.println("Iterating from 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
