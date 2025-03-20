package org.example;

public class ReverseString {

    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null and empty cases
        }

        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
