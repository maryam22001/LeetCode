func containsDuplicate(nums []int) bool {
    Map := make (map[int]int);
    for _,val:= range (nums){
        if _, isFound := Map[val] ; isFound{
            return true ;
        }
        Map[val]=1
    }
    return false 
}