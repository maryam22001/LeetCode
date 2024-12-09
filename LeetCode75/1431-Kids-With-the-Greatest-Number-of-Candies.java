class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int maxNum=Arrays.stream(candies) .max().orElseThrow();
      List <Boolean> result =new ArrayList<>();
       for (int i : candies) {
            // Check if the current candy count + extraCandies is at least maxNum
            result.add(i + extraCandies >= maxNum);
        }
         return result;
       }
}