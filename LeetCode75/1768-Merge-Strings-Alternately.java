class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        
        StringBuilder rearranged = new StringBuilder();

        // Merge the strings alternately
        int i = 0;
        int j = 0;

        // Loop through both strings until one is exhausted
        while (i < w1 && j < w2) {
            rearranged.append(word1.charAt(i++));
            rearranged.append(word2.charAt(j++));
        }

        // Add the remaining characters from either word1 or word2
        while (i < w1) {
            rearranged.append(word1.charAt(i++));
        }
        while (j < w2) {
            rearranged.append(word2.charAt(j++));
        }

        // Return the resulting string
        return rearranged.toString();
    }
}
