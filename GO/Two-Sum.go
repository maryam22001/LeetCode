func twoSum(nums []int, target int) []int {
    //iterate on both sides of the array 
    //check the target 
    //cant use same number twice 
    for i, left:=  range (nums){
        for j, right:=  range (nums){
            if left + right == target && i!=j{
                return []int{i,j}
            }

        }
    }
    
    return nil
}