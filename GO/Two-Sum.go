func twoSum(nums []int, target int) []int {
    //create a hash map
    //iterate through the numbers
    //add the numbers comblement to the hash map 
    Map := make(map[int]int)
    for i , num := range (nums){
          _, ok := Map[num]
          if ok {
            return [] int{i,Map[num]}
          }
          Map[target-num] =i
    }
    
    return nil
}