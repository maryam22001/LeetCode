/**class Solution {
    public String longestCommonPrefix(String[] strs) {
           if (strs == null || strs.length == 0) return \\;
           String prefix = strs[0];
             for (int i = 1; i < strs.length; i++) {
            // Update the prefix to match the current word
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return \\;
                
                   }

        }
              return prefix;
  
    }
}**/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null ||strs.length==0){return \\;}
        String prefix= strs[0];
           // Compare the prefix with each subsequent word
           //
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by comparing it with the current word
            /**The startsWith method is a part of the String class in Java. 
            It checks whether a given string starts with a specific prefix. */
            while (!strs[i].startsWith(prefix)) {

                // Reduce the prefix by removing the last character
                /**Method: substring(int beginIndex, int endIndex)
                  This method is a part of the String class in Java and is used to 
                    extract a portion of a string. */
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return \\;
                }
            }
        }
        
        return prefix; 
  
    }
}

