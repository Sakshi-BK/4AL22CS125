/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package String;

public class PlaindromeCheck {
	 public static boolean isPalindrome(String str) {
	        if (str == null) return false;
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String input = "A man, a plan, a canal, Panama!";
	        System.out.println("Is palindrome: " + isPalindrome(input));
	    }

}
