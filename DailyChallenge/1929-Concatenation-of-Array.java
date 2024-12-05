class Solution {
    public int[] getConcatenation(int[] nums) {
   //creat a hash array of size of 2n
  int n =nums.length;
   int [] ans= new int[2*n];
   for(int i =0;i<n;i++){
    ans[i]=nums[i];  //first half
    ans[i+n]=nums[i];  //second half
   }
   return ans;

    }
}