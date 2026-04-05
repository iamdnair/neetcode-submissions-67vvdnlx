class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sh = new HashSet<Integer>();
        for(int a: nums){
            if(sh.contains(a)){
                return true;
            }
            else{
                sh.add(a);
            }
        }
        return false;
        
    }
}