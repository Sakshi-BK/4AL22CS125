/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package String2;
import java.util.Random;

public class RandomString {
	 public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println("Random String: " + generateRandomString(10));
	    }
	}


