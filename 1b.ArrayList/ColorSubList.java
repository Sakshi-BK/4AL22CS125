/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
	
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Orange");
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);

	        List<String> subList = colors.subList(0, 2); // 1st and 2nd elements (index 0 and 1)
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subList);
	    }
	}


