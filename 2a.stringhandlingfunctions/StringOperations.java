/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package StringHandlingFunction;

public class StringOperations {


	    public static void main(String[] args) {
	        // String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = " World";
	        System.out.println("Original strings: '" + str1 + "' and '" + str2 + "'");

	        // Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // String Comparison
	        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // String Searching
	        System.out.println("str1 contains 'lo': " + str1.contains("lo"));
	        System.out.println("Index of 'l': " + str1.indexOf('l'));

	        // Substring Operations
	        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4));

	        // String Modification
	        System.out.println("Replace 'l' with 'x': " + str1.replace('l', 'x'));
	        System.out.println("Uppercase: " + str1.toUpperCase());

	        // Whitespace Handling
	        String spaced = "  Java Programming  ";
	        System.out.println("Before trim: '" + spaced + "'");
	        System.out.println("After trim: '" + spaced.trim() + "'");

	        // String Concatenation
	        String combined = str1.concat(str2);
	        System.out.println("Concatenated: " + combined);

	        // String Splitting
	        String data = "Red,Green,Blue";
	        String[] parts = data.split(",");
	        System.out.println("Split colors:");
	        for (String color : parts) {
	            System.out.println(color);
	        }

	        // StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" Moodbidri");
	        System.out.println("StringBuilder result: " + sb);

	        // String Formatting
	        String name = "Sakshi";
	        int age = 21;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // Email Validation
	        String email = "sakshi@example.com";
	        System.out.println("Validating email: " + email);
	        System.out.println("Contains '@': " + email.contains("@"));
	        System.out.println("Starts with 'sakshi': " + email.startsWith("sakshi"));
	        System.out.println("Ends with '.com': " + email.endsWith(".com"));
	    }
	}


