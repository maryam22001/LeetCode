class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> majority_elemnt= new HashMap<>();
        int maxcount =0;
        int MajElemt=-1;

        for(int element :nums ){
            int count = majority_elemnt.getOrDefault(element, 0) + 1;
            majority_elemnt.put(element,count);
                 if(count>maxcount){ 
                    maxcount=count;
                   MajElemt=element;
                 }
        }
      
        return  MajElemt;
    }
}