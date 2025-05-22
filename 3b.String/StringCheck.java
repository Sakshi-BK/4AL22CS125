*//*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
package String;

public class StringCheck {

	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    public static void main(String[] args) {
	        String s1 = "   ";
	        String s2 = null;
	        String s3 = "AIET";

	        System.out.println("s1 is null or empty: " + isNullOrEmpty(s1));
	        System.out.println("s2 is null or empty: " + isNullOrEmpty(s2));
	        System.out.println("s3 is null or empty: " + isNullOrEmpty(s3));
	    }
	}


