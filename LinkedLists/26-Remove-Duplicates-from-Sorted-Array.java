class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int k = 1; // Pointer for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current element is unique
                nums[k] = nums[i]; // Move the unique element to the next position
                k++; // Increment the pointer for unique elements
            }
        }
        return k; // The length of the modified array
    }
}
