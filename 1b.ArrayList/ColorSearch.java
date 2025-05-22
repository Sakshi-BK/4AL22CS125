/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package ArrayList;
import java.util.ArrayList;

public class ColorSearch {

	public static void main(String[] args) {
		        ArrayList<String> colors = new ArrayList<>();
		        colors.add("Blue");
		        colors.add("Green");
		        colors.add("Red");
		        colors.add("Yellow");

		        System.out.println("Colors: " + colors);

		        if (colors.contains("Red")) {
		            System.out.println("The color 'Red' is available.");
		        } else {
		            System.out.println("The color 'Red' is not available.");
		        }
		    }
	

}
