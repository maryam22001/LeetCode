class Solution {
    public void reverseString(char[] s) {
        // Convert the char array to a String
        String string = new String(s);

        // Reverse the String using StringBuilder
        String reversedString = new StringBuilder(string).reverse().toString();

        // Convert the reversed String back to a char array and update the original array
        for (int i = 0; i < s.length; i++) {
            s[i] = reversedString.charAt(i);
        }
    }
}
