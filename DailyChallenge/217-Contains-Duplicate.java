
/*
//First Approach 
import java.util.HashSet;
import java.util.Scanner;
public class  Solution {
  public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
        int[] nums = new int[1000001];
     for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
      boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(\Contains duplicate: \ + containsDuplicate); 
    }
      


    public static boolean containsDuplicate(int[] nums) { 
        HashSet<Integer> hashset= new HashSet<>();
        
        for(int i=0; i<nums.length;i++)
        {
             
            if (hashset.contains(nums[i]))
            return true;
            else
            hashset.add(nums[i]);
            
        }
        return false;
        
        
    }
}*/
//Second Approach

public class  Solution {
     public static boolean containsDuplicate(int[] nums) { 
 HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, it's a duplicate
            if (set.contains(num)) {
                return true;
            }
            // Add the current number to the set
            set.add(num);
        }
        
        // If no duplicates were found
        return false;
     }
}
    
    
