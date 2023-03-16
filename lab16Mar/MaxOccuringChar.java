package Assignment;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {
	public static void main(String[] args) {
        String inputString = "Hello, World!";
        char maxChar = getMaxOccurringChar(inputString);
        System.out.println("Max occurring character in the string \"" + inputString + "\" is '" + maxChar + "'");
    }

    public static char getMaxOccurringChar(String str) {
        // Create a hash map to store character counts
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

        // Iterate through the string and count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCounts.getOrDefault(ch, 0);
            charCounts.put(ch, count + 1);
        }

        // Find the character with the highest count
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }

        return maxChar;
    }
}
