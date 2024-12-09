class Solution {
    public String reverseVowels(String s) {
        // Convert the input string to a character array for easy manipulation
        char[] word = s.toCharArray();
        int start = 0;
        int end = word.length - 1;

        // Define a set of vowels for quick lookup
        String vowels = \aeiouAEIOU\;

        while (start < end) {
            // Move `start` forward until it points to a vowel
            /**
            String.valueOf(word[start]) converts the character at word[start] to a String, 
            so it can be checked against the vowels string.
            vowels.contains()> checks if the character is a vowel  */
            while (start < end && !vowels.contains(String.valueOf(word[start]))) {
                start++;
            }

            // Move `end` backward until it points to a vowel
            while (start < end && !vowels.contains(String.valueOf(word[end]))) {
                end--;
            }

            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            // Move the pointers closer to each other
            start++;
            end--;
        }

        // Convert the modified character array back to a string and return it
        return new String(word);
    }
}
