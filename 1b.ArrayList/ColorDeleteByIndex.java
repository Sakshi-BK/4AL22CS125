/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorDeleteByIndex {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Original list: " + colors);
	        System.out.print("Enter the index (n) of element to delete: ");
	        int n = scanner.nextInt();

	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	            System.out.println("List after deleting element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Invalid index. Please enter a value from 0 to " + (colors.size() - 1));
	        }
	        scanner.close();
	    }
	}
