package Assignment;

public class ReverseString {
	public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseWords(inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseWords(String str) {
        String[] words = str.split("\\s");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }
}
