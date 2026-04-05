class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dup.containsKey(nums[i])){
               return true;
            }
            else{
               dup.put(nums[i],i); 
            }
        }
        return false;
    }
}