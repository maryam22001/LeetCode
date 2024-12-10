class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase and remove non-alphabetic characters
     String plain = s.toLowerCase().replaceAll(\[^a-z0-9]\, \\);
        
        // Build the reversed string
      /*  StringBuilder reverseBuilder = new StringBuilder();
        for (int i = plain.length() - 1; i >= 0; i--) {
            reverseBuilder.append(plain.charAt(i));
        }
        String reverse = reverseBuilder.toString();*/
        String reverse = new StringBuilder(plain).reverse().toString();

        
        // Compare the original (plain) string with the reversed string
        return plain.equals(reverse);
    }
}