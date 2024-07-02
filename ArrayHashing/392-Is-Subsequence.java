class Solution {
    public boolean isSubsequence(String s, String t) {
      int sPointer = 0;
        int tPointer = 0;

        // Traverse through t to find the subsequence
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        // If sPointer has reached the end of s, it means all characters of s were found in t in the correct order
        return sPointer == s.length();
    }

   
}