/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package StringHandlingFunction2;

public class StringFunctions {

	    public static void main(String[] args) {
	        // String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = " World";
	        System.out.println("Original: '" + s1 + "', '" + s2 + "'");

	        // Length and Character Access
	        System.out.println("Length: " + s1.length());
	        System.out.println("Char at 2: " + s1.charAt(2));

	        // Comparison
	        System.out.println("Equals Hello: " + s1.equals("Hello"));
	        System.out.println("Ignore case: " + s1.equalsIgnoreCase("HELLO"));

	        // Searching
	        System.out.println("Contains 'lo': " + s1.contains("lo"));
	        System.out.println("Index of 'l': " + s1.indexOf('l'));

	        // Substring
	        System.out.println("Substring 1 to 3: " + s1.substring(1, 3));

	        // Modification
	        System.out.println("Replace 'l' with '*': " + s1.replace('l', '*'));
	        System.out.println("Uppercase: " + s1.toUpperCase());

	        // Whitespace
	        String s3 = "   AIET Java   ";
	        System.out.println("Trimmed: '" + s3.trim() + "'");

	        // Concatenation
	        System.out.println("Concat: " + s1.concat(s2));

	        // Splitting
	        String str = "Apple,Banana,Cherry";
	        String[] fruits = str.split(",");
	        System.out.println("Fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // StringBuilder
	        StringBuilder sb = new StringBuilder("StringBuilder ");
	        sb.append("Demo");
	        System.out.println(sb);

	        // Formatting
	        String student = "Riya";
	        int marks = 95;
	        System.out.println(String.format("Student: %s, Marks: %d", student, marks));

	        // Email Validation
	        String email = "riya123@aiet.edu.in";
	        System.out.println("Valid Email: " + email);
	        System.out.println("Contains '@': " + email.contains("@"));
	        System.out.println("Starts with 'riya': " + email.startsWith("riya"));
	        System.out.println("Ends with '.edu.in': " + email.endsWith(".edu.in"));
	    }
	}



