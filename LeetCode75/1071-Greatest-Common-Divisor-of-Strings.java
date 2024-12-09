class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Find the greatest common divisor of the lengths of str1 and str2
        int len1 = str1.length();
        int len2 = str2.length();
        
       //Loop through possible substring lengths, starting from the largest
       /*Looping from largest to smallest: The loop now starts from the smallest of len1 and len2 and 
         decreases the length (i--) until it reaches 1.
         This ensures that the longest valid substring (if any) is found
         first. */
        for (int i = Math.min(len1, len2); i >= 1; i--) {
            String subStr = str1.substring(0, i);  // Take the prefix of length i
            
            // Check if this substring repeats correctly to form both str1 and str2
            if (len1 % i == 0 && len2 % i == 0 && str1.equals(subStr.repeat(len1 / i)) && str2.equals(subStr.repeat(len2 / i))) {
                return subStr;  // If it divides both str1 and str2, return it
            }
        }
        
        // If no common prefix is found, return an empty string
        return "";
    }
}
