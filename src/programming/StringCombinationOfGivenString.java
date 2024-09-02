package programming;

public class StringCombinationOfGivenString {
	 public static void main(String[] args) {
	        String s = "abc";
	        int desiredLength = 3;

	        generateCombinations("", s, desiredLength);
	    }

	    private static void generateCombinations(String prefix, String remaining, int length) {
	        if (length == 0) {
	            System.out.println(prefix);
	            return;
	        }

	        for (int i = 0; i < remaining.length(); i++) {
	            char current = remaining.charAt(i);
	            String newPrefix = prefix + current;
	            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
	            generateCombinations(newPrefix, newRemaining, length - 1);
	        }
	    }
}
