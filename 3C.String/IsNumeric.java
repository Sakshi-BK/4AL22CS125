package String2;

public class IsNumeric {
	public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "123a56";
        System.out.println(input1 + " is numeric: " + isNumeric(input1));
        System.out.println(input2 + " is numeric: " + isNumeric(input2));
    }
}

