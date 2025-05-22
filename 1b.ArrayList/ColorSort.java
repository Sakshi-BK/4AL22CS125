/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        ArrayList<String> colors = new ArrayList<>();
		        colors.add("Violet");
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");

		        System.out.println("Before sorting: " + colors);

		        Collections.sort(colors);
		        System.out.println("After sorting: " + colors);
		    }

}
