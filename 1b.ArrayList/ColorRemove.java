package ArrayList;
import java.util.ArrayList;
public class ColorRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ArrayList<String> colors = new ArrayList<>();
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");

		        System.out.println("Original list: " + colors);

		        // Remove 2nd element (index 1)
		        colors.remove(1);
		        System.out.println("After removing 2nd element: " + colors);

		        // Remove "Blue"
		        colors.remove("Blue");
		        System.out.println("After removing 'Blue': " + colors);
		    }
		


	}

