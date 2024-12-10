/*class Solution {
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
}*/
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
         
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
