class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*Use a HashMap to store the numbers in the current window and their indices.
As the sliding window moves, add the new element to the map.
Check if the complement (i.e., target - currentNum) exists in the map.
If found, return the indices of the two numbers.
Remove the oldest element when the window size exceeds the allowed range. */
        int windowSize=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        //sliding window 
        for (int i=0; i<nums.length;i++){
            int currentNum=nums[i];
            int complement=target-currentNum;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};

            }
              map.put(currentNum, i);

        }
        return new int[]{};

        
    }
}