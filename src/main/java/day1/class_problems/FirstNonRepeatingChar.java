package day1.class_problems;

import java.util.HashMap;

public class FirstNonRepeatingChar {

    static char findFirstNonRepeatingChar(String text) {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : text.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : text.toCharArray()) {
            if (frequency.get(c) == 1) return c;
        }

        return '\0'; // sentinel for "not found"
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc"};

        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            System.out.println("Input: \"" + input + "\"");
            if (result != '\0') {
                System.out.println("First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("No Non-Repeating Character Found");
            }
            System.out.println();
        }
    }
}