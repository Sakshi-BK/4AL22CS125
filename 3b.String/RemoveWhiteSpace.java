package String;

public class RemoveWhiteSpace {
	 public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "Java   Programming\tis\nfun";
	        System.out.println("Original: '" + input + "'");
	        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
	    }

}
