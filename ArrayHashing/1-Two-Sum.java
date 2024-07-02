
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException(\No solution\);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        int[] nums = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
         int target = sc.nextInt();

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + \ \ + result[1]);
    }
}

     