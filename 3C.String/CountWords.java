package String2;

public class CountWords {
	public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "Java is a high-level programming language";
        System.out.println("Word Count: " + countWords(input));
    }
}


