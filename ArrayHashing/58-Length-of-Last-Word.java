class Solution {
    public int lengthOfLastWord(String s) {
        // Split the string by spaces
        String[] words = s.split(\ \);

        // Get the number of words
        int n = words.length;

        // Handle the edge case where the input string might be empty or contain only spaces
        if (n == 0) {
            return 0;
        }

        // Find the last word (non-empty)
        int i = n - 1;
        while (i >= 0 && words[i].isEmpty()) {
            i--;
        }

        // If no non-empty word is found
        if (i < 0) {
            return 0;
        }

        // Get the last word
        String lastWord = words[i];

        // Get the length of the last word
        int lastWordLength = lastWord.length();

        // Return the length of the last word
        return lastWordLength;
    }
}
