/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package String;

public class SubstringCounter {

	    public static int countOccurrences(String str, String sub) {
	        int count = 0, index = 0;
	        while ((index = str.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String main = "banana bandana banana";
	        String sub = "ana";
	        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(main, sub));
	    }
	}
