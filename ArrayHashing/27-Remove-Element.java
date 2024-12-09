class Solution {
    public int removeElement(int[] nums, int val) {
    int k = 0; // Points to the next position to place valid elements

        // Loop through all elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Copy valid element to position `k`
                k++;
            }
        }
        
        // At this point, the first `k` elements are valid, and the rest can be ignored.
        return k;
    }
}